public class Main{
    public static void main(String[] args){
        Vehicle v1= new Vehicle();
        Vehicle v2= new Vehicle("Swift",20);

        Airplane a1=new Airplane();
        Airplane a2=new Airplane("2000","Delta");

        Car c1=new Car();
        Car c2=new Car("Chevrolet",1999);

        SportsCar sc1=new SportsCar();
        SportsCar sc2=new SportsCar("Juan",20000);

        v1.move();
        v2.move();

        a1.move();
        a1.takeOff();

        c1.move();
        c1.checkBrakes();

        sc1.move();
        sc1.checkBrakes();
        sc2.oil();
    }
}
