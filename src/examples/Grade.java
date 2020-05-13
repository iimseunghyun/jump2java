package examples;


class Student{
	int kor;
	int eng;
	//int[] grade;
}

public class Grade {

	public static void main(String[] args) {
		// 
		Student a = new Student();
		Student b = new Student();
		a.kor = 70;
		a.eng = 80;
		b.kor = 80;
		b.eng = 90;
		
		//a.grade = new int[] {70, 80};
		//b.grade = new int[] {80, 90};
		
		//int atotal = a.grade[0]+a.grade[1];
		
		int atotal = a.kor + a.eng;
		System.out.println("a의 총점은 "+ atotal);
		System.out.println("b의 총점은 "+b.kor+b.eng);

	}

}
