package com.gtmrockz;

public class Employee 
{
	private int empId;
	private String name;
	private String department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int empId, String name, String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
	
	public int hashCode()
	{
		System.out.println("Checking hashcode: "+name.hashCode());
		return name.hashCode();
		
		
	}
	
	public boolean equals(Object ob)
	{
		System.out.println("inside equals");
		boolean flag = false;
		if(ob instanceof Employee)
		{
			flag=  (((Employee)ob).getDepartment().equals(this.getDepartment()) && ((Employee)ob).getName().equals(this.getName()));
			System.out.println("Flag set at creation: "+flag);
			return flag;
		}
		return false;
		
	}
	
	
}
