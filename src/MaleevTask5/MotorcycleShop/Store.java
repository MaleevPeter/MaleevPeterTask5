package MaleevTask5.MotorcycleShop;

import java.util.Arrays;

public class Store<T> {


  public final int length;
  private final Object[] store;
  private T motorcycle;
  private int moneyInTheStore;


  public Store(int length) {
    store = new Object[length];
    this.length = length;
  }


  T get(int i) {

    final T motorcycle = (T) store[i];
    return motorcycle;
  }

  public void set(int i, T motorcycle) {
    store[i] = motorcycle;
  }


  public void printProducts() {
    System.out.println("Ознакомтесь со списком товаров");
    for (int i = 0; i < store.length; i++) {
      System.out.println(i + ") " + store[i]);
    }
    }

  @Override
  public String toString() {
    return Arrays.toString(store);
  }
// public void purchase()
}
