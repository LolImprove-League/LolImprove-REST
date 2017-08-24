package com.lolimprove.model;

import javax.persistence.*;

@Entity
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private Long verison;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVerison() {
        return verison;
    }

    public void setVerison(Long verison) {
        this.verison = verison;
    }
}
