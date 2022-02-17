/*-----------------------------------------------------------------------------
 *              Hoehere Technische Bundeslehranstalt STEYR
 *           Fachrichtung Elektronik und Technische Informatik
 *----------------------------------------------------------------------------*/
/**
 * Kurzbeschreibung
 *
 * @author : Manuel Rester
 * @date : 17.02. 2022
 * @details Klasse fuer Personen
 */

package com.company;


public class Person {

    private String name;

    private String givenName;

    private String nickName;

    private Date birthday;

    private PhoneNumber phone;


    /**
     * @param n
     * @param gn
     * @param bd
     * @param p
     * @details Konstruktor für Eigeschaften von Person
     */
    Person(String n, String gn, Date bd, PhoneNumber p) {
        name = n;
        givenName = gn;
        birthday = bd;
        phone = p;
    }

    /**
     * @return String
     * @details gibt alle Daten einer Person zurueck
     */
    public String toString() {
        return name + ", " + givenName + ", " + nickName + ", " + birthday + ", " + phone;
    }

}
