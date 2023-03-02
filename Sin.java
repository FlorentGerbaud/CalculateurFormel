import java.lang.Math;

public class Sin extends UnaryOp{

	private ExpMath exprSin;
	public Sin(ExpMath e) {
		super("sin", e);
		this.exprSin=e;
	}

	@Override
	public double evaluate() {
		return Double.NaN;
	}

	@Override
	public double evaluate(IEnvironment ie) {
		
		double F = this.exprSin.evaluate(ie);
		return Math.sin(F);
	}

}
