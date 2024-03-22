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
 * Servlet implementation class CategoryControler
 */
@WebServlet("/category")
public class CategoryControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maTheLoai= request.getParameter("maTheLoai");
		
		 SanPhamDAO spDao=new SanPhamDAO();
		    TheLoaiDAO tlTheLoai=new TheLoaiDAO();
			ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
		    ArrayList<SanPham> sp=spDao.selectAllSanPham();
		    SanPham last=spDao.getLast();
		//đã lấy được mã thể loại về
		
		SanPhamDAO dao=new SanPhamDAO();
		ArrayList<SanPham> list=dao.selectSanPhamByMaTheLoai(maTheLoai);
		
		
		request.setAttribute("listP", list);
		request.setAttribute("listC",  ListTheLoai);
	    request.setAttribute("p", last);
	    request.setAttribute("tag",maTheLoai );
		request.getRequestDispatcher("index.jsp").forward(request, response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
