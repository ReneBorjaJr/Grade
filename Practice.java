
public class Practice {
    public static void main(String[] args) {

        // random number generator between 0 - 100
        int studentScore = (int)(Math.random() * 101);

        // prints the students score
        System.out.println("Your score is: " + studentScore);

        // Determines letter grade using the ternary operator
        char letterGrade = (studentScore >= 90) ? 'A' : ((studentScore >= 80)) ? 'B' : ((studentScore >= 70)) ? 'C' : ((studentScore >= 60) ? 'D' : 'F');

        // prints out the letter grade
        System.out.println("Your grade: " + letterGrade);

    }
}
