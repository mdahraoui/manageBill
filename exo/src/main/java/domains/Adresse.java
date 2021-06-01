package domains;

import javax.persistence.*;


@Entity
public class Adresse extends AbstractEntity {
	
	@Column(nullable = true, length = 80)
	private String voie;
	@Column(nullable = true, length = 5)
	private String codePostal;
	@Column(nullable = true, length = 80)
	private String ville;
	@Column(nullable = true, length = 55)
	private String pays;
	
	public Adresse() {
		super();
	}
	public Adresse(String voie, String codePostal, String ville, String pays) {
		super();
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	
	
}
