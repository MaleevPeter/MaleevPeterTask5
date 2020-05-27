package MaleevTask5;

public class Scooter implements Movable {

  protected int fuelConsuption;
  protected int carrying;
  private Brand brand;
  private int price;

  protected Scooter(int fuelConsuption, int carrying, Brand brand,int price) {
    this.fuelConsuption = fuelConsuption;
    this.carrying = carrying;
    this.brand = brand;
    this.price = price;
  }

  public int getFuelConsuption() {
    return fuelConsuption;
  }

  public int getCarrying() {
    return carrying;
  }

  @Override
  public void move() {
    System.out.println("Этот метод мы перегружаем");
  }
  public int move(int numberOfKicks,int dragCoefficient){
    int speedScooter;
    return speedScooter=numberOfKicks/dragCoefficient;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return "Расход топлива - " + this.fuelConsuption + "; Грузоподъёмность - " + this.carrying
        + "; Брэнд - " + this.brand+"; Цена - "+this.price;
  }
}
