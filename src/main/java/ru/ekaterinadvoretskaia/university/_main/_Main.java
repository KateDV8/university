package ru.ekaterinadvoretskaia.university._main;

import ru.ekaterinadvoretskaia.university.entity.Professor;
import ru.ekaterinadvoretskaia.university.entity.Student;
import ru.ekaterinadvoretskaia.university.entity.University;

public class _Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Student student = new Student();
        University university = new University();
        student.comeToUniversity();
        professor.lunch();
        university.exist();
    }
}
