package com.example.asd.myapplication;

class MyItem {
    int image;
    String name;
    int price;
    String text;

    MyItem( int image, String name, int price, String text) {
        this.price = price;
        this.name = name;
        this.image = image;
        this.text = text;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", text='" + text + '\'' +
                '}';
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
