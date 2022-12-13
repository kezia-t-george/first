class Cricket
{
	void display(){
		System.out.println("Welcome to our Team");
	}
}
class Player extends Cricket
{
	 int sid;
	 String name;
	 String role;
	void display1(){
		System.out.println("Number \t Name \t\t Role");
	}	
}
public class SportsActivities extends Player {

	
	
	public SportsActivities(int sid,String name,String role) 
	{
	this.sid=sid;
	this.name=name;
	this.role=role;
	
	}
	
	public SportsActivities() {
		
	}

	public static void main(String[] args) {
		SportsActivities sa[]=new SportsActivities[11];
		SportsActivities p=new SportsActivities();
		p.display();
		p.display1();
		sa[0]=new SportsActivities(1,"Dhoni","WicketKeeper");
		sa[1]=new SportsActivities(2,"Jadega","Batsman");
		sa[2]=new SportsActivities(3,"Dinesh Karthik","Batsman");
		sa[3]=new SportsActivities(4,"Shigar Dhawan","Batsman");
		sa[4]=new SportsActivities(5,"Mohammed Shammi","Bowler");
		sa[5]=new SportsActivities(6,"Ashwin","Bowler");
		sa[6]=new SportsActivities(7,"Hardhik Pandiya","Bowler");
		sa[7]=new SportsActivities(8,"Shreyas Iyer","Batsman");
		sa[8]=new SportsActivities(9,"K.L.Rahul","Batsman");
		sa[9]=new SportsActivities(10,"Virat Kohli","Batsman");
		sa[10]=new SportsActivities(11,"Rohith Sharma","Batsman");
		for(int i=0;i<11;i++)
		{
			System.out.println(sa[i].sid+"\t"+sa[i].name+"\t"+sa[i].role);
		}
	}
}

