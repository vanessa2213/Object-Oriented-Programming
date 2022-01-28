

public class WrongTimeException extends Exception{

  public WrongTimeException(){
      super("A parameter in your time settings is wrong, please check");
  }
}
