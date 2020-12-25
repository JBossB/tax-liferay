<%@ include file="/init.jsp" %>
<portlet:actionURL name="buscar" var="buscarURL"></portlet:actionURL>

<div  class="container center" id="container-data">
	<form id="form-buscar" action="${buscarURL}" method="post">
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
				<button type="button" class="btn btn-primary btn-md"  onclick="buscar();"><i class="glyphicon glyphicon-search"></i> Buscar</button>
			</div>
		</div>
		</div>
	</form>
</div>

<script>
function buscar(){
	$('#form-buscar').submit();
}
</script>
    
    

