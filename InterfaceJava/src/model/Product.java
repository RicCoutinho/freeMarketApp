/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 01021485
 */
public class Product {
        private String product;
        private String title;
        private String description;  
        
        
    public Product(String product, String title, String description) {
        this.product = product;
        this.title = title;
        this.description = description;
    }

    public String getProdcut() {
        return product;
    }

    public String getTitle() {
        return title;
    }
    
    public String getDescription(){
        return description;
}
}