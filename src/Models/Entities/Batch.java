package Models.Entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Batch {
    private int Id;
    private Date Date;
    private Worker fWorker;
    private User fUser;
    private Set<Produce> Produces = new HashSet<Produce>(0);

    public Batch() {
    }

    public Batch(int id, java.sql.Date date, Worker worker, User user) {
        Id = id;
        Date = date;
        fWorker = worker;
        fUser = user;
    }

    public Batch(int id, java.sql.Date date) {
        Id = id;
        Date = date;
    }
    public Batch(int id){
        Id = id;
    }

    public User getfUser() {
        return fUser;
    }

    public void setfUser(User fUser) {
        this.fUser = fUser;
    }


    public Worker getfWorker() {
        return fWorker;
    }

    public void setfWorker(Worker fWorker) {
        this.fWorker = fWorker;
    }

    public java.sql.Date getDate() {
        return Date;
    }

    public void setDate(java.sql.Date date) {
        Date = date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Set<Produce> getProduces() {
        return Produces;
    }

    public void setProduces(Set<Produce> Produces) {
        this.Produces = Produces;
    }
}
