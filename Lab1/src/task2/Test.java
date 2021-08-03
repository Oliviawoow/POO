package task2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.print("Please provide a year: ");
        
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		Course curs = new Course();
		Student stud1 = new Student();
		Student stud2 = new Student();
		Student stud3 = new Student();
		Student stud4 = new Student();
		Student stud5 = new Student();
		
		stud1.setName("Ollie");
		stud1.setYear(2018);
		stud2.setName("Robert");
		stud2.setYear(2018);
		stud3.setName("Emilia");
		stud3.setYear(2019);
		stud4.setName("Ionut");
		stud4.setYear(2017);
		stud5.setName("Emilia");
		stud5.setYear(2019);
		Student[] students = {stud1, stud2, stud3, stud4};
		
		curs.setTitle("EGC");
		curs.setDescription("Elemente de Grafica pe Calculator");
		curs.setStudents(students);
		
		// TASK 2: Lista de studenti dintr-un anumit an
		System.out.println("Task2: Studentii din anul " + year + " sunt:");
		for(Student st : curs.filterYear(year)) {
			System.out.println(st.getName());
		}
		
		// TASK 3: 2 studenti egali
		System.out.println("Task3: Studentul 4 este aceelasi cu studentul 5:");
		System.out.println(stud3.equals(stud5));
	}
}
