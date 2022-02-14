package com.fullstack.learnersacademy.service;


import com.fullstack.learnersacademy.exception.BusinessException;
import com.fullstack.learnersacademy.model.*;
import com.fullstack.learnersacademy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnersAcademyImp implements LearnersAcademy {

    @Autowired
    LoginRepository loginRepository;
    @Autowired
    ClassRepository classRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    SubjectRepostory subjectRepostory;
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public boolean userLogin(String username, String password) throws BusinessException {
        boolean bool = false;
        User user = loginRepository.findByUsername(username);

        if (!username.isEmpty() && !password.isEmpty()) {
            if (username.matches("^[A-Za-z0-9._]+$") && password.matches("^[A-Za-z0-9]+$")) {
                if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                    bool = true;
                    return bool;
                } else {
                    return bool;
                }

            } else {
                throw new BusinessException("Invalid Credentials");
            }
        } else {
            throw new BusinessException("Username or Password Cannot be Null");
        }
    }

    @Override
    public List<Subject> allSubjects() throws BusinessException {
        List<Subject> subjectList = subjectRepostory.findAll();
        return subjectList;
    }

    @Override
    public List<ClassDetails> allClasses() throws BusinessException {
        List<ClassDetails> classList = classRepository.findAll();
        return classList;
    }

    @Override
    public List<Teacher> allTeachers() throws BusinessException {

        List<Teacher> teacherList = teacherRepository.findAll();
        return teacherList;
    }

    @Override
    public List<Student> allStudents() throws BusinessException {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }


    @Override
    public void deleteSubject(Integer subjectID) throws BusinessException {
        subjectRepostory.deleteById(subjectID);
    }

    @Override
    public void deleteClass(Integer classID) throws BusinessException {
        classRepository.deleteById(classID);
    }

    @Override
    public void deleteTeacher(Integer teacherID) throws BusinessException {
        teacherRepository.deleteById(teacherID);
    }

    @Override
    public void deleteStudent(Integer studentID) throws BusinessException {
         studentRepository.deleteById(studentID);
    }

    @Override
    public Subject addSubject(Subject subject) throws BusinessException {
        if (subject.getSubName().isEmpty() || subject.getSubLang().isEmpty()) {
            throw new BusinessException("Subject Name or Language Cannot be Empty");
        } else {
            if (subject.getSubName().matches("^[A-Za-z\\S]+$")) {

                if (subject.getSubLang().matches("^[A-Za-z]+$")) {

                    return subjectRepostory.save(subject);

                } else {
                    throw new BusinessException("Subject Language should only have alphabets, No White Spaces Allowed");
                }

            } else {
                throw new BusinessException("Subject Name should only have alphabets and spaces");
            }

        }
    }

    @Override
    public ClassDetails addClass(ClassDetails cls) throws BusinessException {
        if (cls.getStandard() == null || cls.getDivision().isEmpty()) {
            throw new BusinessException("Class Name or Language Cannot be Empty");
        } else {
            if (cls.getStandard() > 0 || cls.getStandard() < 12) {

                if (cls.getDivision().matches("[A-D]{1}")) {

                    return classRepository.save(cls);

                } else {
                    throw new BusinessException("Please choose a division from A,B,C,D");
                }

            } else {
                throw new BusinessException("Standard Should be between 1 and 12");
            }

        }
    }

    @Override
    public Teacher addTeacher(Teacher teacher) throws BusinessException {
        if (teacher.getTeacherName().isEmpty() || teacher.getTeacherCategory().isEmpty() || teacher.getExperience() == null) {
            throw new BusinessException("Teacher Name, Category or Experience Cannot be Empty");
        } else {
            if (teacher.getTeacherName().matches("^[A-Za-z\\s]+$")) {

                if (teacher.getTeacherCategory().matches("^[A-Za-z]+$")) {
                    return teacherRepository.save(teacher);

                } else {
                    throw new BusinessException("Teacher Category should only have alphabets, No White Spaces Allowed");
                }

            } else {
                throw new BusinessException("Teacher Name should only have alphabets and spaces");
            }

        }
    }

    @Override
    public Student addStudent(Student student) throws BusinessException {
        if (student.getStudentName().isEmpty() || student.getStudentDob() == null) {
            throw new BusinessException("Student Name or DoB Cannot be Empty");
        }
        else {
                return studentRepository.save(student);

        }

    }

    @Override
    public Subject updateSubject(Subject subject, Integer id) throws BusinessException {
        if (subject.getSubName().matches("^[A-Za-z]+$") || subject.getSubName().isEmpty()) {

            if (subject.getSubLang().matches("^[A-Za-z]+$") || subject.getSubLang().isEmpty()) {
                return subjectRepostory.save(subject);

            } else {
                throw new BusinessException("Subject Language should only have alphabets, No White Spaces Allowed");
            }

        } else {
            throw new BusinessException("Subject Name should only have alphabets and spaces");
        }

    }

    @Override
    public ClassDetails updateClass(ClassDetails classDetail, Integer id) throws BusinessException {
        if (classDetail.getDivision().matches("^[A-Za-z\\s]+$") || classDetail.getDivision().isEmpty()) {

            if (classDetail.getDivision().matches("^[A-Za-z0-9]+$") || classDetail.getStandard() != 0) {
                return classRepository.save(classDetail);

            } else {
                throw new BusinessException("Class Language should only have alphabets, No White Spaces Allowed");
            }

        } else {
            throw new BusinessException("Class Name should only have alphabets and spaces");
        }

    }



    @Override
    public Teacher updateTeacher(Teacher teacher, Integer id) throws BusinessException {
        if (teacher.getTeacherName().isEmpty() && teacher.getTeacherCategory().isEmpty() && teacher.getExperience() == null) {
            throw new BusinessException("Teacher Name, Category and Experience Cannot be Empty. No parameter to be updated");
        } else {
            if (teacher.getTeacherName().matches("^[A-Za-z\\s]+$") || teacher.getTeacherName().isEmpty()) {

                if (teacher.getTeacherCategory().matches("^[A-Za-z]+$") || teacher.getTeacherCategory().isEmpty()) {
                    return teacherRepository.save(teacher);

                } else {
                    throw new BusinessException("Teacher Category should only have alphabets, No White Spaces Allowed");
                }

            } else {
                throw new BusinessException("Teacher Name should only have alphabets and spaces");
            }
        }
    }

    @Override
    public Student updateStudent(Student student, Integer id) throws BusinessException {
        Student student1 = studentRepository.findById(id).orElse(null);
        if(student1 == null)
            return null;
        if (student.getStudentName().isEmpty() && student.getStudentDob() == null && student.getClassId() == null) {
            throw new BusinessException("Student Name, DoB and ClassID all Cannot be Empty. no updation required.");
        } else {
            if (student.getStudentName().matches("^[A-Za-z\\s]+$") || student.getStudentName().isEmpty()) {

                return studentRepository.save(student);

            } else {
                throw new BusinessException("Student Name should only have alphabets and spaces");
            }
        }
    }
}
