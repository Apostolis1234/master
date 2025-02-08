package gr.hua.lab.syst.totallab.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cases")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotEmpty(message = "Fill in a title")
    @Size(min = 5, max = 60)
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "lawyer_id")
    private Lawyer lawyer;

    @ManyToMany
    private Set<Client> clients = new HashSet<>();

    // other fields...

    public void addClient(Client client) {
        this.clients.add(client);
    }


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "case_client",
            joinColumns = @JoinColumn(name = "case_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"case_id", "client_id"})

    )
    private List<Client> clients;

    public Case(List<Client> clients, Lawyer lawyer, int id, String title) {
        this.clients = clients;
        this.lawyer = lawyer;
        this.id = id;
        this.title = title;
    }
    public Case() {

    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setLawyer(Lawyer lawyer) {
        this.lawyer = lawyer;
    }

    public Lawyer getLawyer() {
        return lawyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Case{" +
                "clients=" + clients +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", lawyer=" + lawyer +
                '}';
    }
}







    /*


    public Case() {
    }

    public Case(String description, String lawyer, String title, int id) {
        this.description = description;
        this.lawyer = lawyer;
        this.title = title;
        this.id = id;
    }

    public int getId() {
        return id;
    }



    public String getLawyer() {
        return lawyer;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }


    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Case{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", lawyer='" + lawyer + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
*/