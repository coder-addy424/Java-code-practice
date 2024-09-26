package hackerRankQuestions;

public class GradeSystem {
    public static void main(String args[]) {
        String res = getGrade(100);
        System.out.println("A Student got " + res);
    }

    private static String getGrade(int marks) {

        if (marks > 90 && marks <= 100) {
            return "Grade A+";
        } else if (marks > 80 && marks <= 90) {
            return "Grade A";
        } else if (marks > 70 && marks <= 80) {
            return "Grade B";
        } else if (marks > 60 && marks <= 70) {
            return "Grade c";
        } else {
            return "Fail";
        }

    }


}
