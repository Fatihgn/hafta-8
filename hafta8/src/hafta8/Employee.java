package hafta8;

public class Employee {
	protected String ayrac="----------------------";
	protected String name,surname,job;
	protected int salry,annualPermit;
	
	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.job = "Calisan";
		this.salry = 5500;
		this.annualPermit = 10;
	}

	public Employee(String name, String surname, int salry) {
		this.name = name;
		this.surname = surname;
		this.salry = salry;
		this.annualPermit = 10;
		if(salry>6000) {
			this.job="Kidemli calisan";
			annualPermit+=3;
		}
		else if(salry>0 && salry<=6000) {
			this.job="Calisan";
		}
		else {
			this.job="Stajyer";
			annualPermit=0;
		}
	}
	protected Employee() {
		
	}
	public int makeRaise(int howMuch) {
		salry+=howMuch;
		return salry;
	}
	public int makeRaise(double howMuch) {
		double money=(double)salry*howMuch;
		makeRaise((int) money);
		return salry;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setSalry(int salry) {
		this.salry=salry;
	}
	public void setAnnualPermit(int permit) {
		this.annualPermit=permit;
	}
	public String getJob() {
		return job;
	}
	public int getSalry() {
		return salry;
	}
	public int getAnnualPermit() {
		return annualPermit;
	}
	public void info() {
		System.out.println(getJob()+" Bilgileri\n"+ayrac+"\nCalisan ismi: "+name+ "\n Calisan soyismi: "+surname+ "\n gorevi : "+getJob()+ "\n maasi : "+getSalry()
		+"\n izin gunu : "+getAnnualPermit()+"\n"+ayrac);
	}
	public void raiseinfo() {
		System.out.println(getJob()+ " Zam uygulamasi\n"+ayrac+"\nYeni verilecek maas : "+getSalry()+"\n"+ayrac);
	}
	
	
	
	
}
