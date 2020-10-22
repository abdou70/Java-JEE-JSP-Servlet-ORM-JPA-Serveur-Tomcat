package sn.SenForage.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   @Column(length=100)
   private String nom;
   @Column(length=100)
   private String prenom;
   @Column(length=100)
   private String email;
   @Column(length=100)
   private String password;
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(int id, String nom, String prenom, String email, String password) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.password = password;
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
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
