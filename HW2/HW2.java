public class HW2{
    public static void main(String[]args){
        Car myCar=new Car();
        System.out.println("My Car:");
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());
        myCar.honksGreat();
        myCar.brakesWorking();
        System.out.println(" ");

        Car CristiansCar=new Car("Trax",2014);
        System.out.println("Cristian's Car:");
        System.out.println(CristiansCar.getModel());
        System.out.println(CristiansCar.getYear());
        CristiansCar.honksGreat();
        CristiansCar.brakesWorking();
        System.out.println(" ");

        Kangaroo Kangaroo1=new Kangaroo();
        System.out.println(Kangaroo1.getName());
        System.out.println(Kangaroo1.getAge());
        Kangaroo1.jump();
        Kangaroo1.fight();
        System.out.println(" ");

        Kangaroo Kangaroo2=new Kangaroo("Carlos",20);
        System.out.println(Kangaroo2.getName());
        System.out.println(Kangaroo2.getAge());
        Kangaroo2.jump();
        Kangaroo2.fight();
        System.out.println(" ");

        Computer myComputer=new Computer();
        System.out.println("My Computer:");
        System.out.println("Amount of Memory: "+ myComputer.getAmountOfMemory()+"GB");
        System.out.println("CPU clock speed: "+myComputer.getSpeed()+"MHz");
        myComputer.boot();
        myComputer.compile();
        System.out.println(" ");

        Computer Computer1=new Computer(7,4.5f);
        System.out.println("Computer 1:");
        System.out.println("Amount of Memory: "+Computer1.getAmountOfMemory()+"GB");
        System.out.println("CPU clock speed: "+Computer1.getSpeed()+"MHz");
        Computer1.boot();
        Computer1.compile();
        System.out.println(" ");
    }
}
