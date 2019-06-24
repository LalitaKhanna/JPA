package factoryDesign;

public abstract class Thali{
	public void makeThali()
	{
		System.out.println("Veg Thali be ready in 30 minutes");
		
	}

	public abstract void addDal();
	public abstract void addRoti();
	public abstract void addRice();
	public abstract void addCurry();
	
}
