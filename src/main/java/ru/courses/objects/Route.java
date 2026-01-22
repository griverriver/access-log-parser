package ru.courses.objects;

public class Route {
    private City city;
    private int cost;

    public City getCity() {
        return city;
    }

    public Route(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public String toString() {
        return "Поездка до " + city.getCityName() + " стоит: " + cost;
    }
}
