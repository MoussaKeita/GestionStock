package com.stock.mvc.bean;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bon_Commande")
public class BonCommande implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateBonCommande;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateBonCommande() {
		return dateBonCommande;
	}
	public void setDateBonCommande(Date dateBonCommande) {
		this.dateBonCommande = dateBonCommande;
	}
    
    

}
