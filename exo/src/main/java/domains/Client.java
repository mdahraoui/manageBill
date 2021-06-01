package domains;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Client extends AbstractEntity {
	
	@Column(nullable = true, length = 25)
	private String prenom;
	@Column(nullable = true, length = 25)
	private String nom;
	@Column(nullable = true, length = 80)
	private String email;
	@Column(nullable = true, length = 25)
	private String mdp;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Adresse adresse;
	
	@OneToMany
	private List<Compte> comptes;
	
	private LocalDate ddn;
	@Transient
	private int age;
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public LocalDate getDdn() {
		return ddn;
	}
	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Client() {
		super();
	}
	public Client(String prenom, String nom, String email, String mdp, LocalDate ddn, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
		this.ddn = ddn;
		this.age = age;
	}
	
	public Client(String prenom, String nom, String email, String mdp, Adresse adresse, LocalDate ddn, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
		this.adresse = adresse;
		this.ddn = ddn;
		this.age = age;
	}


	
}
