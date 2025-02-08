package gr.hua.lab.syst.totallab.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Lawyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "lawyer", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Case> cases;

    public Lawyer() {
    }

    public Lawyer(List<Case> cases, String phone, String last_name, String first_name, int id, String email) {
        this.cases = cases;
        this.phone = phone;
        this.lastname = last_name;
        this.firstname = first_name;
        this.id = id;
        this.email = email;
    }

    public void setCases(List<Case> courses) {
        this.cases = cases;
    }

    @OneToMany(mappedBy = "lawyer", cascade= {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
     private List<Case> getCases() {return cases;}

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLast_name() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastname(String last_name) {
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "cases=" + cases +
                ", id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
