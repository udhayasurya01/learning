package oops;



public class Encaps {
    private String name;
    private int age;
  
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { if (age > 0) this.age = age; }

    public String getName() { return name; }
    public int getAge() { return age; }
}

class Main {
    public static void main(String[] args) {
    	Encaps s = new Encaps();
        s.setName("surya");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

