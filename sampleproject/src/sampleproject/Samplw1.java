package sampleproject;

public class Samplw1 { 
	    int id;
	    String name;

	    public void printStudent()
	    {
	        System.out.println("Id:" + id);
	        System.out.println("Name:" + name);
	    }
	}

	class GF {
	    public static void main(String[] args)
	    {
	    	Samplw1 obj = new Samplw1();

	        obj.id = 1;
	        obj.name = "ABC";

	        obj.printStudent();
	    }
	}



	
