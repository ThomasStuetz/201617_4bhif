package at.htl.landwirtschaft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Feld implements Serializable {

    private static final long serialVersionUID = 0L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    public Feld(String name) {
        this.name = name;
    }

    public Feld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Feld{" +
                id +
                ": " + name +
                '}';
    }
}
