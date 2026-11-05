package org.example;

public class Apartment {
    private String address;
    private int rooms;
    private double area;

    public String getAddress() {
        return address;
    }

    public int getRooms() {
        return rooms;
    }

    public double getArea() {
        return area;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Apartment(String address, int rooms, double area) {
        this.address = address;
        this.rooms = rooms;
        this.area = area;
    }

    public double pricePerSquareMeter(double totalPrice) {
        return totalPrice / area;
    }

    public String toString() {
        return "Адрес квартиры: " + address + " Комната: " + rooms + " Площадь: " + area + "\n";
    }
}
