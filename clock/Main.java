import javax.swing.JOptionPane;

public class Main{
    public static void main(String[]args){
        int hr;
        int min;
         int sec;

        Clock reloj = new Clock();
        Clock relojN4 = new Clock();

        int choice = 1;
        do{
            System.out.println("What do you want to do?");
            System.out.println("1. Initialize the clock");
            System.out.println("2. Set time");
            System.out.println("3. Print clock values");
            System.out.println("4. Copy into clock");
            System.out.println("5. Copy from clock");
            System.out.println("6. Exit");

            String userInput = JOptionPane.showInputDialog("Choose now");
            choice = Integer.parseInt(userInput);

        if(choice == 1){
try{
    reloj.setTime(0,0,0);
    reloj.printTime();
}
catch(WrongTimeException e){
    System.out.println(e.getMessage());
}
            reloj.printTime();
            System.out.println("Clock Initializeted.");
        }
        else if(choice == 2){
            String sHr = JOptionPane.showInputDialog("Hours:");
            hr = Integer.parseInt(sHr);
            String sMin = JOptionPane.showInputDialog("Minutes:");
            min = Integer.parseInt(sMin);
            String sSec = JOptionPane.showInputDialog("Seconds:");
            sec = Integer.parseInt(sSec);
            try{
                reloj.setTime(hr,min,sec);
                reloj.printTime();
            }
            catch(WrongTimeException e){
                System.out.println(e.getMessage());
            }
        }
        else if(choice == 3){
            reloj.printTime();
        }
        else if(choice == 4){
            //Clock relojN4 = new Clock();


            String hora = JOptionPane.showInputDialog("Hours:");
            hr = Integer.parseInt(hora);
            String minutos = JOptionPane.showInputDialog("Minutes:");
            min = Integer.parseInt(minutos);
            String segundos = JOptionPane.showInputDialog("Seconds:");
            sec = Integer.parseInt(segundos);
            try{
                relojN4.setTime(hr, min, sec);
                relojN4.printTime();
            }
            catch(WrongTimeException e){
                System.out.println(e.getMessage());
            }

        }
        else if(choice == 5){
            Clock relojN5 = new Clock(relojN4.getHours(), relojN4.getMinutes(), relojN4.getSeconds());
            relojN5.getCopy();
            relojN5.printTime();
        }
        else if(choice != 1 && choice !=2 && choice != 3 && choice!= 4 && choice !=5 && choice != 6){
            System.out.println("It is not a valid choice.");
        }

        } while(choice != 6);

    }
}
