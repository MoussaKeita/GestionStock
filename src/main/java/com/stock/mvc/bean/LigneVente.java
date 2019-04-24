package com.stock.mvc.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ligneVente")
public class LigneVente implements Serializable{
    @Id
    @GeneratedValue
    @Column(name="id_vente")
    private Long id;
    
    public LigneVente() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
}
