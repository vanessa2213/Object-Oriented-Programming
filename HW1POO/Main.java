public class Main{
    public static void main(String[]args){
        Cats Thomas=new Cats("Thomas","gray","gree","No", "Yes");
        Cats Garfield=new Cats("Garfield","orange","black","Yes", "No");
        Birds Bird1=new Birds("Blue","15 cm","Yes","Yes");
        Birds Bird2=new Birds("Black and White", "60 cm", "No", "No");
        Felines Cat=new Felines("cat","53 cm", "No","No");
        Felines Leopard=new Felines("leopard", "140 cm", "Yes","Yes");
        Thomas.displayCats();
        Garfield.displayCats();
        Bird1.displayBirds();
        Bird2.displayBirds();
        Cat.displayFelines();
        Leopard.displayFelines();
    }
}
