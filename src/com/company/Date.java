package com.company;



public class Date {
    int day;
    int month;
    int year;
    String date;

    /**
     * @param day   gespeichert Tag
     * @param month gespeichert Monat
     * @param year  gespeichert Jahr
     * @author Jovana
     * @date 17.02.2022
     * @details Konstruktor der day, month und year speichert
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    /**
     * @param date speichert Datum
     * @author Jovana
     * @details Speichert alle drei Werte in einen String
     * @param date speichert Datum
     */

    public Date(String date) {
        String strday = Integer.toString(day);
        String strmon = Integer.toString(month);
        String stryear = Integer.toString(year);
        this.date = strday + "." + strmon + "." + stryear;


    }

    /**
     * @return gibt Wert in day zurueck
     * @author Jovana
     * @details Holt sich gespeicherten Wert in day
     */

    public int getDay() {
        return day;
    }

    /**
     * @return gibt Wert in month zurueck
     * @author Jovana
     * @details Holt sich gespeicherten Wert in month
     */

    public int getMonth() {
        return month;
    }

    /**
     * @return gibt Wert in year zurueck
     * @author Jovana
     * @details Holt sich gespeicherten Wert in year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return true - jup, ein Schaltjahr | false - nope, kein Schaltjahr
     * @author Jovana
     * @details Prueft, ob es sich um ein Schaljahr haelt
     * @return true - jup, ein Schaltjahr | false - nope, kein Schaltjahr
     */

        public boolean isLeapYear(int year) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }

    /**
     * @param date
     * @return true - jup, gueltig | false - nope, kein richtiges datum :(
     * @author Jovana
     * @details Prueft ob ein gueltiger Wert in date ist
     * @param date
     * @return true - jup, gueltig | false - nope, kein richtiges datum :(
     */
    public boolean isValid(int date) {
        return true;
    }
}
