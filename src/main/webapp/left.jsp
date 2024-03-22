<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-lg-3">
	<div class="list-group ">
		<c:forEach items="${listC}" var="o">
			<a href="category?maTheLoai=${o.maTheLoai }" class=" list-group-item list-group-item-action ">
				${o.tenTheLoai} </a>

			
		</c:forEach>


	</div>
	 <div class="card bg-light mb-3">
                        <div class="card-header bg-success text-white text-uppercase" >Last product</div>
                        <div class="card-body">
                            <img class="img-fluid" src="img/product/${p.anh}" />
                            <h5 class="card-title">${p.tenSanPham}</h5>
                            <p class="card-text">${p.moTa}</p>
                            <p class="btn btn-danger">${p.giaBan} $</p>
                        </div>
                    </div>
                    
</div>