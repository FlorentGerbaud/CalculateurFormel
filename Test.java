
public class Test {

	public static void main(String[] args) {
		Environment env = new Environment();
		env.put("y", new Addition(new Sin(new Addition(new RealValue(3), new Sin(new Variable("x")))), new RealValue(5)));
		env.put("x", new RealValue(5));
		env.put("z", new Multiplication(new Variable("x"),new Variable("y")));
		//env.put("y", new Sin(new Addition(new Variable("x"), new RealValue(4))));
		Variable Y = new Variable("y");
		Variable Z = new Variable("z");
		//le Y sera passée en argument se sera la variable
		double F = Y.evaluate(env);
		double F2 = Z.evaluate(env);
		System.out.println("f(x)="+env.get("z"));
		System.out.println("y="+env.get("y"));
		System.out.println("x="+env.get("x"));
		System.out.println(F);
		System.out.println(F2);
	}

}
