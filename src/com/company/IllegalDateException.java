package com.company;

public class IllegalDateException extends Exception{
    private final int type;
    public static final int DAY_ILLEGAL = 1;
    public static final int MON_ILLEGAL = 2;

    public IllegalDateException (int type){

        this.type = type;

       /* if (type > DAY_ILLEGAL){
            throw new IllegalDateException("Bitte einen gueltigen Tag eingeben");
        }
        if (type > MON_ILLEGAL){
           throw new IllegalDateException("Bitte gueltigen Monat eingeben");
        }*/
    }
}
