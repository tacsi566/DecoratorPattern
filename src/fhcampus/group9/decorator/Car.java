package fhcampus.group9.decorator;

public abstract class Car {

    /*
    For future implementations...
     */
    private String brand;
    private String model;
    private int year;


    /*
    These two methods are used in the decorator class
     */
    public String getDescription(){
        return this.getClass().getSimpleName();
    }

    public double getCost(){
        return 13.0;
    }

}


