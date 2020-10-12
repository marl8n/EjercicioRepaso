/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciorepaso.product;

import static com.mycompany.ejerciciorepaso.product.utils.ProductUtils.isInStock;

/**
 *
 * @author marl8n
 */
public class Product {
    private String id;
    private String name;
    private Double price;
    private Integer quantity;
    private Boolean inStock;

    
    public Product(String id, String name, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.inStock = isInStock.test(this.quantity);
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }
    
    public Object[] getInfo(){
        Object[] o = new Object[4];
        o[0] = this.getId();
        o[1] = this.getName();
        o[2] = this.getPrice();
        o[3] = this.getInStock();
        
        return o;
    }
}
