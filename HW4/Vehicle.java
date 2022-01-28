public class Vehicle{
    private String name;
    private float weight;

    public String getName(){
        return name;
    }

    public float getWeight(){
        return weight;
    }

    public Vehicle(){
        System.out.println("***DEFAULT CONSTRUCTOR ON VEHICLE***");
        this.name= "Trax";
        this.weight= 25;
    }

    public Vehicle (String name, float weight){
        this.name=name;
        this.weight=weight;
    }
    public void move(){
        System.out.println("***MOVING***");
    }
}
