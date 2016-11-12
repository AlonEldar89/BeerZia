package com.example.shmuelhanagid.maptestgal;

/**
 * Created by shmuelHanagid on 16/07/2016.
 */


public class Beer {

    public static String[] beerBrands;
    //eBrandName brand;
    String brand;
    //Price price;
    String price;
    float pricePerLiter;
    BeerSize size;


    /*public Beer(eBrandName brand, Price price, BeerSize size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
        pricePerLiter = price.getPriceInNis()  * 1000 / (float)size.sizeInML;

    }*/

    public Beer(String beerStr) {
        String[] splitStr = beerStr.split(",");
        this.brand = beerBrands[Integer.parseInt(splitStr[0])];
        this.price = splitStr[2];
        switch (splitStr[1]) {
            case "0.3":
                this.size = new BeerSize(eQuantity.ThirdLiter);
                break;
            case "0.5":
                this.size = new BeerSize(eQuantity.HalfLiter);
                break;
            default:
                this.size = new BeerSize(eQuantity.Other,(int)Float.parseFloat(splitStr[1]) * 1000);
                break;

        }


    }
}
