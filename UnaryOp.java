public abstract class UnaryOp implements ExpMath {
	
	//
	private String operator;
	private ExpMath exp;
	
	public UnaryOp(String s, ExpMath e) {
		this.operator=s;
		this.exp=e;
	}
	
	public String toString() {
		return this.operator + "(" + this.exp.toString() + ")";
	}
}
