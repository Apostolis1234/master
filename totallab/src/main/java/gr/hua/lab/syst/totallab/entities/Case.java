package gr.hua.lab.syst.totallab.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "cases")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    // TODO add columns etc.
    private String lawyer;
    private String title;
    private String description;

    @ManyToMany(mappedBy = "cases", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Client> clients;

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

    public String getDescription() {
        return description;
    }

    public String getLawyer() {
        return lawyer;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // TODO FIX ME: String???
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
