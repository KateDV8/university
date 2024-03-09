package ru.ekaterinadvoretskaia.university.entity;

import ru.ekaterinadvoretskaia.university.interfaces.Teachable;
import ru.ekaterinadvoretskaia.university.interfaces.Visitable;

public class Professor implements Teachable, Visitable {
    @Override
    public void teach() {
        System.out.println("professor teaches");

    }

    @Override
    public void comeToUniversity() {
        System.out.println("professor comes to the University");

    }

    @Override
    public void lunch() {
        System.out.println("professor is having lunch");

    }

    @Override
    public void leaveUniversity() {
        System.out.println("professor leaves university");
    }
}
