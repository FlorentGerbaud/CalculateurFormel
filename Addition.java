public class Addition extends BinaryOp{

	private ExpMath expAddl;
	private ExpMath expAddr;
	
	public Addition(ExpMath el, ExpMath er) {
		super("+", el, er);
		this.expAddl=el;
		this.expAddr=er;
	}

	@Override
	public double evaluate() {
		return Double.NaN;
	}

	@Override
	public double evaluate(IEnvironment ie) {
	
		double F = expAddl.evaluate(ie)+expAddr.evaluate(ie);
		return F;
	}

	@Override
	public ExpMath derivate(IEnvironment ie, String varDeriv) {
		return new Addition(expAddl.derivate(ie, varDeriv),expAddr.derivate(ie, varDeriv));
	}

}
