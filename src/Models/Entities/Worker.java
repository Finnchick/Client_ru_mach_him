package Models.Entities;

import java.util.HashSet;
import java.util.Set;

public class Worker {
    private int Id;
    private String FIO;
    private String Position;
    private String Department;
    private Set<Produce> Produces = new HashSet<Produce>(0);
    private Set<Batch> Batches = new HashSet<Batch>(0);

    public Worker() {

    }

    public Worker(int id, String fio, String position, String department, Set<Produce> produces) {
        Id = id;
        FIO = fio;
        Position = position;
        Department = department;
        Produces = produces;
    }

    public Worker(int id, String fio, String position, String department) {
        Id = id;
        FIO = fio;
        Position = position;
        Department = department;
    }

    public Worker(int workerId) {
        Id= workerId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public Set<Produce> getProduces() {
        return Produces;
    }

    public void setProduces(Set<Produce> produces) {
        Produces = produces;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Set<Batch> getBatches() {
        return Batches;
    }

    public void setBatches(Set<Batch> batches) {
        Batches = batches;
    }
}
