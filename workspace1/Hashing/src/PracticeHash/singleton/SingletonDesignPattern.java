package practiceHash.singleton;

public class SingletonDesignPattern implements Cloneable {
	
	int data = 10;
	static SingletonDesignPattern singletonDesignPattern =  null;
	
	private SingletonDesignPattern() {
		
	}
	
	public static SingletonDesignPattern getSingletonDesignPatternInstance() {
		if(singletonDesignPattern == null) {
			singletonDesignPattern = new SingletonDesignPattern();
			return singletonDesignPattern;
		} else {
			return singletonDesignPattern;
		}
	}
	
	/*
	 * public static synchronized SingletonDesignPattern
	 * getSingletonDesignPatternInstance2() { if(singletonDesignPattern == null) {
	 * singletonDesignPattern = new SingletonDesignPattern(); return
	 * singletonDesignPattern; } else { return singletonDesignPattern; } }
	 */
	
	public void setData() {
		data=data+10;
	}
	
	public int getData() {
		return data;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return getSingletonDesignPatternInstance();
	}

}
