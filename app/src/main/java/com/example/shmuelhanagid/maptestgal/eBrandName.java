package com.example.shmuelhanagid.maptestgal;

/**
 * Created by shmuelHanagid on 16/07/2016.
 */
public enum eBrandName {
    Goldstar,
    Tuborg,
    Kozel,
    Guinness;

    @Override
    public String toString() {
        String retVal = "";
        switch (this)
        {
            case Goldstar:
                retVal = "GoldStar";
                break;
            case Tuborg:
                retVal = "Tuborg";
                break;
            case Kozel:
                retVal = "Kozel";
                break;
            case Guinness:
                retVal = "Guinness";
                break;
        }

        return retVal;

    }
}

