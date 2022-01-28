public class Computer{

    private int amountOfMemory;
    private float speed;

    private void setAmountOfMemory(int amountOfMemory){
        this.amountOfMemory=amountOfMemory;
    }

    public int getAmountOfMemory(){
        return amountOfMemory;
    }

    private void setSpeed(float speed){
        this.speed=speed;
    }
    public float getSpeed(){
        return speed;
    }
    public Computer(int amountOfMemory, float speed){
        this.amountOfMemory=amountOfMemory;
        this.speed=speed;
    }
    public Computer(){
        System.out.println("Defult constructor.");
        amountOfMemory= 6;
        speed= 4.77f;
    }
    public void boot(){
        System.out.println("Booting...");
    }

    public void compile(){
        System.out.println("It compiles! :)");
    }

}
