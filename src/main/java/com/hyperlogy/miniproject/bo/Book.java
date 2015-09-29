package com.hyperlogy.miniproject.bo;

import java.io.Serializable;

/**
 * Created by tronghh on 24/09/2015.
 */
public class Book implements Serializable {
    private Long id;
    private String name;
    private Long price;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
