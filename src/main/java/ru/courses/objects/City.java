package ru.courses.objects;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String cityName;
    private List <Route> route;

    public String getCityName() {
        return cityName;
    }

    public City(String cityName, List<Route> route) {
        this.cityName = cityName;
        this.route = new ArrayList<>(route);
    }

    public City(String cityName) {
        this.cityName = cityName;
        this.route = new ArrayList<>();
    }

    public String toString() {
        return "Город: " + cityName + ". Пути: " + route;
    }

    public void AddRoute(Route route){
        this.route.add(route);
    }

    public void AddRoute(City city, int cost){
        Route route = new Route(city, cost);
        AddRoute(route);
    }

    public City travelBy(int n){
        City current = this;
        for (int i = 0; i < n; i++) {
            if (current.route == null) {
                return null;
            }else {
            current = current.route.getFirst().getCity();
            }
        }
        return current;
    }
}
