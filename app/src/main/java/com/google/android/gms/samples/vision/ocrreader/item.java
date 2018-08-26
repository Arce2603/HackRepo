package com.google.android.gms.samples.vision.ocrreader;

public class item {
    private String food;
    private double price;

    public item(){ }

    public item(String fd, double pr){
        food=fd;
        price=pr;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
