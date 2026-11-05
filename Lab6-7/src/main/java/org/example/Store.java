package org.example;

public class Store {
    private String name;
    private String address;
    private int employeeCount;
    private int count;

    public Store(String name, String address, int employeeCount, int count) {
        this(name, address, employeeCount);
        this.count = count;
    }
    //Store s1 = new Store("name", "adres", 10, 10);

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Store(String name, String address, int employeeCount) {
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
    }

    public boolean isLarge() {
        return employeeCount > 50;
    }

    public String toString() {
        return "Название магазина: " + name + " Адресс: " + address + " Кол-во сотрудников: " + employeeCount;
    }
}
