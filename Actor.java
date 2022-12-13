
public class Actor {
	int age =71;
	String Placeofbirth="Karnataka,India",name="Rajinikanth",occupation="actor",dob="12-12-1950",active_status="active",relatives="XXXX";
	String names[]={"Rajni","Rajini","Super Star","Thalaivaa","Thalaivar"};
	String spouse="Latha", children="Aiswarya,Soundarya",awards="Dadasahem Palke Award, Padma Vibushan, Padma Bhushan, NTR National Award";
	
	public void name_and_age()
	{
	System.out.println("Name is:"+name);
	System.out.println("Other names are");
	for(int i=0;i<names.length;i++)
	{
	System.out.print(names[i]+", ");
	}
	}
	public void dob_and_place()
	{
		System.out.println("\nDOB:"+dob);
		System.out.println("Place of Birth:"+Placeofbirth);
	}
	public void occupation_and_status()
	{
		System.out.println("Occupation:"+occupation);
		System.out.println("Status:"+active_status);
	}
	public void familydetails()
	{
		System.out.println("Spouse:"+spouse);
		System.out.println("Children:"+children);
		System.out.println("Relatives:"+relatives);
	}
	public void awards()
	{
		System.out.println("Awards:"+awards);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Actor A=new Actor();
A.name_and_age();
A.dob_and_place();
A.occupation_and_status();		
A.familydetails();		
A.awards();		
		
		
		
	}

}
