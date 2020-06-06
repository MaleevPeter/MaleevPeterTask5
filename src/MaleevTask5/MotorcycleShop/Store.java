package MaleevTask5.MotorcycleShop;

import java.util.Arrays;
import java.util.Scanner;

public class Store<T extends Motorcycle> {


  public final int length;

  private final Object[] store;
  private T motorcycle;
  private int moneyInTheStore;
  private Scanner scanner;
  private java.lang.Object Object;


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

  public void purchase(int productId,int price) {

if (get(productId).getPrice()<price){
   for (int i=0;i<store.length;i++){
   if (i == productId)     break;
    else {store[i]=motorcycle;
    System.out.println(store[i]);
    }
 }
  }

  }


  @Override
  public String toString() {
    return Arrays.toString(store);
  }

}
