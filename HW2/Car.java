public class Car{

    private String model;
    private int year;

    private void setModel(String model){
        this.model=model;
    }

    public String getModel(){
        return model;
    }

    private void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public Car(String model, int year){
        this.model=model;
        this.year=year;
    }
    public Car(){
        System.out.println("Defult constructor.");
        model= "Jeep Cherokee";
        year= 2010;
    }
    public void honksGreat(){
        System.out.println("Your car has great honks.");
    }

    public void brakesWorking(){
        System.out.println("Your brakes are working correctly.");
    }
}
