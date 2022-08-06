package com.sawan;

public class Student implements Cloneable{

	private String studentName;
	private int studentRollNo;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + "]";
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentRollNo
	 */
	public int getStudentRollNo() {
		return studentRollNo;
	}
	/**
	 * @param studentRollNo the studentRollNo to set
	 */
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public Student(String studentName, int studentRollNo) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
	}
	
	
	
}
