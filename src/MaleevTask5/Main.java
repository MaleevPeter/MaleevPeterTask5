package MaleevTask5;

import MaleevTask5.MotorcycleShop.Chopper;
import MaleevTask5.MotorcycleShop.Enduro;
import java.util.Calendar;
import java.util.Date;

public class Main {

  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();

    Chopper chopper = new Chopper("Черный", "Вулкан", 7401, date, Brand.BMW, 1200, 23, 45);
    System.out.println(chopper);

    Chopper secondChopper = new Chopper("Красный", "Шум", 1105, date, Brand.KAWASAKI, 5420, 280,
        60);
    System.out.println(secondChopper);

    Enduro enduro = new Enduro("Белый", "Прыгун", 3223, date, Brand.HONDA, 1398, 431, 346);
    System.out.println(enduro);

    Enduro secondEnduro = new Enduro("Зеленый", "Воин", 999, date, Brand.HONDA, 3050, 350, 330);
    System.out.println(secondEnduro);

    Bike bike = new Bike(21, 23, Brand.SUZUKI, 235);
    System.out.println(bike);

    Scooter scooter = new Scooter(5, 150, Brand.YAMAHA, 675);
    System.out.println(scooter);


  }

}
