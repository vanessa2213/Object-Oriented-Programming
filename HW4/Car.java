public class Car extends Vehicle{
    private String model;
    private int year;

    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public Car(){
        System.out.println("***DEFAULT CONSTRUCTOR ON CAR***");
    }
    public Car(String model, int year){
        super("Olam", 2546);
        this.model=model;
        this.year=year;
    }
    public void checkBrakes(){
        System.out.println("***CHECK BRAKES***");

    }
}
