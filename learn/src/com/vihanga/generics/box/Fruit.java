package com.vihanga.generics.box;

public class Fruit implements Boxable{
    private String name;
    private String countryOfOrigin;
    private String colour;
    private double weight;

    public Fruit(String name, String countryOfOrigin, String colour, double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.colour = colour;
        this.weight = weight;
    }



    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColour() {
        return colour;
    }


    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
