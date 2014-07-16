/*
	Demonstrate ...

*/

class sound {
  public static void main (String args[]) {
    double interval;
    double distance;
    int speed;

    interval = 7.2;
    speed = 1100;
 
    distance = (interval * speed) / 5280;

    System.out.println ("Lightning stuck about " + distance +  " miles away.");


  }
}
