public class Time {

private int hour;
private int minute;
private int second;


public Time(int hour, int minute, int second) {
  this.hour = hour;
  this.minute = minute;
  this.second = second;
}

public int getHour() {
  return hour;
}
public int getMinute() {
  return minute;
}
public int getSecond() {
  return second;
}
public void setHour(int hour) {
  this.hour = hour;
}
public void setMinute(int minute) {
  this.minute = minute;
}
public void setSecond(int second) {
  this.second = second;
}
public void setTime(int h, int m, int s) 
{
  if (h >= 0 && h < 24)
    hour = h;
  else
    hour = 0;
  if (m >= 0 && m <= 59)
    minute = m;
  else
    minute = 0;
  if (s >= 0 && s <= 59)
    second = s;
  else
    second = 0;
  
}
// nextSecond() method : advance by 1 second and return this instance
public void nextSecond(){
  second ++;
    if (second >= 60)
    {
       second = 0;
       minute ++;
    }
    if(minute >= 60)
    {
       hour++;
       minute = 0;
    }
    if(hour >= 24)
    {
       hour = 0;
    }
}
// previousSecond() method : decrease by 1 second and return the instance  
public void previousSecond(){
  second --;
  if (second <= 1)
  {
    second = 59;
    minute--;
  }
  if(minute <= 1)
  {
    hour--;
    minute = 59;
  }
  if(hour <= 1)
  {
    hour = 59;
  }

}


public String toString() {
  //format padding with leading zeros
  String formatHour = String.format("%02d", hour);
  String formatMinute = String.format("%02d", minute);
  String formatSecond = String.format("%02d", second);
  String formatTime = formatHour + ":" + formatMinute + ":" + formatSecond; 
  return formatTime;
}

}