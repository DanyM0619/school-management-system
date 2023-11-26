package Servicios;

import org.example.Course;
import org.example.Student;

public interface AcademicServicesI {

    void enrollStudent(Student student);

    void addCourse(Course course);

    void enrollStudentCourse(Student student, int idClass) throws StudentAlreadyEnrolledException;

    void unsubscribeStudentCourse(int idStudent, int idClass) throws StudentNotEnrolledInCourseException;

    void enrollStudentCourse(Student student, Course course);

    void unsubscribeStudentCourse(Student student, Course course);
}
