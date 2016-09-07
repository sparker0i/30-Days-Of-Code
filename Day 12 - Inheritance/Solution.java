import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;
    Student(String fname , String lname , int id, int[] scores) {
        super(fname , lname , id);
        this.testScores = scores;
    }

    char calculate() {
        int temp = 0;
        for (int i = 0; i < testScores.length; ++i) {
            temp += testScores[i];
        }
        temp /= testScores.length;
        if (temp >= 90 && temp <= 100)
            return 'O';
        else if (temp >= 80 && temp < 90)
            return 'E';
        else if (temp >= 70 && temp < 80)
            return 'A';
        else if (temp >= 55 && temp < 70)
            return 'P';
        else if (temp >= 40 && temp < 55)
            return 'D';
        else
            return 'T';
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
