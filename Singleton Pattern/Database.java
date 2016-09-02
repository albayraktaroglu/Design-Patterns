package singleton;

public class Database {
	   //create an object of SingleObject
	   private static Database instance = new Database();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Database(){}

	   //Get the only object available
	   public static Database getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
