package MaleevTask5;

public class Bike implements Movable {

  protected int numberOfGears;
  protected int wheelDiameter;
  private Brand brand;
  private int price;

  protected Bike(int numberOfGears, int wheelDiameter, Brand brand, int price) {
    this.numberOfGears = numberOfGears;
    this.wheelDiameter = wheelDiameter;
    this.brand = brand;
    this.price = price;
  }

  public int getNumberOfGears() {
    return numberOfGears;
  }

  public int getWheelDiameter() {
    return wheelDiameter;
  }

  @Override
  public void move() {
    System.out.println("Этот метод мы перегрузим");
  }

  public int move(int cadence, int gearRatio) {
    int speedBike;
    return speedBike = cadence * gearRatio;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Диаметр колёс - " + this.wheelDiameter + "; Количество передач - " + this.numberOfGears
        + "; Брэнд - " + this.brand+"; Цена - "+this.price;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
