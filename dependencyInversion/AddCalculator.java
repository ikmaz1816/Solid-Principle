package dependencyInversion;

public class AddCalculator implements Operation {

	@Override
	public int operate(int a, int b) {
		return a+b;
		
	}

}
