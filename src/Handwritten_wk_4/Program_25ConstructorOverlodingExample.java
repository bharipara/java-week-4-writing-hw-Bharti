package Handwritten_wk_4;

public class Program_25ConstructorOverlodingExample {
    //Java program to overload constructors

        int id;
        String name;
        int age;

        //creating two arg constructor
        public Program_25ConstructorOverlodingExample(int i, String n) {
            id = i;
            name = n;

        }

        //creating three arg constructor
        public Program_25ConstructorOverlodingExample(int i, String n, int a) {
            id = i;
            name = n;
            age = a;

        }

        public void display() {
            System.out.println(id + " " + name + " " + age);
        }

        public static void main(String args[]) {
            Program_25ConstructorOverlodingExample s1 = new Program_25ConstructorOverlodingExample(111, "Karan");
           Program_25ConstructorOverlodingExample s2 = new Program_25ConstructorOverlodingExample(222, "Aryan", 25);
            s1.display();
            s2.display();
        }
    }

