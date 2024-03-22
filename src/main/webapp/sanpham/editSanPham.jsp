

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
       
<body>

 /* <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
          <div class="modal-dialog">
                <div class="modal-content">
                    <form action="eidt-san-pham" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Them San Pham</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
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
                                <label>Mô tảa</label>
                                <textarea  name="moTa" class="form-control" required>${detail.moTa}</textarea>
                            </div>
                            <div class="form-group">
                                <label>Category</label>
                                <select name="theLoai" class="form-select" aria-label="Default select example">
                                    <c:forEach items="${listC}" var="o">
                                        <option value="${o.maTheLoai}">${o.tenTheLoai}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <!-- Delete Modal HTML --> */
        
</body>
</html>