package practiceHash.singleton;

public class SinglrtonDemo implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonDesignPattern singletonDesignPattern=SingletonDesignPattern.getSingletonDesignPatternInstance();
		System.out.println(singletonDesignPattern.hashCode());
		SingletonDesignPattern singletonDesignPattern2=SingletonDesignPattern.getSingletonDesignPatternInstance();
		System.out.println(singletonDesignPattern2.hashCode());
		SingletonDesignPattern singletonDesignPattern3=(SingletonDesignPattern) singletonDesignPattern.clone();
		System.out.println(singletonDesignPattern3.hashCode());
		singletonDesignPattern.setData();
		System.out.println(singletonDesignPattern.getData());
		System.out.println(singletonDesignPattern2.getData());
	}
}
