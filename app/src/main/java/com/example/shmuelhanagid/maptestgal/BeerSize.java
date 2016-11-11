package com.example.shmuelhanagid.maptestgal;

/**
 * Created by shmuelHanagid on 16/07/2016.
 */
public class BeerSize {
    eQuantity quantity;
    int sizeInML;


    public BeerSize(eQuantity quant) {
        quantity = quant;
        sizeInML = convertQuantEnumToInt(quant);
    }

    private int convertQuantEnumToInt(eQuantity quant) {
        int retVal = 0;
        switch (quant)
        {
            case ThirdLiter:
                retVal = 333;
                break;
            case HalfLiter:
                retVal = 500;
                break;
            case Pint:
                retVal = 420;
                break;
            case Other:
                // TODO: Error handling needed!
                break;
        }

        return retVal;
    }

    public BeerSize(eQuantity quant, int mlSize)
    {
        quantity = eQuantity.Other;
        sizeInML = mlSize;
    }
}
