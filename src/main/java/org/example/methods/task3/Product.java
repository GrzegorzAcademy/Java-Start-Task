package org.example.methods.task3;

public class Product {
    private String name;
    private String producer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }


}
