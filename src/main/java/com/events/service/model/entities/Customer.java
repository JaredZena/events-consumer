package com.events.service.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends PanacheEntityBase {

    @Id
    private Long customerId;

    private String name;


    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
