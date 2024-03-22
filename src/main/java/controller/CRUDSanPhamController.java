package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import database.SanPhamDAO;
import database.TheLoaiDAO;
import model.KhachHang;
import model.SanPham;
import model.TheLoai;

/**
 * Servlet implementation class CRUDSanPhamController
 */
@WebServlet("/crudsan-pham")
public class CRUDSanPhamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDSanPhamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		KhachHang a=(KhachHang) session.getAttribute("khachHang");
		//lấy ra mã khách hàng từ sản phẩm
		String maKhachHang=a.getMaKhachHang();
		
		//Dao từ sản phẩm để selectSanPhamByMaKhachHang
		 SanPhamDAO crudSanPham=new SanPhamDAO();
		 ArrayList<SanPham> list=crudSanPham.selectSanPhamByMaKhachHang(maKhachHang);
         
		 
		 //deletesan pham;
		 String DLsanPham=request.getParameter("DLSanPham");
		 crudSanPham.deleteSanPham(DLsanPham);
		 
		//lấy danh sách thể loại
		    TheLoaiDAO tlTheLoai=new TheLoaiDAO();
			ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
		 
//        //add sản phẩm 
//			String tenSanPham=request.getParameter("tenSanPham");
//			String anh=request.getParameter("anh");
//			String giaBan=request.getParameter("giaBan");
//			String moTa=request.getParameter("moTa");
//			String theLoai=request.getParameter("theLoai");
//			
//			
//			crudSanPham.insertSanPham(DLsanPham, tenSanPham, giaBan, 0, null, null,
//					null, 0, theLoai, theLoai, moTa, anh, maKhachHang);
			
			
			//Edit San Pha,;
//			String editSP=request.getParameter("EitSanPham");
//			SanPham p=crudSanPham.selectSanPhamByID(editSP);
//			
//			request.setAttribute("",p);
		 request.setAttribute("listP", list);
		    request.setAttribute("listC",  ListTheLoai);
		 request.getRequestDispatcher("sanpham/sanpham.jsp").forward(request, response);
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
