package yyf.designpatterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Person> list =new ArrayList<Person>();
		list.add(new Person(1));
		list.add(new Person(3));
		list.add(new Person(2));
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAge());
		}
	}
}
