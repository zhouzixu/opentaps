<#--
 * Copyright (c) 2007 - 2009 Open Source Strategies, Inc.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Honest Public License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Honest Public License for more details.
 * 
 * You should have received a copy of the Honest Public License
 * along with this program; if not, write to Funambol,
 * 643 Bair Island Road, Suite 305 - Redwood City, CA 94063, USA
-->

<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl"/>

<form name="findShipmentReceipt" method="post" action="<@ofbizUrl>findShipmentReceipt</@ofbizUrl>">
  <table>
    <@inputLookupRow title=uiLabelMap.OrderPurchaseOrder name="orderId" lookup="LookupPurchaseOrder" form="findShipmentReceipt"/>
    <@inputAutoCompleteProductRow name="productId" title=uiLabelMap.ProductProductId />
    <@inputIndicatorRow name="showAllocatedReceiptsOnly" title=uiLabelMap.WarehouseShowReceiptsWithAllocatedOrdersOnly required=true default="Y" titleClass="tableheadtext"/>
    <@inputButtonRow title=uiLabelMap.CommonFind />
  </table>
</form>

<#if receiptsAndBackOrders?has_content>
<div style="screenlet-body">
<@paginate name="shipmentReceiptsList" list=receiptsAndBackOrders>
<#noparse>
   <div class="subSectionHeader"><div class="subMenuBar"><@paginationNavContext/></div></div>
   <table class="listTable">
       <tr class="listTableHeader">
          <@headerCell title=uiLabelMap.ProductDateReceived orderBy="datetimeReceived"/>
          <@headerCell title=uiLabelMap.OrderPurchaseOrder orderBy="orderId"/>
          <@headerCell title=uiLabelMap.ProductProduct orderBy="productId"/>
          <td>${uiLabelMap.ProductQtyReceived}</td>
          <td>${uiLabelMap.WarehouseAllocatedToOrders}</td>
          <td>${uiLabelMap.WarehouseReceivedByUserLogin}</td>
       </tr>
   <#assign index = 0/>
   <#list pageRows as row >
   <#if ((parameters.showBackOrdersOnly?default("N") == "Y") && (row.fulfilledReservations?has_content)) ||
      (parameters.showBackOrdersOnly?default("N") == "N")>
       <tr>
          <td class="tabletext" align="left">${getLocalizedDate(row.datetimeReceived)}</td>
          <td class="tabletext" align="left">${row.orderId?default("")}</td>
          <td class="tabletext" align="left">${row.internalName?default("")} (${row.productId?default("")})</td>
          <td class="tabletext" align="left"><#assign netReceived = row.quantityAccepted?default(0) - row.quantityRejected?default(0)/>${netReceived}</td>
          <td class="tabletext" align="left">
           <#if row.fulfilledReservations?has_content>
            <#list row.fulfilledReservations as fulfilledReservation>
            ${fulfilledReservation} [<a href="<@ofbizUrl>PackOrder?orderId=${fulfilledReservation}</@ofbizUrl>">${uiLabelMap.WarehousePackOrder}</a>]<br/>
            </#list>
           </#if>
          </td>
          <td class="tabletext" align="left">${row.receivedByUserLoginId}</td>
       </tr>
       </#if>
   </#list>
   </table>
</#noparse>
</@paginate>
</div>
</#if>
