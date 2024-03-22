<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="css/edit.css" rel="stylesheet" type="text/css" /> -->
<style>
  .modal-header {
    text-align: center;
  }
  
  .modal-title {
    display: inline-block;
  }
  
  .modal-body {
    display: flex;
    flex-direction: column;
    align-items: center;
  }

  .form-group {
    width: 50%;
    margin-bottom: 10px;
    text-align: center;
  }

  .form-group label {
    margin-bottom: 5px;
  }

  .form-group input,
  .form-group select,
  .form-group textarea {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }

  .modal-footer {
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .modal-footer input {
    margin-left: 10px;
  }
</style>
</head>

<body>

  <div id="editEmployeeModal" class="modal fade">
    <div class="modal-dialog">
      <div class="modal-content">
        <form action="edit-san-pham" method="post">
          <div class="modal-header">						
            <h4 class="modal-title">Edit Sản Phẩm   <button  type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button></h4>
          
          </div>
          <div class="modal-body">	
            <div class="form-group">
              <label>Mã Sản Phẩm</label>
              <input value="${detail.maSanPham}" name="maSanPham" type="text" class="form-control" readonly="" required>
            </div>				
            <div class="form-group">
              <label>Tên Sách</label>
              <input value="${detail.tenSanPham}" name="tenSanPham" type="text" class="form-control" required>
            </div>
            <div class="form-group">
              <label>Ảnh</label>
              <input value="${detail.anh}" name="anh" type="text" class="form-control" required>
            </div>
            <div class="form-group">
              <label>Giá Bán</label>
              <input value="${detail.giaBan }" name="giaBan" type="text" class="form-control" required>
            </div>
            <div class="form-group">
              <label>Mô tảaa</label>
              <textarea  name="moTa" class="form-control" required>${detail.moTa}</textarea>
            </div>
            <div class="form-group">
              <label>Category</label>
              <select name="theLoai" class="form-select" aria-label="Default select example">
                <c:forEach items="${listCC}" var="o">
                  <option value="${o.maTheLoai}">${o.tenTheLoai}</option>
                </c:forEach>
              </select>
            </div>
          </div>
          <div class="modal-footer" >
            <input  type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
            <input type="submit" class="btn btn-info" value="Save">
          </div>
        </form>
      </div>
    </div>
  </div>
</body>
</html>