package MaleevTask5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Motorcycle implements Movable {

  protected String color;
  protected String name;
  protected int number;
  protected boolean isGoing;
  Calendar calendar = Calendar.getInstance();
  Date date = calendar.getTime();
  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
  public String dateOfIssue = dateFormat.format(date);


  protected Motorcycle(String color, String name, int number, String dateOfIssue, Brand brand) {
    this.color = color;
    this.name = name;
    this.number = number;
    this.dateOfIssue = dateOfIssue;
    System.out.println(dateOfIssue);
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
    return super.toString();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

}
