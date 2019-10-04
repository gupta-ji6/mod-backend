package com.project.mod.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="skill")
@DynamicUpdate
public class Skill extends AuditModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name = "name", nullable = false)
	private String name;
	
	@Column (name = "toc", nullable = false)
	private String toc;
	
	@Column(name = "prerequisites", nullable = false)
	private String prerequisites;
	
	@Column(name="logo", nullable = false)
	private String logo;
	
//	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "skill")
//	private List<Training> training;
	
	public Skill() {
		super();
	}

	public Skill(Integer id, String name, String toc, String prerequisites, String logo) {
		super();
		this.id = id;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
		this.logo = logo;
//		this.training = trainings;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

//	public List<Training> getTrainings() {
//		return training;
//	}
//
//	public void setTrainings(List<Training> trainings) {
//		this.training = trainings;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
}
