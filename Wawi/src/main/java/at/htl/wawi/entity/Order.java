package at.htl.wawi.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "WW_ORDER")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDate orderDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    Product product;

    public Order() {
    }

    public Order(LocalDate orderDate, Product product) {
        this.orderDate = orderDate;
        this.product = product;
    }

    //region getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    //endregion

    @Override
    public String toString() {
        return id + ": " + orderDate
                .format(DateTimeFormatter.BASIC_ISO_DATE);
    }
}
