public class Cats{
    private String name;
    private String color;
    private String colorOfEyes;
    private String sleep;
    private String food;

    public Cats(String name, String color, String colorOfEyes, String sleep, String food){
        this.name=name;
        this.color=color;
        this.colorOfEyes=colorOfEyes;
        this.sleep=sleep;
        this.food=food;
    }
public void displayCats(){
    System.out.println("Name: "+name);
    System.out.println("Color: "+color);
    System.out.println("Color of Eyes: "+colorOfEyes);
    System.out.println("Does he/she sleep more than 7 hours? "+sleep);
    System.out.println("Does he/she eat cat food? "+food);
    System.out.println(" ");
}
}
