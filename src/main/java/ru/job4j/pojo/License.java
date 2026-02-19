package ru.job4j.pojo;

import java.time.LocalDate;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private LocalDate created;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        License license = (License) object;
        return Objects.equals(owner, license.owner) && Objects.equals(model, license.model) && Objects.equals(code, license.code) && Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(int year, int mounth, int dayOfMonth) {
        this.created = LocalDate.of(year, mounth, dayOfMonth);
    }
}
