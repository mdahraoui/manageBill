package domains;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class Compte extends AbstractEntity {

	@Column
	private String numero;
	@Column
	private BigDecimal solde;
	
	 @Enumerated(EnumType.STRING)
	private TypeCompte tCompte;
	 
	@OneToOne
	(cascade = CascadeType.PERSIST)
	private Client client;
	@OneToOne
	(cascade = CascadeType.PERSIST)
	private Agence agence;
	
	@Column
	private Boolean fermer;
	
	public Compte() {
		super();
	}
	public Compte(String numero, BigDecimal solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	
	public Compte(String numero, BigDecimal solde, TypeCompte tCompte, Client client, Agence agence, Boolean fermer) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.tCompte = tCompte;
		this.client = client;
		this.agence = agence;
		this.fermer = fermer;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSolde() {
		return solde;
	}
	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	public TypeCompte gettCompte() {
		return tCompte;
	}
	public void settCompte(TypeCompte tCompte) {
		this.tCompte = tCompte;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Boolean getFermer() {
		return fermer;
	}
	public void setFermer(Boolean fermer) {
		this.fermer = fermer;
	}
	
	
	
}
