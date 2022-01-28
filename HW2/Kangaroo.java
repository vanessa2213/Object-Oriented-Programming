public class Kangaroo{

    private String name;
    private int age;

    private void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    private void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public Kangaroo(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Kangaroo(){
        System.out.println("Defult constructor.");
        name= "Andrea";
        age= 15;
    }
    public void jump(){
        System.out.println("This kangaroo can jump.");
    }

    public void fight(){
        System.out.println("This kangaroo can fight.");
    }
}
