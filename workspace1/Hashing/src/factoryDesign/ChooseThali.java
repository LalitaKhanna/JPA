package factoryDesign;

public class ChooseThali extends BaseThali {

	@Override
	public Thali createThali(String type) {
		// TODO Auto-generated method stub
		Thali thali;
		
	 switch(type.toLowerCase())
	 {
	 case "telgu":
         thali = new TelguThali();
         break;
     case "punjabi":
         thali = new PunjabiThali();
         break;

     default: throw new IllegalArgumentException("No such Thali.");
	 }
	 thali.makeThali();
	 thali.addCurry();
	 thali.addDal();
	 thali.addRice();
	 thali.addRoti();
	System.out.println("\n");
	 return thali;
	 
	}
	

	

}
