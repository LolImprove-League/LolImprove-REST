package com.lolimprove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by LVDBB73 on 3/07/2017.
 */
@Entity
public class Champion extends AbstractEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "id=" + super.getId() +
                ", version=" + super.getVerison() +
                ", name='" + name + '\'' +
                '}';
    }
}
