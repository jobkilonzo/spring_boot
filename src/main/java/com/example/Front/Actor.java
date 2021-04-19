package com.example.Front;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer actor_id;
    private String first_name;
    private String last_name;
    private String last_update;

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public Integer getActor_id() {
        return actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getLast_update() {
        return last_update;
    }
}
