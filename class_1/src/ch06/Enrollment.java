package ch06;

public class Enrollment {

	//등록 기록
	//홍길동 학생은 수학 1을 등록한다 (등록기록1)
	//이순신 학생은 화학1을 등록한다 (등록기록2)
	
	private int enrollmentId;
	private Student student;
	private Course course;
	
	// 데이터 베이스는 영구적으로 보관하고 싶을때 쓴다.
	// 데이터베이스에 저장되면 어떻게 저장되는지 생각해보면 좋다.
	
	public Enrollment(int enrollmentId, Student student, Course course) {
		this.enrollmentId = enrollmentId;
		this.student = student;
		this.course = course;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
