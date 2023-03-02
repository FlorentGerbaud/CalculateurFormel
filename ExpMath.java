public interface ExpMath {
	
	public  double evaluate();
	public  double evaluate(IEnvironment ie);
	public ExpMath derivate(IEnvironment ie, String varDeriv);
}
