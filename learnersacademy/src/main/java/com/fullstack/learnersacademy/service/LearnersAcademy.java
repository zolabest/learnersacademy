package com.fullstack.learnersacademy.service;

import com.fullstack.learnersacademy.exception.BusinessException;
import com.fullstack.learnersacademy.model.ClassDetails;
import com.fullstack.learnersacademy.model.Student;
import com.fullstack.learnersacademy.model.Subject;
import com.fullstack.learnersacademy.model.Teacher;

import java.util.List;

public interface LearnersAcademy {
	public boolean 			userLogin(String username, String password) throws BusinessException;
	public List<Subject> 	allSubjects() throws BusinessException;
	public List<ClassDetails> 	allClasses() throws BusinessException;
	public List<Teacher> 	allTeachers() throws BusinessException;
	public List<Student> 	allStudents() throws BusinessException;

	public void 			deleteSubject(Integer subjectID) throws BusinessException;
	public void 			deleteClass(Integer classID) throws BusinessException;
	public void 			deleteTeacher(Integer teacherID) throws BusinessException;
	public void 			deleteStudent(Integer studentID) throws BusinessException;

	public Subject 			addSubject(Subject subject) throws BusinessException;
	public ClassDetails 	addClass(ClassDetails cls) throws BusinessException;
	public Teacher 			addTeacher(Teacher teacher) throws BusinessException;
	public Student 			addStudent(Student student) throws BusinessException;

	public Subject 			updateSubject(Subject subject, Integer id) throws BusinessException;
	public Teacher 			updateTeacher(Teacher teacher, Integer id) throws BusinessException;
	public Student 			updateStudent(Student student, Integer id) throws BusinessException;
	public ClassDetails 			updateClass(ClassDetails classDetail, Integer id) throws BusinessException;
}
