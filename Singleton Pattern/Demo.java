package singleton;

public class Demo {

	public static void main(String[] args) {
		  //illegal construct
	      //Compile Time Error: The constructor Database() is not visible
	      //Database ob = new Database();

	      //Get the only object available
	      Database object = Database.getInstance();

	      //show the message
	      object.showMessage();

	}

}
