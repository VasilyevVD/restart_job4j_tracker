package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String group;
    private LocalDate creted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getCreted() {
        return creted;
    }

    public void setCreted(int year, int mounth, int mounthOfStart) {
        this.creted = LocalDate.of(year, mounth, mounthOfStart);
    }
}
