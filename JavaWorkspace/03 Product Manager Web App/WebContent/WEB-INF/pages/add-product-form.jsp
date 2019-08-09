<%@ include file="header.txt" %>

<form action="./add-product" method ="POST">
	
	<div class="form-group row">
		<label class="col-md-4">Product Name</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="productName">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">Quantity Per Unit</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="quantityPerUnit">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">unitPrice</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="unitPrice">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">units_in_stock</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="units_in_stock">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">units_on_order</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="units_on_order">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">reorderLevel</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="reorderLevel">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4">discontinued</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="discontinued">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-md-4"></label>
		<div class="col-md-8">
			<button class="btn btn-primary">Add product</button>
		</div>
	</div>

</form>

<%@ include file="footer.txt" %>


