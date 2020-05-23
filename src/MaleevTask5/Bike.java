package MaleevTask5;

public class Bike implements Movable {


  @Override
  public void move() {
    System.out.println("Этот метод мы перегрузим");
  }

  public int move(int cadence,int gearRatio){
    int speedBike;
    return speedBike=cadence*gearRatio;
  }
}
