package com.requirement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REQUIREMENT_DETAILS")
public class RequirementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private Long id;
	
	@Column(name="release_no")	
	private String releaseNumber;
	
	@Column(name="requirement_no")
	private String requirementNumber;
	
	@Column(name="date")	
	private String date;
	
	@Column(name="author")	
	private String author;
	
	public String getReleaseNumber() {
		return releaseNumber;
	}


	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}


	public String getRequirementNumber() {
		return requirementNumber;
	}


	public void setRequirementNumber(String requirementNumber) {
		this.requirementNumber = requirementNumber;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "RequirementDetails [releaseNumber=" + releaseNumber + ", requirementNumber=" + requirementNumber
				+ ", date=" + date + ", author=" + author + "]";
	}
	
	
}
