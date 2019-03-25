package com.polimorphismPractice;

import org.junit.Test;

public class PolimorphismTest {
	
	@Test
	public void test() {
		
		Animal b;
		b=new Cow();
		b.eat();
		
		b=new Dog();
		b.eat();
		
		Animal animal [] =new Animal[2];
		animal[0]=new Cow();
		animal[1]=new Dog();
		
		for (int i=0;i<animal.length;i++) {
			animal[i].eat();
		}
		
	}

}
