package com.stock.mvc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "mouvementStock")
public class MouvementStock implements Serializable{
	public static final int ENTREE =1;
	public static final int SORTIE =-1;
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    private Date date;
    private BigDecimal quantite;
    private int seuilMinimal;
    private int typeMvt;
    
    public MouvementStock() {
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getSeuilMinimal() {
		return seuilMinimal;
	}

	public void setSeuilMinimal(int seuilMinimal) {
		this.seuilMinimal = seuilMinimal;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
    
}
