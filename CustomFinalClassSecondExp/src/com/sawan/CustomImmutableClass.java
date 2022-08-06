package com.sawan;

public final class CustomImmutableClass {

	//3.all fields should be private & final
	private final String schoolName;
	private final Integer studentStrength;
	private final Student student;	
	
	public CustomImmutableClass(String schoolName, Integer studentStrength, Student student) throws CloneNotSupportedException{
		super();
		this.schoolName = schoolName;
		this.studentStrength = studentStrength;
		//Don't allow direct access to Mutable Instance variables
		this.student = (Student)student.clone();
	}
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomImmutableClass [schoolName=" + schoolName + ", studentStrength=" + studentStrength + ", student="
				+ student + "]";
	}
	/**
	 * @return the studentStrength 
	 */
	public Integer getStudentStrength() {
		return studentStrength;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	
	
}
