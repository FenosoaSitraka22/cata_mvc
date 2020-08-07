package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CataMvcApplication {

	public static void main(String[] args) {
		 ApplicationContext ac = SpringApplication.run(CataMvcApplication.class, args);
		 ProduitRepository pr = ac.getBean(ProduitRepository.class);
		 pr.save(new Produit("disque dure1",122.1,1));
		 pr.save(new Produit("disque dure2",1222.1,1));
		 pr.save(new Produit("disque dure3",12222.1,1));
		 pr.save(new Produit("disque dure4",1222220.1,1));
		 pr.save(new Produit("disque dure5",1222222.1,1));
		 pr.save(new Produit("disque dure6",12222221.1,1));
		 pr.save(new Produit("disque dure7",1233333.1,1));
		 pr.save(new Produit("disque dure8",1233333.1,1));
		 pr.findAll().forEach(p->System.out.println(p.getDesignation()));
	}

}
