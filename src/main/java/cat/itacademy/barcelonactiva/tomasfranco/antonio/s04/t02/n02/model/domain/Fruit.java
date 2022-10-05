package cat.itacademy.barcelonactiva.tomasfranco.antonio.s04.t02.n02.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "kilos")
    private int kilos;

    public Fruit(){}

    public Fruit(String name, int kilos) {
        this.name = name;
        this.kilos = kilos;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kilos=" + kilos +
                '}';
    }
}
