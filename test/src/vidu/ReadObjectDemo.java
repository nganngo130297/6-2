package vidu;
import java.io.*;
public class ReadObjectDemo {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/ntngan/Desktop/cus.txt")));
    System.out.println("Customer after deserialization:");
    Customer customer = (Customer) ois.readObject();
    System.out.println(customer);
    ois.close();
  }
}
