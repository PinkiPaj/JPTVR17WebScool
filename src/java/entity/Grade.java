/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 * */
@Entity
public class Grade implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private SubjectName subject;
    @OneToOne
    private Person student;
    private String ball;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Grade() {
        
    }

    public Grade(Long id, SubjectName subject, Person student, String ball, Date date) {
        this.id = id;
        this.subject = subject;
        this.student = student;
        this.ball = ball;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubjectName getSubject() {
        return subject;
    }

    public void setSubject(SubjectName subject) {
        this.subject = subject;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", subject=" + subject + ", student=" + student + ", ball=" + ball + ", date=" + date + '}';
    }
    
}
