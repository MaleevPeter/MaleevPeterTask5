package MaleevTask5.MotorcycleShop;

import MaleevTask5.Brand;
import MaleevTask5.Movable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Motorcycle implements Movable {

  protected String color;
  protected String name;
  protected int number;
  protected boolean isGoing;
  private Date dateOfIssue;
  private Brand brand;
  private int price;

  protected Motorcycle(String color, String name, int number, Date dateOfIssue, Brand brand, int price) {
    this.color = color;
    this.name = name;
    this.number = number;
    this.brand = brand;
    this.price = price;
    this.dateOfIssue = dateOfIssue;
  }


  public String getDateOfIssue() {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    return dateFormat.format(dateOfIssue);
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  protected boolean isGoing() {
    return isGoing;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void move();

  public abstract void stop();

  @Override
  public String toString() {
    return "Цвет - " + this.color + "; Имя -" + this.name + "; Номер -" + this.number + "; Брэнд -"
        + this.brand + "; Цена - "+this.price+"; Дата выпуска - " + this.dateOfIssue;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

}
