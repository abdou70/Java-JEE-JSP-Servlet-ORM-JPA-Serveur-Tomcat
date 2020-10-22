package sn.SenForage.dao;

import java.util.List;

import sn.SenForage.entities.Village;

public interface IVillage {
	
	public Village add(Village villlage);
	public List<Village> list();
	public Village getVillage(int idV);

}
