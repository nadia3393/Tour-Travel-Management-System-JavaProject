/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

/**
 *
 * @author USER
 */
public class Package {
    private int package_id, user_id, person, day;
    private String place, description, hotel_name, transport;
    private double stay_cost, food_cost, transport_cost;

    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public double getStay_cost() {
        return stay_cost;
    }

    public void setStay_cost(double stay_cost) {
        this.stay_cost = stay_cost;
    }

    public double getFood_cost() {
        return food_cost;
    }

    public void setFood_cost(double food_cost) {
        this.food_cost = food_cost;
    }

    public double getTransport_cost() {
        return transport_cost;
    }

    public void setTransport_cost(double transport_cost) {
        this.transport_cost = transport_cost;
    }
}
