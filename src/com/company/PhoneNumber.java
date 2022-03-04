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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @details Speichert Daten/Eigenschaften der Telefonnummer
 */

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
     * @return coutry
     * @details gibt country zurueck
     */
    public int getCountry() {
        return country;
    }

    /**
     * @details gibt areacode zurueck
     * @return areacode
     * @details gibt areacode zurueck
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * @return number
     * @details gibt number zurueck
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @details gibt country, areacode & number in einem String zurueck
     * @return coutry + areacode + number
     * @details gibt country, areacode & number in einem String zurueck
     */
    public String toString() {
        return String.valueOf(country + areacode + number);
    }

    /**
     * prueft ob die Telefonnummer gueltig ist
     *
     * @param d
     * @return boolean
     */
    public void isValid(PhoneNumber d) throws IllegalPhoneNumberException {
        try {
            Pattern p = Pattern.compile("^\\d{10}$");
            Matcher m = p.matcher(d.toString());
            if (m.matches() == IllegalPhoneNumberException.Case1) {
                throw new IllegalPhoneNumberException();
            }
        } catch (IllegalPhoneNumberException e) {
            e.output();
        }
    }
}
