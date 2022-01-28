public class Clock{
    private int hr;
    private int min;
    private int sec;

    public Clock(){
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }
    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public int getHours(){
        return hr;
    }
    public int getMinutes(){
        return min;
    }
    public int getSeconds(){
        return sec;
    }
    public void printTime(){
        if (hr>9 && min>9 && sec>9)
        System.out.println(hr + ":" + min + ":" + sec);
        else if(hr>9 && min>9 && sec<10)
        System.out.println(hr + ":" + min + ":0" + sec);
        else if(hr>9 && min<10 && sec>9)
        System.out.println(hr + ":0" + min + ":" + sec);
        else if(hr<10 && min>9 && sec>9)
        System.out.println("0"+hr + ":" + min + ":0" + sec);
        else if(hr>9 && min<10 && sec<10)
        System.out.println(hr + ":0" + min + ":0" + sec);
        else if(hr<10 && min<10 && sec>9)
        System.out.println("0"+hr + ":0" + min + ":" + sec);
        else
        System.out.println("0"+hr + ":0" + min + ":0" + sec);
    }
    public int incrementHours(){
        hr++;
        if(hr > 23){
            hr = 0;
        }
        return hr;
    }
    public int incrementMinutes(){
        min++;

        if(min == 0){
            incrementHours();
        }
        if(min > 59){
            min = 0;
        }
        return min;
    }
    public int incrementSeconds(){
        sec++;

        if(sec == 60){
            incrementMinutes();
        }
        if(sec > 59){
            min = 0;
        }
        return sec;
    }
    public boolean equals(Clock theOther){
        return this.getHours() == theOther.getHours() &&
        this.getMinutes() == theOther.getMinutes() &&
        this.getSeconds() == theOther.getSeconds();
    }
    //public void copy(Clock theOther){
    //    this.setTime(theOther.getHours(), theOther.getMinutes(), theOther.getSeconds());
    //}
    public Clock getCopy(){
        return new Clock(this.getHours(), this.getMinutes(), this.getSeconds());
    }
    public void setTime(int hr, int min, int sec) throws WrongTimeException {
          // validate the time its receiving
          if((hr < 0 || hr > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59))
            throw new WrongTimeException();

          else{
          this.hr = hr;
          this.min = min;
          this.sec = sec;
      }
    }
}
