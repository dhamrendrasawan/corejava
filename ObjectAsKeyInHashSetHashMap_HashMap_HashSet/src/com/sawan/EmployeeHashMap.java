package com.sawan;

public class EmployeeHashMap {

	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public EmployeeHashMap(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmployeeHashMap [empId=" + empId + ", empName=" + empName + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHashMap other = (EmployeeHashMap) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
}
