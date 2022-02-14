package com.fullstack.learnersacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "class")
public class ClassDetails {
	@Id
	@GeneratedValue
	private Integer classId;
	private Integer standard;
	private String division;



	@Override
	public String toString() {
		return "ClassObj [classID=" + classId + ", standard=" + standard + ", Division=" + division + "]";
	}


}
