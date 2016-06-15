package entity;


import javax.persistence.*;
import java.util.List;

/**
 * Created by Ксения on 14.06.2016.
 */
@Entity
@Table(name = "machine")
public class Machine {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "caption")
    private String caption;

//    @ManyToMany
//    @JoinTable(
//            name = "MD",
//            joinColumns = @JoinColumn(name = "machine_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "detail_id", referencedColumnName = "id")
//    )
//    private List<Detail> details;

    public Machine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
//
//    public List<Detail> getDetails() {
//        return details;
//    }
//
//    public void setDetails(List<Detail> details) {
//        this.details = details;
//    }
}
