
public class Divide implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		if( num1 != 0 ){
			return num1 / num2;
		}
		return -1;
	}

}
