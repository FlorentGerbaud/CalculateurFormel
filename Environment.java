import java.util.HashMap;
import java.util.Map;

public class Environment implements IEnvironment {
	
	private Map<String, ExpMath> map;
	
	public Environment() {
		map = new HashMap<>();
	}
	
	@Override
	public void put(String s, ExpMath e) {
		map.put(s, e);
	}

	@Override
	public ExpMath get(String s) {
		return map.get(s);
	}
	
	@Override
	public boolean contains(String name) {
		return map.containsKey(name);
	}

}
