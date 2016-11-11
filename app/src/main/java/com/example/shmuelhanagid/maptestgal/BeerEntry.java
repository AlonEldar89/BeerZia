package com.example.shmuelhanagid.maptestgal;

/**
 * Created by shmuelHanagid on 16/07/2016.
 * Gal:
 * I needed to create a seperate class for the entries themselves, to be shown at the GUI.
 * beers as they appear in the DB, are seperate entries for each size. after acquiring the approriate
 * beer list from the DB, we consolidate it to Beer Entries, i.e. for each brand - all available sizes
 * and prices.
 */
public class BeerEntry {
    eBrandName brand;
    boolean hasHalf;
    boolean hasPint;
    boolean hasThird;
    int pricePint;
    int priceHalf;
    int priceThird;

    public BeerEntry(Beer inputBeer) {
        brand = inputBeer.brand;
        hasHalf = false;
        hasPint = false;
        hasThird = false;
        priceThird = 0;
        pricePint = 0;
        priceHalf = 0;
        FillEntryUsingBeerObject(inputBeer);



    }

    public void FillEntryUsingBeerObject(Beer curBeer) {
        switch (curBeer.size.quantity)
        {
            case ThirdLiter:
                hasThird = true;
                priceThird = curBeer.price.priceInNis;
                break;
            case Pint:
                hasPint = true;
                pricePint = curBeer.price.priceInNis;
                break;
            case HalfLiter:
                hasHalf = true;
                priceHalf = curBeer.price.priceInNis;
                break;
            case Other:
                break;
        }
    }
}
