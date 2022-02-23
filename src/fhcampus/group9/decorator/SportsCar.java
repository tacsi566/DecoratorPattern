package fhcampus.group9.decorator;

public class SportsCar extends Car{

    private int topSpeed = 250;

    @Override
    public double getCost(){
        return super.getCost()*topSpeed;
    }

}
