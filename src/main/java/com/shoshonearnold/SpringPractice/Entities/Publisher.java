package com.shoshonearnold.SpringPractice.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String streetName;
    private String addressName;
    private String city;
    private String state;
    private String zipCode;
    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher() { }

    public Publisher(String publisherName, String streetName, String addressName, String city, String state, String zipCode) {
        this.publisherName = publisherName;
        this.streetName = streetName;
        this.addressName = addressName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getPublisherName() { return publisherName; }

    public void setPublisherName(String publisherName) { this.publisherName = publisherName; }

    public String getStreetName() { return streetName; }

    public void setStreetName(String streetName) { this.streetName = streetName; }

    public String getAddressName() { return addressName; }

    public void setAddressName(String addressName) { this.addressName = addressName; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public Set<Book> getBooks() { return books; }

    public void setBooks(Set<Book> books) { this.books = books; }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", addressName='" + addressName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
