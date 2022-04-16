package com.example.agt;

public class MyPojo {
    private String stat;

    private Photos photos;

    public String getStat ()
    {
        return stat;
    }

    public void setStat (String stat)
    {
        this.stat = stat;
    }

    public Photos getPhotos ()
    {
        return photos;
    }

    public void setPhotos (Photos photos)
    {
        this.photos = photos;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stat = "+stat+", photos = "+photos+"]";
    }
}
