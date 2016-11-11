package com.example.shmuelhanagid.maptestgal;

/**
 * Created by shmuelHanagid on 16/07/2016.
 */
public class Beer {
    eBrandName brand;
    Price price;
    float pricePerLiter;
    BeerSize size;


    public Beer(eBrandName brand, Price price, BeerSize size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
        pricePerLiter = price.getPriceInNis()  * 1000 / (float)size.sizeInML;

    }
}
