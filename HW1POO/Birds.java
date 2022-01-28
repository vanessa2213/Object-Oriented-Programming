public class Birds{
    private String color;
    private String sizeOfWings;
    private String fly;
    private String poop;

    public Birds(String color, String sizeOfWings, String fly, String poop){
        this.color=color;
        this.sizeOfWings=sizeOfWings;
        this.fly=fly;
        this.poop=poop;
    }
public void displayBirds(){
    System.out.println("Color: "+color);
    System.out.println("Size of Wings: "+sizeOfWings);
    System.out.println("Does he/she fly? "+fly);
    System.out.println("Does he/she poop?"+poop);
    System.out.println(" ");
}
}
