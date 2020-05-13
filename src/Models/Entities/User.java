package Models.Entities;

import Enums.Roles;

import java.util.HashSet;
import java.util.Set;

public class User {
    private int Id;
    private String Login;
    private String Password;
    private Roles Role;
    private Set<Batch> Batches = new HashSet<Batch>(0);

    public User() {

    }
    public User(int id){
        Id = id;
    }
    public User(int id, String login, String password, Roles role) {
        Id = id;
        Login = login;
        Password = password;
        Role = role;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Roles getRole() {
        return Role;
    }

    public void setRole(Roles role) {
        Role = role;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
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
