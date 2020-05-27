package MaleevTask5.MotorcycleShop;

import MaleevTask5.Brand;
import MaleevTask5.MotorcycleShop.Motorcycle;
import java.util.Date;

public class Enduro extends Motorcycle {

  protected int treadHeight;
  protected int heightDifference;
  protected int increasedGroundClearance;
  protected int engineVolume;


  public Enduro(String color, String name, int number, Date dateOfIssue, Brand brand,int price, int engineVolume, int increasedGroundClearance) {
    super(color, name, number, dateOfIssue, brand,price);
    this.engineVolume=engineVolume;
    this.increasedGroundClearance=increasedGroundClearance;
  }

  @Override
  public void move() {
    System.out.println("Я езжу по пересечённой местности");
  }

  @Override
  public void stop() {
    System.out.println("Я легко оставливаюсь");
  }

  public int getIncreasedGroundClearance() {
    return increasedGroundClearance;
  }

  public void setIncreasedGroundClearance(int increasedGroundClearance) {
    this.increasedGroundClearance = increasedGroundClearance;
  }

  public int getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(int engineVolume) {
    this.engineVolume = engineVolume;
  }

   public void printTireReplacementmessage() {
      int treadHeight = 5;
    while (treadHeight > 0) {
      if (treadHeight <= 2) {
        System.out.println("Пора заменить шины");
      }
      treadHeight -= 0.05;
    }
  }

  public void printActivationSuspension() {
    if (heightDifference > 30) {
      System.out.println("Необходимо включить пневмоподвеску");
    }
  }

  @Override
  public String toString() {
    return super.toString()+"; Объём двигателя - "+this.engineVolume+"; Увеличеный клиренс - "+this.increasedGroundClearance;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
