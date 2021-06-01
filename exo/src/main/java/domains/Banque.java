package domains;

import javax.persistence.*;

@Entity
public class Banque extends AbstractEntity {
	
	@Column(nullable = true, length = 50)
	private String nom;
	@Column(nullable = true, length = 25)
	private String code;
	
	public Banque() {
		super();
	}
	public Banque(String nom, String code) {
		super();
		this.nom = nom;
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	

}
