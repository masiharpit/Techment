package com.techment.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Patient
{
	private int patientId;
	private String name;
	private int age;
	
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + getAge() + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class NameSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class AgeSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() < o2.getAge())
			return 1;
		return -1;
		
	}
	
}
public class TestPatientList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		TreeSet<Patient> patientTreeSet = new TreeSet<Patient>();
		patientList.add(new Patient(4768, "Divya", 38));
		patientList.add(new Patient(9032, "Katyayani", 40));
		patientList.add(new Patient(1243, "Gitika", 45));
		
		Collections.sort(patientList, new NameSorting());
		System.out.println("List of Patients: ");
		for(Patient patient : patientList)
		{
			System.out.println(patient.toString());
		}
		Collections.sort(patientList, new AgeSorting());
		System.out.println("List of Patients according to Age: ");
		for(Patient patient : patientList)
		{
			System.out.println(patient.toString());
		}
		
		
		for(Patient patient : patientList)
		{
			patientTreeSet.add(patient);
		}
		for(Patient patient : patientTreeSet)
		{
			System.out.println(patient.toString());
		}
	}

}
