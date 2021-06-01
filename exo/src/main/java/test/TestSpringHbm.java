
  package test;
  import Config.AppConfig;
  import java.math.BigDecimal;
import java.time.LocalDate;

import
  org.springframework.context.annotation.AnnotationConfigApplicationContext;
  
  import domains.*;
  import repository.ICompteRepository;
  import repository.impl.CompteRepository;
import service.ICompteService;
import service.impl.CompteService;
  
  public class TestSpringHbm {
  
  public static void main(String[] args) {
  try(AnnotationConfigApplicationContext context = new
  AnnotationConfigApplicationContext(AppConfig.class);){
	  BigDecimal bd = new BigDecimal(200);
	  BigDecimal credit = new BigDecimal(100);
	  Double cred = credit.doubleValue();
	  Adresse adresse = new Adresse("lol", "mom", "java", "cry");
	  Banque banque = new Banque("ma","banque");

	  Agence agence = new Agence("mon","agence", banque, adresse);
	  Client client = new Client("ceci","est","un","test",LocalDate.now(),0);
	  Client clientn = new Client("java","me","faitdu","mal",LocalDate.now(),0);
	  Compte compte = new Compte("mes sous", bd);
	  Compte comptec = new Compte("pas mes sous", bd);
		
	  	agence.setBanque(banque);
	  	agence.setAdresse(adresse);
		  compte.setClient(client);
		  comptec.setClient(clientn);
		  comptec.setAgence(agence);
		  
		  compte.setAgence(agence);
		 
	 
  ICompteRepository repository = context.getBean(CompteRepository.class);
  ICompteService service = context.getBean(CompteService.class);
  	
  	repository.insert(compte);
  	repository.insert(comptec);
	/*
	 * service.crediter(1, cred);
	 * service.transfert(repository.find(10).getId(),repository.find(1).getId(),50d)
	 * ;
	 */
  
  } } }
 