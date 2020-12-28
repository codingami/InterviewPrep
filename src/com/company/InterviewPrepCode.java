package com.company;

import java.sql.SQLOutput;
import java.util.HashMap;

public class InterviewPrepCode {

    // 3) & 13) Overloading
    class DisplayOverloading
    {
        public void disp(char c)
        {
            System.out.println(c);
        }
        public void disp(char c, int num)
        {
            System.out.println(c + " "+num);
        }
    }
    class Sample
    {
        public static void main(String args[])
        {
            DisplayOverloading obj = new DisplayOverloading();
            obj.disp('a');
            obj.disp('a',10);
        }
    }

    //output: a & a, 10

    // 3) & 13) Overriding

    class Human{
        //Overridden method
        public void eat()
        {
            System.out.println("Human is eating");
        }
    }
    class Boy extends Human{
        //Overriding method
        public void eat(){
            System.out.println("Boy is eating");
        }
        public static void main( String args[]) {
            Boy obj = new Boy();
            //This will call the child class version of eat()
            obj.eat();
        }
    }

    //output: Boy is eating

    // 4) Inheritance

    class Parent {

        public String ("I'm the parent abstract class and I have a child class that extends me");

    }

    // derived class
    class Child extends Parent {}

    // 5) & 30) Encapsulation

    protected String();
    private String();
    public String();

    // 8) Single Responsibility - in this class we can create methods for as many variation sof printing text as we want
    // because that's its job.

    public class TextPrinter {
        TextManipulator textManipulator;

        public TextPrinter(TextManipulator textManipulator) {
            this.textManipulator = textManipulator;
        }

        public void printText() {
            System.out.println(textManipulator.getText());
        }

        public void printOutEachWordOfText() {
            System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
        }

        public void printRangeOfCharacters(int startingIndex, int endIndex) {
            System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
        }
    }

    // 9) Open/Close Principle

    //delegate each operation into their respective class:
    public interface CalculatorOperation {
        void perform();
    }

    //addition class could implement the logic of adding two numbers:
    public class Addition implements CalculatorOperation {
        private double left;
        private double right;
        private double result;

        // constructor, getters and setters

        @Override
        public void perform() {
            result = left + right;
        }
    }

    //Calculator class doesn't need to implement new logic as we introduce new operators:
    public class Calculator {

        public void calculate(CalculatorOperation operation) {
            if (operation == null) {
                throw new InvalidParameterException("Cannot perform operation");
            }
            operation.perform();
        }
    }

    // 10) Liskov's substitution Principle - using square and rectangle example. Square inherits from rectangle;
    // square is a rectangle
    public class Rectangle {

        private int length;
        private int breadth;

        public int getLength() {
            return length;
        }
    }

    public class Square extends Rectangle {
        @Override
        public void setBreadth(int breadth) {
            super.setBreadth(breadth);
            super.setLength(breadth);
        }
    }

    // 11) Interface Segregation

    //Payment Interface
    public interface Payment {
        Object status();
        List<Object> getPayments();
    }

    //Interface Bank is the only one that needs intiatePayments
    public interface Bank extends Payment {
        void initiatePayments();
    }

    //Interface Loan is the only one that needs initiateLoanSettlement and initiateRePayment
    public interface Loan extends Payment {
        void intiateLoanSettlement();
        void initiateRePayment();
    }

    // 17) ArrayStoreException
    public class GFG {
        public static void main(String args[]) {
            //use try-catch blcok
            //to handle ArrayStoreException
            try {
                Object a[] = new Double [2];

                //this will throw ArrayStoreException
                a[0] = 4;
            }
            catch (ArrayStoreException e) {
                //when caught, print the arraystoreexception
                System.out.println("ArrayStoreException found: ") + e);
            }
        }
    }

    // 19) HashMap Example
    //create empty hashmap
    HashMap<String, Integer> map = new HashMap<>();

    //add elements
    map.put("amirah", 10);

    //print size and content
    System.out.println(map.size());
    System.out.println(map);


    // 25) & 29) Final, Finally, Finalize

    //Final
    final int MINIMUM;
    MINIMUM = -1;

    //Finally
    finally{System.out.println("finally block is always executed");}

    //Finalize
    ObjectDemo cal = new ObjectDemo();

    System.out.println("Finalizing...");
    cal.finalize();

    // 28) Instance variable
    public class Employee {
        //this instance variable is visible for any child class
        public String name;
    }

    // 35) Class Variable
    static int data = 30;

    // 38) Enumerated type
    enum Color = {BLACK, BLUE, PURPLE, RED};

    public class Test {
        public static void main(String[] args) {
            Color cl = Color.RED;
            System.out.println(cl);
        }
    }

    // 40) Generic or Type Parameter

    class Box<T extends Edible & Food>;

}


