package MaleevTask5;

public enum Brand {
  HONDA("Япония", 1948, "Соитиро Хонда"),
  SUZUKI("Япония", 1909, "Митио Судзуки"),
  KAWASAKI("Япония", 1896, "Кавасаки Сёдзо"),
  YAMAHA("Япония", 1887, "Торакусу Ямаха"),
  BMW("Германия", 1923, "Марк Фриц");


  public String countryOfOrigin;
  public int yearOfFoundation;
  public String founder;

  Brand(String countryOfOrigin, int yearOfFoundation, String founder) {
    this.countryOfOrigin = countryOfOrigin;
    this.founder = founder;
    this.yearOfFoundation = yearOfFoundation;
  }

}
