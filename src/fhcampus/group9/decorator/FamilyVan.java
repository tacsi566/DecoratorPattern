package fhcampus.group9.decorator;

public class FamilyVan extends Car{
    private int seatCount = 7;

    @Override
    public double getCost(){
        return super.getCost()*seatCount;
    }

}
