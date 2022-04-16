package com.example.agt;

public class Model {

    private String img;
    private String text;
    public Model(String img, String text) {
        this.img = img;
        this.text = text;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
