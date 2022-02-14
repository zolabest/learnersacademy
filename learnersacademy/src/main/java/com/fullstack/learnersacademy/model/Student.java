package com.fullstack.learnersacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	private String studentDob;
	private Integer classId;


@Override
public String toString() {
	return "StudentObj [studentId=" + studentId + ", studentName=" + studentName + ", studentDOB=" + studentDob
			+ ", classID=" + "]";
}



}
