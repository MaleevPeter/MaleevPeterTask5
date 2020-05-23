package MaleevTask5;

public class Scooter implements Movable {

  @Override
  public void move() {
    System.out.println("Этот метод мы перегружаем");
  }
  public int move(int numberOfKicks,int dragCoefficient){
    int speedScooter;
    return speedScooter=numberOfKicks/dragCoefficient;
  }
}
