package sn.SenForage.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.IVillage;
import sn.SenForage.dao.VillageImpl;
import sn.SenForage.entities.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet("/VillageServlet")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private IVillage villagedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		List<Village> villages = villagedao.list();
		request.setAttribute("villages", villages);
		request.getRequestDispatcher("WEB-INF/village.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nomvillage").toString();
		
		Village village = new Village();
		village.setNom(nom);
		Village v = villagedao.add(village);
		doGet(request,response);
		//request.getRequestDispatcher("WEB-INF/village.jsp").forward(request, response);
	}

}
