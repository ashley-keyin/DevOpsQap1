public class TestTime {
  public static void main(String[] args) {
    Time t1 = new Time(10, 40, 24);
    Time t2 = new Time(8, 35, 58);
    Time t3 = new Time(2, 7, 5);
    Time t4 = new Time(21, 45, 12);

    //Set times
    t1.setTime(21, 10, 59);
    System.out.println("Time object t1 = " + t1);
    t2.setTime(10, 20, 0);
    System.out.println("Time object t2 = " + t2);
    t3.setTime(11, 59, 59);
    System.out.println("Time object t3 = " + t3);
    t4.setTime(12, 0, 0);
    System.out.println("Time object t4 = " + t4);
    
    //nextSecond and previousSecond methods
    t1.nextSecond();
    System.out.println("NextSecond of Time t1 = " + t1.toString());
    t2.previousSecond();
    System.out.println("PreviousSecond of Time t2 = " + t2.toString());
    t3.nextSecond();
    System.out.println("NextSecond of Time t3 = " + t3.toString());
    t4.previousSecond();
    System.out.println("PreviousSecond of Time t4 = " + t4.toString());
  }
}
