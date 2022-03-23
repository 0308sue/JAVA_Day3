package JAVA_03;

public class Student {
	String name;
	int grade;
	int studentID;
	
	public Student() {	
		
	}
	
	public Student(String name,int studentID,int grade) {
		this.name = name;
		this.grade = grade;
		this.studentID = studentID;
	}
	public Student(int studentID,String name,int grade) {
		this(name,studentID,grade);
	}
	
	public void study() {
		System.out.println(name+"공부하다");
	}
	public void play() {
		System.out.println(name+"운동하다");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentID = 100;
		s1.grade = 1;
		s1.name = "홍길동";
		s1.study();
		
		Student s2 = new Student("이순신",200,3);
		s2.study();
		
		Student s3 = new Student(300,"강감찬",4);
		s3.study();
		s3.play();

	}

}
