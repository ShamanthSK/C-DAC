package test;

public class SimpleInterest {
    public static void main(String[] args) {
    float principal = 10000;
    float rate = 9;
    float time = 2;
    float simpleInterest = (principal * rate * time) / 100;
    System.out.println("Principal: " + principal);
    System.out.println("Rate: " + rate + "%");
    System.out.println("Time: " + time + " years");
    System.out.println("Simple Interest: " + simpleInterest);
    }
}