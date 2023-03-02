public abstract class BinaryOp implements ExpMath {

	private String operator;
	private ExpMath right;
	private ExpMath left;
	
	public BinaryOp(String s, ExpMath el, ExpMath er) {
		this.operator=s;
		this.left=el;
		this.right=er;
	}
	
	@Override
	public String toString() {
		return "(" + this.right.toString() + this.operator.toString() + this.left + ")";
	}
}
