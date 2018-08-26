package com.google.android.gms.samples.vision.ocrreader;

public class item {
    private String food;
    private int price;

    public item(){ }

    public item(String fd, int pr){
        food=fd;
        price=pr;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
