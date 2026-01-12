package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String programmLanguage;

    public Programmer(boolean degree, int experience, String programmLanguage) {
        super(degree, experience);
        this.programmLanguage = programmLanguage;
    }
}
