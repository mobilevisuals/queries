package com.example.queries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(name = "Address.streetAndCitySame",query = "select o from Address o where o.streetname=?1 and o.city=?1")
@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private String streetname;
    private int postalCode;
    private String city;

    public Address() {
    }

    public Address(String streetname, int postalCode, String city) {
        this.streetname = streetname;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetname='" + streetname + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }
}
