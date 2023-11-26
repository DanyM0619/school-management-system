package org.example;

import Servicios.StudentAlreadyEnrolledException;
import Servicios.StudentNotEnrolledInCourseException;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        // Establecer datos para estudiante1
        student1.setName("Daniel");
        student1.setLastname("Medina");
        //...

        Student student2 = new Student();
        // Establecer datos para estudiante2
        student2.setName("Camila");
        student2.setLastname("Perez");
        //...

        // Crear dos cursos
        Course course1 = new Course();
        // Establecer datos para curso1
        course1.setName("Matematicas");
        //...

        Course course2 = new Course();
        // Establecer datos para curso2
        course2.setName("Biologia");
        //...

        // Instanciar GestorAcademico

        AcademicManager gestorAcademico = new AcademicManager();

    }

}