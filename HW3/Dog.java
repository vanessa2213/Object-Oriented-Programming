public class Dog{
    private float strength;
    private float speed;
    private String name;
    private Head head;

     public float getStrength(){
       return strength;
     }
     public float getSpeed(){
       return speed;
     }
     public String getName(){
       return name;
     }
     public Head getHead(){
       return head;
     }


    public Dog(){
        System.out.println("***DEFAULT CONSTRUCTOR***");
    }
    public Dog(float strength, float speed, String name, Head head){
        this.strength=strength;
        this.speed=speed;
        this.name=name;
        this.head=head;
    }
    public Dog fight(Dog theOther){
        if (this.getStrength()>theOther.getStrength()){
             System.out.println("The winner on strength is: "+(this.getName()));
             return this;
        }
        else{
            System.out.println("The winner on strength is: "+(theOther.getName()));
            return theOther;
        }
    }
    public Dog run(Dog theOther){
        if(this.getSpeed()>theOther.getSpeed()){
            System.out.println("The winner on speed is: "+(this.getName()));
            return this;
        }
        else{
            System.out.println("The winner on speed is: "+(theOther.getName()));
            return theOther;
        }
    }
}
