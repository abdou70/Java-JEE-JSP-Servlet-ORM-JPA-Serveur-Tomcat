package sn.SenForage.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Village implements Serializable{
	     
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;
	    @Column(length=100)
        private String nom;
	    @OneToMany(mappedBy="village",fetch =FetchType.LAZY, targetEntity=Client.class)
	    private Collection<Client> clients;
	    
	    
		public Village() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Village(int id, String nom) {
			super();
			this.id = id;
			this.nom = nom;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "----ID:"+this.id;
		}
        
}
