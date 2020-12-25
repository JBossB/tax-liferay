<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>
<portlet:actionURL name="view" var="viewURL"></portlet:actionURL>
<%
	String output =(String)request.getAttribute("output");
%>
<div  class="container center" id="container-data">
	<form id="form-view" action="${viewURL}" method="post">
		<div class="row" style="margin-bottom:15px;">
			<div class="col-md-6">
				<select class="form-control" id="shopBasketId" name="<portlet:namespace/>shopBasketId">
					<option value="1">Shop Basket 1</option>
					<option value="2">Shop Basket 2</option>
					<option value="3">Shop Basket 3</option>
				</select>
			</div>
		</div>
	 	<div class="row" style="margin-bottom:15px">
			<div class="col-md-6">
				<button type="button" class="btn btn-primary btn-md"  onclick="view();"><i class="glyphicon glyphicon-search"></i> View</button>
			</div>
			<div class="col-md-6">
				<%=(null!=output?output:"no data") %>
			</div>
		</div>
	</form>
</div>

<script>
function view(){
	$('#form-view').submit();
}
</script>
    
    

