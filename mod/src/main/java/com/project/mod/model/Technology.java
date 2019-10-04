package com.project.mod.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;



@Entity
@Table(name="technology")
@DynamicUpdate
public class Technology  extends AuditModel  {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="tech_name",nullable=false)
	private String techName;
	
	@Column(name="price",nullable=false)
	private Float price;
	
	@Column(name="duration",nullable=false)
	private String duration;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="logo", nullable=false)
	private String logo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="technology")
	private List<Training> training;

	public Technology() {
		super();
	}

	public Technology(Integer id, String techName, Float price, String duration, String description, String logo) {
		super();
		this.id = id;
		this.techName = techName;
		this.price = price;
		this.duration = duration;
		this.description = description;
		this.logo = logo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
