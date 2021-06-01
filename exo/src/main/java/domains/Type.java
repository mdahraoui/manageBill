package domains;

import javax.persistence.*;

@Entity
public class Type extends AbstractEntity  {
	@Column(nullable = true, length = 25)
	private TypeCompte libelle;

	public Type() {
		super();
	}

	public Type(TypeCompte libelle) {
		super();
		this.libelle = libelle;
	}
	
	

}
