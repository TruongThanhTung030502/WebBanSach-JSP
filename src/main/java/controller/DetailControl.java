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
 * Servlet implementation class DetailControl
 */
@WebServlet("/detail")
public class DetailControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maSanPham=request.getParameter("maSanPham");
		SanPhamDAO dao=new SanPhamDAO();
		SanPham p=dao.selectSanPhamByID(maSanPham);
		TheLoaiDAO tlTheLoai=new TheLoaiDAO();
		ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
		SanPhamDAO spDao=new SanPhamDAO();
        
        SanPham last=spDao.getLast();
        
       
		request.setAttribute("detail", p);
		 request.setAttribute("listC", ListTheLoai);
		    request.setAttribute("p", last);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
