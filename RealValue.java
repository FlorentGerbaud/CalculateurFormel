public class RealValue implements ExpMath {

	
	private double n;
	
	public RealValue(double n) {
		this.n=n;
	}
	
	@Override
	public double evaluate() {
		return Double.NaN;
	}

	@Override
	public double evaluate(IEnvironment ie) {
		// TODO Auto-generated method stub
		return this.n;
	}
	
	public String toString() {
		return String.valueOf(this.n);
	}

	@Override
	public ExpMath derivate(IEnvironment ie, String varDeriv) {
		return new RealValue(0);
	}

}
