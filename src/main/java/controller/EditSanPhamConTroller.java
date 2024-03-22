package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.SanPhamDAO;
import database.TheLoaiDAO;
import model.KhachHang;
import model.SanPham;
import model.TacGia;
import model.TheLoai;

/**
 * Servlet implementation class EditSanPhamConTroller
 */
@WebServlet("/edit-san-pham")
public class EditSanPhamConTroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditSanPhamConTroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String maSanPham=request.getParameter("maSanPham");
		String tenSanPham=request.getParameter("tenSanPham");
		String anh=request.getParameter("anh");
		String giaBan=request.getParameter("giaBan");
		String moTa=request.getParameter("moTa");
		String theLoai=request.getParameter("theLoai");
		HttpSession session=request.getSession();
		KhachHang a=(KhachHang) session.getAttribute("khachHang");
		
//		SanPham sp=new SanPham(maSanPham, tenSanPham, new TacGia(), 0, serialVersionUID, serialVersionUID,
//				serialVersionUID, 0, new TheLoai(), "", moTa, anh, a);
		SanPham sp=new SanPham(maSanPham, tenSanPham,  new TacGia(), 0, serialVersionUID, serialVersionUID, serialVersionUID, 0,new TheLoai() , theLoai, moTa);
		sp.setGiaBan(Double.parseDouble(giaBan));
		sp.setAnh(anh);
		SanPhamDAO updateSP=new SanPhamDAO();
	    updateSP.update(sp);
	    response.sendRedirect("crudsan-pham");	}

}
