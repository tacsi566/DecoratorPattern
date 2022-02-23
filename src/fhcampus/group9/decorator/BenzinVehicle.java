package fhcampus.group9.decorator;

public class BenzinVehicle extends CarDecorator{
    private int tankSize = 70;

    public BenzinVehicle(Car car){
        super(car);
    }

    @Override
    public double getCost(){
        return super.getCost()*tankSize;
    }

    @Override
    public String getDescription(){
        return super.getDescription()+" benzin";
    }
}
