package sn.SenForage.dao;

import java.util.List;

import sn.SenForage.entities.Client;
import sn.SenForage.entities.Village;

public interface IClient {
	public Client add(Client client);
	public List<Client> list();
	public List<Village> listVillages();
    public int Village();

}
