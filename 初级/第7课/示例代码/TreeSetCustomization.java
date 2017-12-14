package serven.one.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCustomization {
	
	private class Person implements Comparable<Person>{
		private int age;
		private String name;
		@Override
		public int compareTo(Person person) {
			if(this.age > person.age)return 1;
			else if(this.age < person.age) return -1;
			else return 0;
		}
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}

	public static void main(String[] args) {
		TreeSetCustomization.Person p1 = 
				new TreeSetCustomization().new Person(100, "������");
		TreeSetCustomization.Person p2 = 
				new TreeSetCustomization().new Person(200, "�Ŷ���");
		TreeSetCustomization.Person p3 = 
				new TreeSetCustomization().new Person(300, "�Ŵ��");
		TreeSetCustomization.Person p4 = 
				new TreeSetCustomization().new Person(10, "��С��");
		
		Set personSet = new TreeSet();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		for(Object p : personSet)
			System.out.println(((Person)p).getName());
		
		Iterator it = personSet.iterator();
		while(it.hasNext()){
			System.out.println(((Person)it.next()).getName());
		}
	}
}
