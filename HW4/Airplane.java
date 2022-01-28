public class Airplane extends Vehicle{
    private String model;
    private String brand;

    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public Airplane(){
        System.out.println("***DEFAULT CONSTRUCTOR ON AIRPLANE***");
    }
    public Airplane(String model, String brand){
        super("Na",2424);
        this.brand=brand;
        this.model=model;
    }
    public void takeOff(){
        System.out.println("***TAKING OFF***");
    }
}
