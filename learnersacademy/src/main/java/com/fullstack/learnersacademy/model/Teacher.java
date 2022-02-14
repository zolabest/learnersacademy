package com.fullstack.learnersacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Teacher {

	@Id
	@GeneratedValue
	private Integer teacherId;
	private String teacherName;
	private String teacherCategory;
	private Integer experience;


	@Override
	public String toString() {
		return "TeacherObj [tID=" + teacherId + ", teacherName=" + teacherName + ", teacherCategory=" + teacherCategory
				+ ", experience=" + experience + "]";
	}
	
	
	
	

}
