package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.SanPhamDAO;
import model.KhachHang;
import model.SanPham;
import model.TacGia;
import model.TheLoai;

/**
 * Servlet implementation class ThemSanPhamConTroller
 */
@WebServlet("/them-san-pham")
public class ThemSanPhamConTroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemSanPhamConTroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
//		request.setCharacterEncoding("UTF-8");
//		String tenSanPham=request.getParameter("tenSanPham");
//		String anh=request.getParameter("anh");
//		String giaBan=request.getParameter("giaBan");
//		String moTa=request.getParameter("moTa");
//		String theLoai=request.getParameter("theLoai");
//		HttpSession session=request.getSession();
//		KhachHang a=(KhachHang) session.getAttribute("khachHang");
//		
//		//lấy ra mã khách hàng từ sản phẩm
//		String maKhachHang=a.getMaKhachHang();
//		Random rd = new Random();
//		String maSanPham= System.currentTimeMillis() + rd.nextInt(1000) + "";
//		
//		
//		SanPham sp=new SanPham(maSanPham, tenSanPham, new TacGia(), 0, serialVersionUID, serialVersionUID,
//				serialVersionUID, 0, new TheLoai(), "", moTa, anh, a);
//		//SanPham sp =new SanPham(maSanPham, tenSanPham, null, 0, serialVersionUID, serialVersionUID, serialVersionUID, 0, null, maSanPham, moTa,anh,a);
//		SanPhamDAO themsp=new SanPhamDAO();
//		
//		themsp.insert(sp);
//		response.sendRedirect("crudsan-pham");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String tenSanPham=request.getParameter("tenSanPham");
		String anh=request.getParameter("anh");
		String giaBan=request.getParameter("giaBan");
		String moTa=request.getParameter("moTa");
		String theLoai=request.getParameter("theLoai");
		HttpSession session=request.getSession();
		KhachHang a=(KhachHang) session.getAttribute("khachHang");
		TheLoai mTheLoai = new TheLoai();
		mTheLoai.setMaTheLoai(theLoai);
		
		TacGia maTacGia=new  TacGia();
		maTacGia.setMaTacGia("1");
		//lấy ra mã khách hàng từ sản phẩm
		String maKhachHang=a.getMaKhachHang();
		Random rd = new Random();
		String maSanPham= System.currentTimeMillis() + rd.nextInt(1000) + "";
		
		SanPham sp = new SanPham(maSanPham, tenSanPham, null, 0, serialVersionUID, serialVersionUID, serialVersionUID, 0, mTheLoai, maSanPham, moTa, anh, a);
		sp.setGiaBan(Double.parseDouble(giaBan));
//		sp.setTacGia(new TacGia());
		sp.setTacGia(maTacGia);
//		SanPham sp=new SanPham(maSanPham, tenSanPham, new TacGia(), 0, serialVersionUID, serialVersionUID,
//				serialVersionUID, 0, mTheLoai, "", moTa, anh, a);
		//SanPham sp =new SanPham(maSanPham, tenSanPham, null, 0, serialVersionUID, serialVersionUID, serialVersionUID, 0, null, maSanPham, moTa,anh,a);
		SanPhamDAO themsp=new SanPhamDAO();
		
		themsp.insert(sp);
		response.sendRedirect("crudsan-pham");
	}

}
