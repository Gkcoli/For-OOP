public class Main {
	
	public static void main(String[] args) {
		Person p = new Person("Gerick","Male",19);
		YoungAdult ya = new YoungAdult("Jhon","Male",2,3);
		Minor m = new Minor("Sam","Male",32, 2, 3);
		
		p.checkStatus();
		ya.checkStatus();
		m.checkStatus();
		
		ya.drink();
		m.drink();
		m.sayGradeLevel();
	}

}
