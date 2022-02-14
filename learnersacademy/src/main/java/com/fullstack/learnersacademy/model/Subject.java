package com.fullstack.learnersacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Subject {

	@Id
	@GeneratedValue
	private Integer subjectId;
	private String subName;
	private String subLang;
	private Integer classId;
	private Integer teacherId;


@Override
public String toString() {
	return "SubjectObj [subjectID=" + subjectId + ", subName=" + subName + ", subLang=" + subLang +  "]";
}


}
