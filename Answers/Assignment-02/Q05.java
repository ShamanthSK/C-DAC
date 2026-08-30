// Assignment 02 - Question 05: Check Voting Eligibility
public class Q05 {
    static boolean isEligible(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int age = 21;
        boolean eligible = isEligible(age);

        System.out.println("Age: " + age);
        if (eligible) {
            System.out.println("Status: Eligible to vote.");
        } else {
            System.out.println("Status: Not eligible to vote.");
        }
    }
}