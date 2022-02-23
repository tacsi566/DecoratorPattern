package fhcampus.group9.decorator;

public class ElectricVehicle extends CarDecorator{

    private double batteryCapacity = 50000;

    public ElectricVehicle(Car car){
        super(car);
    }

    @Override
    public double getCost(){
        return super.getCost()*batteryCapacity;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+" electric";
    }
}
