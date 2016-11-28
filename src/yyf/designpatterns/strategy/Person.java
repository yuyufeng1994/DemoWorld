package yyf.designpatterns.strategy;

public class Person implements Comparable<Person>{
	
	public Person(int age) {
		super();
		this.age = age;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}
	

}
