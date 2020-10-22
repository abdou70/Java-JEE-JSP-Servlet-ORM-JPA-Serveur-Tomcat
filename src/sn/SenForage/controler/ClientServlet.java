package sn.SenForage.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.SenForage.dao.ClientImpl;
import sn.SenForage.dao.IClient;
import sn.SenForage.dao.IVillage;
import sn.SenForage.dao.VillageImpl;
import sn.SenForage.entities.Client;
import sn.SenForage.entities.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IClient clientdao;
     private IVillage villagedao; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		clientdao = new ClientImpl();
		villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		 List<Client> clients = clientdao.list();
		request.setAttribute("clients", clients);
		request.setAttribute("villages", clientdao.listVillages());
		 request.getRequestDispatcher("WEB-INF/Client.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 
		 String nom = request.getParameter("nom").toString();
		 String adresse = request.getParameter("adresse").toString();
		 String telephone = request.getParameter("telephone").toString();
		 int id_village = Integer.parseInt(request.getParameter("id_village"));
		 Village village = new Village();
		 village=villagedao.getVillage(id_village);
		 
		 Client client= new Client();
		 client.setNom(nom);
		 client.setAdresse(adresse);
		 client.setTelephone(telephone);
		 client.setVillage(village);
		 
		 clientdao.add(client); 
		 doGet(request, response);
	}

}
