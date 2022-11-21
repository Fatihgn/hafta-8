package hafta8;

public class Engineer extends Employee{
	Engineer(String name,String surname){
		super(name,surname);
		setJob("Muhendis");
		setAnnualPermit(30);
		setSalry(12500);
		
	}
	Engineer(String name,String surname,int salry){
		super(name,surname);
		setSalry(salry);
		if(salry>15000) {
			setJob("Kidemli yuksek mühendis");
			setAnnualPermit(40);
			
		}
		else if(salry>12500) {
			setJob("Yuksek Muhendis");
			setAnnualPermit(35);
		}
		else {
			setJob("muhendis");
			setAnnualPermit(30);
		}
	}
	public int makeRaise (double howMuch) {
		double money = (double)(getSalry()*howMuch+2500);
		makeRaise((int)money);
		return getSalry();
	}
}
