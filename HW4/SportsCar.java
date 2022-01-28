public class SportsCar extends Car{
    private String owner;
    private float mileage;

    public String getOwner(){
        return owner;
    }

    public float getMileage(){
        return mileage;
    }
    public SportsCar(){
        System.out.println("***DEFAULT CONSTRUCTOR ON SPORTSCAR");
    }
    public SportsCar(String owner, float mileage){
        this.owner= owner;
        this.mileage= mileage;
    }
    public void oil(){
        System.out.println("***CHECK YOUR OIL***");
    }
    public void checkBrakes(){
        super.checkBrakes();
    }
}
