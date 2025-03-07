package oops;

public class inheritence {
	    String name;

	    void eat() {
	        System.out.println(name + " is eating.");
	    }
	}

	class Dog extends inheritence {
	    void bark() {
	        System.out.println(name + " is barking.");
	    }
	
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.name = "hai";  
//	        myDog.eat();  
	        myDog.bark();
	    }
	}




