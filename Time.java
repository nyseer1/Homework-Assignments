import java.util.Objects;
public class Time{
    private int hour, minute, second;
    private String amOrPm;

    public Time(int hour, int minute, int second, String amOrPm){
        if(hour < 1 || hour > 12){
            throw new IllegalArgumentException("hour must be between 1 and 12");
        }
        else this.hour = hour;
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("minute must be between 0 and 59");
        }
        else this.minute = minute;
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("second must be between 0 and 59");
        }
        else this.second = second;
        Objects.requireNonNull(amOrPm, "amOrPm cannot be null");
            if(amOrPm.equals("AM") || amOrPm.equals("PM")){
                this.amOrPm = amOrPm;
            }
            else throw new IllegalArgumentException("amOrPm must be either \"AM\" or \"PM\""); 
        
    }
    public String toString(){
        String send = "" + hour + ":";
        if(minute < 10){
            send += "0" + minute + ":";
        }
        else send += minute + ":";
        if(second < 10){
            send += "0" + second;
        }
        else send += second;
        send += " " + amOrPm;
        return send;
    }
    public boolean equals(Object o){
        if(o instanceof Time){
            Time newO = (Time)o;
            return this.hour == newO.hour && this.minute == newO.minute && this.second == newO.second && this.amOrPm.equals(newO.amOrPm);
        }
        return false;
    }

}