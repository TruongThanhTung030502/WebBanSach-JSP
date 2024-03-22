package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class TimKiemController
 */
@WebServlet("/tim-kiem")
public class TimKiemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimKiemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String txtTimKiem=request.getParameter("timKiem");
		 TheLoaiDAO tlTheLoai=new TheLoaiDAO();
		 SanPhamDAO spDao=new SanPhamDAO();
		ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
		SanPhamDAO dao=new SanPhamDAO();
		 SanPham last=spDao.getLast();
		ArrayList<SanPham> list=dao.selectSanPhamByName(txtTimKiem);
		
		request.setAttribute("listP", list);
		request.setAttribute("listC",  ListTheLoai);
		request.setAttribute("p", last);
		request.setAttribute("txtS", txtTimKiem);
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
