package MaleevTask5;

public class Chopper extends Motorcycle {


  public int speed;
  public int gearNumber;
  public int fuelConsuption;
  protected int rudderHeight;
  protected int steeringAngle;
  protected Chopper(String color, String name, int number, String dateOfIssue,
      Brand brand, int rudderHeight, int steeringAngle) {
    super(color, name, number, dateOfIssue, brand);
    this.rudderHeight = rudderHeight;
    this.steeringAngle = steeringAngle;
  }


  @Override
  public void move() {
    System.out.println("Я езжу медленно, но имею брутальный вид");
  }

  @Override
  public void stop() {
    System.out.println("Я тяжёлый, поэтому останавливаюсь долго");
  }

  public int getRudderHeight() {
    return rudderHeight;
  }

  public void setRudderHeight(int rudderHeight) {
    this.rudderHeight = rudderHeight;
  }

  public int getSteeringAngle() {
    return steeringAngle;
  }

  public void setSteeringAngle(int steeringAngle) {
    this.steeringAngle = number;
  }

  public void countFuelConsuption() {
    if (0 < speed && speed < 60) {
      fuelConsuption = 11;
      System.out.println("Нормальный расход топлива = " + fuelConsuption + " литров");
    } else if (60 < speed && speed < 90) {
      fuelConsuption = 9;
      System.out.println("Пониженый расход топлива = " + fuelConsuption + " литров");
    } else {
      fuelConsuption = 14;
      System.out.println("Повышеный расход топлива = " + fuelConsuption + " литров");
    }
  }

  public void outputGearNumber() {
    switch (gearNumber) {
      case 1:
        System.out.println("Первая передача");
        break;
      case 2:
        System.out.println("Вторая передача");
        break;
      case 3:
        System.out.println("Третья передача");
        break;
      case 4:
        System.out.println("Четвертая передача");
        break;
      case 5:
        System.out.println("Пятая передача");
        break;
      case 6:
        System.out.println("Шестая передача");
        break;
      default:
        System.out.println("Видимо неисправность в коробке передач");
    }
  }

}
