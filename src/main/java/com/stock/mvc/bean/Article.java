package com.stock.mvc.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable{
           @Id
           @GeneratedValue
           @Column(name="id_Article")
           private Long idArticle;
           private String codeArticle;
           private String libelle;
           private BigDecimal prixUnitaireHT;
           private BigDecimal prixUnitaireTTC;
           private BigDecimal tauxTVA;
           private String photo;
           private String image;
           private String images;
           
          public Article() {
        	  
          }

		public Long getIdArticle() {
			return idArticle;
		}

		public void setIdArticle(Long idArticle) {
			this.idArticle = idArticle;
		}

		public String getCodeArticle() {
			return codeArticle;
		}

		public void setCodeArticle(String codeArticle) {
			this.codeArticle = codeArticle;
		}

		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		public BigDecimal getPrixUnitaireHT() {
			return prixUnitaireHT;
		}

		public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
			this.prixUnitaireHT = prixUnitaireHT;
		}

		public BigDecimal getPrixUnitaireTTC() {
			return prixUnitaireTTC;
		}

		public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
			this.prixUnitaireTTC = prixUnitaireTTC;
		}

		public BigDecimal getTauxTVA() {
			return tauxTVA;
		}

		public void setTauxTVA(BigDecimal tauxTVA) {
			this.tauxTVA = tauxTVA;
		}

		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getImages() {
			return images;
		}

		public void setImages(String images) {
			this.images = images;
		}
          
          
           
}
