package fhcampus.group9.decorator;

public class DieselVehicle extends CarDecorator{

    private int tankSize = 70;

    public DieselVehicle(Car car){
        super(car);
    }

    @Override
    public double getCost(){
        return super.getCost()*tankSize;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+" diesel";
    }
}
