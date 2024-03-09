package ru.ekaterinadvoretskaia.university.entity;

import ru.ekaterinadvoretskaia.university.interfaces.Studable;
import ru.ekaterinadvoretskaia.university.interfaces.Visitable;

public class Student implements Studable, Visitable {

    @Override
    public void study() {
        System.out.println("student studying");
    }

    @Override
    public void comeToUniversity() {
        System.out.println("student comes to the University");
    }

    @Override
    public void lunch() {
        System.out.println("student is having lunch");
    }

    @Override
    public void leaveUniversity() {
        System.out.println("student leaves university");
    }
}

