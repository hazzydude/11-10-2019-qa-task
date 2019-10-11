package OOPPrinciples;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String name, int age, String job) {
		this.name=name;
		this.age=age;
		this.jobTitle=job;
		
	}
	
	
	public void nameSearch(String searchedName, ArrayList<Person> people) {
		for (Person p : people) {
			if (searchedName==name) {
				p.toString(); 
			}
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]";
	}


	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getjobTitle() {
		return jobTitle;
	}
	
	
	public void setName(String n) {
		this.name=n;
	}
	public void setAge(int a) {
		this.age=a;
	}
	public void setjobTitle(String j) {
		this.jobTitle=j;
	}
	
	
}
