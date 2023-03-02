public interface IEnvironment {

	public void put(String s, ExpMath e);
	public ExpMath get(String s); 
	public boolean contains(String name);
}
