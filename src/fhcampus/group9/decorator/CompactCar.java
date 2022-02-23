package fhcampus.group9.decorator;

public class CompactCar extends Car{

    private int doors = 3;

    @Override
    public double getCost(){
        return super.getCost()*doors;
    }
}
