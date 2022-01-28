public class Main{
    public static void main(String[] args){
        //ROSITA
        Eye ojoRight=new Eye();
        Eye ojoLeft= new Eye();
        Head cabezaRo=new Head(ojoLeft, ojoRight);
        Dog rosita= new Dog(12,25,"Rosita",cabezaRo);

        //RUFFUS
        Head cabezaRu= new Head(ojoLeft,ojoRight);
        Dog ruffus= new Dog(21,15,"Ruffus",cabezaRu);

        System.out.println(rosita.getName());
        cabezaRo.getRightEye().blink();
        cabezaRo.getLeftEye().blink();
        System.out.println("Strength: " +(rosita.getStrength()));
        System.out.println("Speed: "+ (rosita.getSpeed()));

        System.out.println(ruffus.getName());
        cabezaRu.getRightEye().blink();
        cabezaRu.getLeftEye().blink();
        System.out.println("Strength: " +(ruffus.getStrength()));
        System.out.println("Speed: " +(ruffus.getSpeed()));

        rosita.fight(ruffus);
        ruffus.run(rosita);


    }
}
