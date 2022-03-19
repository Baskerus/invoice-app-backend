package com.example.rbcdemo.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String address;
    private String city;
    private Integer code;
    private String country;
    private Integer due;
    private String description;
    private Double total;
    private Boolean paid;


    public Invoice() {}

    public Invoice( String name, String email, String address, String city, Integer code, String country, Integer due, String description,Double total, Boolean paid) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.code = code;
        this.country = country;
        this.due = due;
        this.description = description;
        this.total = total;
        this.paid = paid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}