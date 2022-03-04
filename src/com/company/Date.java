package com.company;
/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/

/**
 * Datum Klasse zum Anlegen eines Geb
 * @author : Jovana
 */


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
     * @param date speichert Datum
     * @author Jovana
     * @details Speichert alle drei Werte in einen String
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
     * @return true - jup, ein Schaltjahr | false - nope, kein Schaltjahr
     * @author Jovana
     * @details Prueft, ob es sich um ein Schaljahr haelt
     */

    public boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param day
     * @param month
     * @return true - jup, gueltig | false - nope, kein richtiges datum :(
     * @return true - jup, gueltig | false - nope, kein richtiges datum :(
     * @author Jovana
     * @details Prueft ob ein gueltiger Wert in date ist
     */
    public boolean isValid(int day, int month) {
        if (day > 31) {
            System.out.println("Kein gueltiger Tag");
        }
        if (month > 12) {
            System.out.println("Kein gueltiges Monat");
        }

        return true;

    }
}
