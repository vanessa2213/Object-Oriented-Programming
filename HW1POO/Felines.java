public class Felines{
    private String kind;
    private String size;
    private String fast;
    private String eatHumans;

    public Felines(String kind, String size, String fast, String eatHumans){
        this.kind=kind;
        this.size=size;
        this.fast=fast;
        this.eatHumans=eatHumans;
    }
public void displayFelines(){
    System.out.println("Kind: "+kind);
    System.out.println("Size: "+size);
    System.out.println("Is he/she fast? "+fast);
    System.out.println("Could he/she eat humans? "+eatHumans);
    System.out.println(" ");
}
}
