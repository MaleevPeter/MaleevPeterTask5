package MaleevTask5;

public class Enduro extends Motorcycle {

  public int treadHeight = 5;
  public int heightDifference;
  protected int increasedGroundClearance;
  protected int engineVolume;


  public Enduro(String color, String name, int number, String dateOfIssue, Brand brand, int engineVolume, int increasedGroundClearance) {
    super(color, name, number, dateOfIssue, brand);
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
}
