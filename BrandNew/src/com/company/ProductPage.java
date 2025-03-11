package com.company;
import java.awt.*;

public class ProductPage{
    Image image;
    String Description;
    Items item;
    public void ShowSizes(){};

    public ProductPage(Items item, Image image, String Description)
    {
        this.item = item;
        this.image = image;
        this.Description = Description;
    }

}
