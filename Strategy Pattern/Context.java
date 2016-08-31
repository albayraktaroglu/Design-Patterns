
public class Context {
	private Strategy _strategy;
	
	public Context (Strategy strategy){
		this._strategy = strategy;
	}
	
    public int executeStrategy(int num1, int num2){
	      return this._strategy.doOperation(num1, num2);
	}
}
