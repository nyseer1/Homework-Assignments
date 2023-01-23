import java.sql.Time;

/**
 * Time24
 */
public class Time24 implements Comparable<Time24>{

    private int hour, minute, second;

    public Time24(int hour, int minute, int second){
        if(hour < 0 || hour > 23) throw new IllegalArgumentException("");
        if(minute < 0 || minute > 59) throw new IllegalArgumentException("");
        if(second < 0 || second > 59) throw new IllegalArgumentException("");
            this.hour = hour;
            this.minute = minute;
            this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public static Time24 parse(String s){
        if(s.length() != 8) throw new IllegalArgumentException("");
        String[] tokens = s.split(":");
        Time24 send = new Time24(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
        return send;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Time24){
            Time24 cast = (Time24)o;
            return this.hour == cast.hour && this.minute == cast.minute && this.second == cast.second;
        }
        return false;
    }
    @Override
    public String toString(){
        String h, m, s;
        if(this.hour < 10){
            h = "0" + this.hour;
        }
        else h = "" + this.hour;
        if(this.minute < 10){
            m = "0" + this.minute;
        }
        else m = "" + this.minute;
        if(this.second < 10){
            s = "0" + this.second;
        }
        else s = "" + this.second;
        return h + ":" + m + ":" + s;
        
    }
    @Override
    public int compareTo(Time24 o){
        if(this.hour == o.hour){
            
            if(this.minute == o.minute){
                if(this.second == o.second) return 0;
                return this.second - o.second;
            }
            return this.minute - o.minute;
        }
        return this.hour - o.hour;
    }
}