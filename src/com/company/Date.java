package com.company;



public class Date {
    int day;
    int month;
    int year;
    String date;

    /**
     * @author Jovana
     * @date 17.02.2022
     * @details Konstruktor der day, month und year speichert
     * @param day  gespeichert Tag
     * @param month  gespeichert Monat
     * @param year  gespeichert Jahr
     */
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    /**
     * @author Jovana
     * @details Speichert alle drei Werte in einen String
     * @param date speichert Datum
     */

    public Date(String date){
    }

    /**
     * @author Jovana
     * @details Holt sich gespeicherten Wert in day
     * @return gibt Wert in day zurueck
     */

    public int getDay() {
        return day;
    }

    /**
     * @author Jovana
     * @details Holt sich gespeicherten Wert in month
     * @return gibt Wert in month zurueck
     */

    public int getMonth() {
        return month;
    }

    /**
     * @author Jovana
     * @details Holt sich gespeicherten Wert in year
     * @return gibt Wert in year zurueck
     */
    public int getYear() {
        return year;
    }

    /**
     * @author Jovana
     * @details Prueft, ob es sich um ein Schaljahr haelt
     * @return true - jup, ein Schaltjahr | false - nope, kein Schaltjahr
     */

    public boolean isLeapYear(){
        return true;
    }

    /**
     * @author Jovana
     * @details Prueft ob ein gueltiger Wert in date ist
     * @param date
     * @return true - jup, gueltig | false - nope, kein richtiges datum :(
     */
    public boolean isValid(int date){
        return true;
    }
}
