package application;

import org.eclipse.jetty.util.annotation.Name;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;
    private Integer aisle;
    private Integer idealQuantity;
    private Integer purchase;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAisle() {
        return aisle;
    }
    public void setAisle(Integer aisle) {
        this.aisle = aisle;
    }

    public Integer getIdealQuantity() {
        return idealQuantity;
    }
    public void setIdealQuantity(Integer idealQuantity) {
        this.idealQuantity = idealQuantity;
    }

    public Integer getPurchase(){
        return purchase;
    }
    public void setPurchase(Integer purchase){
        this.purchase = purchase;
    }

}