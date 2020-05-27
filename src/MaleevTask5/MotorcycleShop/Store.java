package MaleevTask5.MotorcycleShop;

public class Store<Motorcycle> {



  public Store<Motorcycle>[] products = new Store[4];

  private int moneyInTheStore;

  public Store(){

  }


  public void printProducts() {
    System.out.println("Ознакомтесь со списком товаров");
    for (int i = 0; i < products.length; i++) {
      System.out.println(i + ") " + products[i]);
    }

  }

 // public void purchase()
}
