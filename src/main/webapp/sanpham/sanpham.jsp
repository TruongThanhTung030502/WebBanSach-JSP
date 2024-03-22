

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap CRUD Data Table for Database with Modal Form</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>

<link href="css/manager.css" rel="stylesheet" type="text/css" />


<style>
img {
	width: 200px;
	height: 120px;
}
</style>
<body>

	<div class="container">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
						<h2>
							Manage <b>Product</b>
						</h2>
					</div>
					<div class="col-sm-6">
						<a href="#addEmployeeModall" class="btn btn-success"
							data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>ThêmSách</span>
						</a> <a href="#deleteEmployeeModal" class="btn btn-danger"
							data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Xóa</span></a>
					</div>
				</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th><span class="custom-checkbox"> <input
								type="checkbox" id="selectAll"> <label for="selectAll"></label>
						</span></th>
						<th>ID</th>
						<th>Name</th>
						<th>Image</th>
						<th>Price</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listP}" var="o">
						<tr>
							<td><span class="custom-checkbox"> <input
									type="checkbox" id="checkbox1" name="options[]" value="1">
									<label for="checkbox1"></label>
							</span></td>
							<td>${o.maSanPham}</td>
							<td>${o.tenSanPham}</td>
							<td><img src="img/product/${o.anh}"></td>
							<td>${o.giaBan}$</td>
							<td><a href="load-san-pham?LoadSanPham=${o.maSanPham }"
								class="edit" data-toggle="modal"><i class="material-icons"
									data-toggle="tooltip" title="Edit">&#xE254;</i></a> <a
								href="crudsan-pham?DLSanPham=${o.maSanPham }" class="delete"
								data-toggle="modal"><i class="material-icons"
									data-toggle="tooltip" title="Delete">&#xE872;</i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="clearfix">
				<div class="hint-text">
					Showing <b>5</b> out of <b>25</b> entries
				</div>
				<ul class="pagination">
					<li class="page-item disabled"><a href="#">Previous</a></li>
					<li class="page-item"><a href="#" class="page-link">1</a></li>
					<li class="page-item"><a href="#" class="page-link">2</a></li>
					<li class="page-item active"><a href="#" class="page-link">3</a></li>
					<li class="page-item"><a href="#" class="page-link">4</a></li>
					<li class="page-item"><a href="#" class="page-link">5</a></li>
					<li class="page-item"><a href="#" class="page-link">Next</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<!-- Thêm -->
	<div id="addEmployeeModall" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="them-san-pham" method="post">
					<div class="modal-header">
						<h4 class="modal-title">Them San Pham</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label>Tên Sách</label> <input name="tenSanPham" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Ảnh</label> <input name="anh" type="text"
								class="form-control" required>
						</div>
						<div class="form-group">
							<label>Giá Bán</label> <input name="giaBan" type="text"
								class="form-control" required>
						</div>

						<div class="form-group">
							<label>Mô tảa</label>
							<textarea name="moTa" class="form-control" required></textarea>
						</div>
						<div class="form-group">
							<label>Category</label> <select name="theLoai"
								class="form-select" aria-label="Default select example">
								<c:forEach items="${listC}" var="o">
									<option value="${o.maTheLoai}">${o.tenTheLoai}</option>
								</c:forEach>
							</select>
						</div>

					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-success" value="Add">
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->

	<body>
	<div id="editEmployeeModal" class="modal fade">
    <div class="modal-dialog">
      <div class="modal-content">
        <form action="edit-san-pham" method="post">
          <div class="modal-header">						
            <h4 class="modal-title">Thêm Sản Phẩm</h4>
            <button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
          </div>
          <div class="modal-body">	
            <div class="form-group">
              <label>Mã Sản Phẩm</label>
              <input value="${detail.maSanPham}" name="maSanPham"
								type="text" class="form-control" readonly="" required>
            </div>				
            <div class="form-group">
              <label>Tên Sách</label>
              <input value="${detail.tenSanPham}" name="tenSanPham"
								type="text" class="form-control" required>
            </div>
            <div class="form-group">
              <label>Ảnh</label>
              <input value="${detail.anh}" name="anh" type="text"
								class="form-control" required>
            </div>
            <div class="form-group">
              <label>Giá Bán</label>
              <input value="${detail.giaBan }" name="giaBan" type="text"
								class="form-control" required>
            </div>
            <div class="form-group">
              <label>Mô tảaa</label>
              <textarea name="moTa" class="form-control" required>${detail.moTa}</textarea>
            </div>
            <div class="form-group">
              <label>Category</label>
              <select name="theLoai" class="form-select"
								aria-label="Default select example">
                <c:forEach items="${listCC}" var="o">
                  <option value="${o.maTheLoai}">${o.tenTheLoai}</option>
                </c:forEach>
              </select>
            </div>
          </div>
          <div class="modal-footer">
            <input type="button" class="btn btn-default"
							data-dismiss="modal" value="Cancel">
            <input type="submit" class="btn btn-info" value="Save">
          </div>
        </form>
      </div>
    </div>
  </div><!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<form>
					<div class="modal-header">
						<h4 class="modal-title">Delete Product</h4>
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">
						<p>Are you sure you want to delete these Records?</p>
						<p class="text-warning">
							<small>This action cannot be undone.</small>
						</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal"
							value="Cancel"> <input type="submit"
							class="btn btn-danger" value="Delete">
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/manager.js" type="text/javascript"></script>

	<script>
		
	</script>
	<jsp:include page="../footer.jsp" />
</body>


</html>