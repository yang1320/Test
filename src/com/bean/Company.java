package com.bean;

public class Company {
	int empCount;
	Emp emp1;
	@Override
	public String toString() {
		return "Company [empCount=" + empCount + ", emp1=" + emp1 + "]";
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public Emp getEmp1() {
		return emp1;
	}
	public void setEmp1(Emp emp1) {
		this.emp1 = emp1;
	}
	
}
