package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.SanPhamDAO;
import database.TheLoaiDAO;
import model.SanPham;
import model.TheLoai;

/**
 * Servlet implementation class LoadSanPhamConTroller
 */
@WebServlet("/load-san-pham")
public class LoadSanPhamConTroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadSanPhamConTroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("LoadSanPham");
	    SanPhamDAO loadSP=new SanPhamDAO();
	    SanPham p=loadSP.selectSanPhamByID(id);
	    
	  //lấy danh sách thể loại
	    TheLoaiDAO tlTheLoai=new TheLoaiDAO();
		ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
	   

	    request.setAttribute("detail", p);
	    request.setAttribute("listCC",  ListTheLoai);
	    request.getRequestDispatcher("sanpham/NewFile.jsp").forward(request, response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
