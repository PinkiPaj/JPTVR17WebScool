/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author pupil
 */
@Entity
public class SubjectName implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int hour;
    @OneToOne
    private Person person;

    public SubjectName() {
        
        }

    public SubjectName(Long id, String name, int hour, Person author) {
        this.id = id;
        this.name = name;
        this.hour = hour;
        this.person = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person author) {
        this.person = author;
    }

    @Override
    public String toString() {
        return "SubjectName{" + "id=" + id + ", name=" + name + ", hour=" + hour + ", author=" + person + '}';
    }
    
}
