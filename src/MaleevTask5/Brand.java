package MaleevTask5;

public enum Brand {
  HONDA("Япония", 1948, "Соитиро Хонда"),
  SUZUKI("Япония", 1909, "Митио Судзуки"),
  KAWASAKI("Япония", 1896, "Кавасаки Сёдзо"),
  YAMAHA("Япония", 1887, "Торакусу Ямаха"),
  BMW("Германия", 1923, "Марк Фриц");


  private String countryOfOrigin;
  private int yearOfFoundation;
  private String founder;

  Brand(String countryOfOrigin, int yearOfFoundation, String founder) {
    this.countryOfOrigin = countryOfOrigin;
    this.founder = founder;
    this.yearOfFoundation = yearOfFoundation;
  }

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public int getYearOfFoundation() {
    return yearOfFoundation;
  }

  public String getFounder() {
    return founder;
  }


}
