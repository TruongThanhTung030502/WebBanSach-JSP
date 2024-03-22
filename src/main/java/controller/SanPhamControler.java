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
 * Servlet implementation class SanPhamControler
 */
@WebServlet("/san-pham")
public class SanPhamControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SanPhamControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html;charset=UTF-8");
//		request.setCharacterEncoding("UTF-8");
		SanPhamDAO spDao=new SanPhamDAO();
        ArrayList<SanPham> sp=spDao.selectAllSanPham();
        SanPham last=spDao.getLast();
        
        //lấy danh sách thể loại
	    TheLoaiDAO tlTheLoai=new TheLoaiDAO();
		ArrayList<TheLoai> ListTheLoai=tlTheLoai.selectAllTheLoai();
	   
	    
	    
	    //b2:set data lên jsp
	  
	    request.setAttribute("listC",  ListTheLoai);
	    request.setAttribute("listP", sp);
	    request.setAttribute("p", last);
	    request.getRequestDispatcher("/index.jsp").forward(request, response);

		//setdataleenvoijso
	}
	public void getSanPham(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//b1 lấy dữ liệu từ DAO SanPham
		

	}

}
