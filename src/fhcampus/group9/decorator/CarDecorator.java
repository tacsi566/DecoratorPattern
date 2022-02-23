package fhcampus.group9.decorator;

public abstract class CarDecorator extends Car{

    protected Car car;

    public CarDecorator (Car car){
        this.car = car;
    }

    @Override
    public double getCost(){
        return car.getCost();
    }

    @Override
    public String getDescription(){
        return car.getDescription() + " Fuel:";
    }
}
