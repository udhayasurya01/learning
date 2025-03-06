package sampleproject;


class Car {
 String brand;
 int speed;


 void display() {
     System.out.println("Brand: " + brand + ", Speed: " + speed);
 }
}

public class Myproject {
 public static void main(String[] args) {
   
     Car myCar = new Car();
     myCar.brand = "Tesla";
     myCar.speed = 200;
     
     myCar.display();
 }
}

