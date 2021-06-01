package domains;

import java.util.List;

import javax.persistence.*;

@Entity
public class Agence extends AbstractEntity {

	@Column(nullable = true, length = 50)
	private String nom;
	@Column(nullable = true, length = 50)
	private String codeGuichet;
	
	@OneToOne
	(cascade = CascadeType.PERSIST)
	private Banque banque;
	
	@OneToMany
	private List<Compte> comptes;
	
	@OneToOne
	(cascade = CascadeType.PERSIST)
	private Adresse adresse;
	
	
	public Agence() {
		super();
	}

	public Agence(String nom, String codeGuichet) {
		super();
		this.nom = nom;
		this.codeGuichet = codeGuichet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeGuichet() {
		return codeGuichet;
	}

	public void setCodeGuichet(String codeGuichet) {
		this.codeGuichet = codeGuichet;
	}
	

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Agence(String nom, String codeGuichet, Banque banque, Adresse adresse) {
		super();
		this.nom = nom;
		this.codeGuichet = codeGuichet;
		this.banque = banque;
		this.adresse = adresse;
	}
	
	
	
	
}
