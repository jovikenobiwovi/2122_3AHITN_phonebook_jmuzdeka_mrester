/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Manuel Rester
 * @date : 17.02. 2022
 * @details Klasse fuer PhoneNumber
 */


package com.company;

public class PhoneNumber {
    private int country;

    private int areacode;

    private int number;

    /**
     * @details Konstruktor fuer Eigenschaften von PhoneNumber
     * @param c
     * @param a
     * @param n
     */
    PhoneNumber(int c, int a, int n) {
        country = c;
        areacode = a;
        number = n;
    }

    /**
     * @details gibt country zurueck
     * @return coutry
     */
    public int getCountry() {
        return country;
    }

    /**
     * @details gibt areacode zurueck
     * @return areacode
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * @details gibt number zurueck
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @details gibt country, areacode & number in einem String zurueck
     * @return coutry + areacode + number
     */
    public String toString() {
        return country + ", " + areacode + ", " + number;
    }

}
