public class Variable implements ExpMath{

	private String name;
	
	public Variable(String s) {
		this.name=s;
	}
	
	public double evaluate() {
		return Double.NaN;
	}
	
	public double evaluate(IEnvironment ie) {
		
		if(ie.contains(name)) {
			ExpMath exp=ie.get(name);
			return exp.evaluate(ie);
		}
		else {
			return Double.NaN;
		}
	}
	
	public String toString() {
		return this.name;
	}

	@Override
	public ExpMath derivate(IEnvironment ie, String varDeriv) {
		if(varDeriv==this.name) {
			return new RealValue(1);
		}
		else {
			return new RealValue(0);
		}
	}
}
