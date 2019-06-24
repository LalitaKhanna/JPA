package factoryDesign;

public class KhannaKhaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseThali Veg = new ChooseThali();
		Thali punjabiThali = Veg.createThali("punjabi");
		Thali telguThali = Veg.createThali("Telgu");
	}

}
