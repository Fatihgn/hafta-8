package hafta8;

public class Main {

	public static void main(String[] args) {
		Employee ahmet=new Employee("Ahmet","Mehmet");
		Employee hasan=new Employee("Hasan","Huseyin",6500);
		Employee leyla=new Engineer("Leyla","Mecnun");
		Employee ali=new Engineer("Ali","Veli",15001);
		ahmet.info();
		hasan.info();
		leyla.info();
		ali.info();
		
	}

}
