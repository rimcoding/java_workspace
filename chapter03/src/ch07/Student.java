package ch07;

import java.lang.annotation.Target;

public class Student {

	//학번과 이름 정의
	private int StudentNumber;
	private String StudentName;
	//생성자 정의
	public Student(int Number,String Name) {
		this.StudentNumber = Number;
		this.StudentName = Name;
	}
	//toString 메서드와 equals 메서드를 재정의
	
	@Override
	public String toString() {
		return StudentNumber+"학번이고 이름은 "+StudentName+"입니다";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student Name = (Student)obj;
			if (this.StudentName == Name.StudentName) {
				System.out.println("동명이인입니다.");
				return true;
			}
		}
		return false;
	}
	
}
