import java.util.Scanner;
public class LessonPointCalculator2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        double lesson2Exam1,lesson2Exam2,lesson2Exam3;
        double lesson3Exam1,lesson3Exam2,lesson3Exam3;
        double lesson1Exam1,lesson1Exam2,lesson1Exam3;
        double lesson4Exam1,lesson4Exam2,lesson4Exam3;
        double lesson5Exam1,lesson5Exam2,lesson5Exam3;

        double result1,result1Total,result2,result2Total,result3,result3Total,result4,result4Total,result5,result5Total;
        double total,totalAverage;

        String message1,message2,message3,message4,message5,message6,message7,message8,message9,message10
                ,message11,message12;

        String lesson1Message1,lesson1Message2,lesson1message3;
        String lesson2Message1,lesson2Message2,lesson2message3;
        String lesson3Message1,lesson3Message2,lesson3message3;
        String lesson4Message1,lesson4Message2,lesson4message3;
        String lesson5Message1,lesson5Message2,lesson5message3;

        message1 = "Welcome to report card average calculator 2";
        message2 = "Please enter notes";
        message3 = " (You stayed. You should work harder.)";
        message4 = " (You passed. You can achieve better by working harder)";
        message5 = " (You passed. Congratulations, we wish you continued success.)";
        message6 = "Your gpa from this course : ";
        message7 = "You entered an invalid grade";
        message8 = "You did not win the silver certificate. We recommend that you work harder next year.";
        message9 = "Congratulations, you have won a silver certificate. You can achieve better success by working harder next year.";
        message10 = "Congratulations, you have won the golden certificate. We wish you continued success.";
        message11 = "Congratulations, you are perfect. You received a scholarship for the following year.";
        message12 = "Your annual gpa : ";


        lesson1Message1 = "Math exam 1 : ";
        lesson1Message2 = "Math exam 2 : ";
        lesson1message3 = "Math exam 3 : ";

        lesson2Message1 = "Physics exam 1 : ";
        lesson2Message2 = "Physics exam 2 : ";
        lesson2message3 = "Physics exam 3 : ";

        lesson3Message1 = "Language exam 1 : ";
        lesson3Message2 = "Language exam 2 : ";
        lesson3message3 = "Language exam 3 : ";

        lesson4Message1 = "Chemistry exam 1 : ";
        lesson4Message2 = "Chemistry exam 2 : ";
        lesson4message3 = "Chemistry exam 3 : ";

        lesson5Message1 = "Music exam 1 : ";
        lesson5Message2 = "Music exam 2 : ";
        lesson5message3 = "Music exam 3 : ";



        System.out.println(message1 + "\n" + message2);

        System.out.print(lesson1Message1);
        lesson1Exam1 = entry.nextDouble();
        if (lesson1Exam1 < 0 || lesson1Exam1 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson1Message2);
        lesson1Exam2 = entry.nextDouble();
        if (lesson1Exam2 < 0 || lesson1Exam2 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson1message3);
        lesson1Exam3 = entry.nextDouble();
        if (lesson1Exam3 < 0 || lesson1Exam3 > 100){
            System.out.println(message7);
        }

        result1Total = (lesson1Exam1 + lesson1Exam2) + lesson1Exam3;
        if (result1Total == 0){
            result1 = 0;
        } else {
        result1 = result1Total / 3;
        }

        System.out.println(message6 + result1);


        if (result1 < 55){
            System.out.println(message3);
        } else if (result1 >= 55 && result1 < 100) {
            System.out.println(message4);
        } else {
            System.out.println(message5);
        }


        // *****************

        System.out.print(lesson2Message1);
        lesson2Exam1 = entry.nextDouble();
        if (lesson2Exam1 < 0 || lesson2Exam1 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson2Message2);
        lesson2Exam2 = entry.nextDouble();
        if (lesson2Exam2 < 0 || lesson2Exam2 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson2message3);
        lesson2Exam3 = entry.nextDouble();
        if (lesson2Exam3 < 0 || lesson2Exam3 > 100){
            System.out.println(message7);
        }

        result2Total = (lesson2Exam1 + lesson2Exam2) + lesson2Exam3;
        if (result2Total == 0){
            result2 = 0;
        } else {
            result2 = result2Total / 3;
        }

        System.out.println(message6 + result2);

        if (result2 < 55){
            System.out.println(message3);
        } else if (result2 >= 55 && result2 < 100) {
            System.out.println(message4);
        } else {
            System.out.println(message5);
        }

        // *****************

        System.out.print(lesson3Message1);
        lesson3Exam1 = entry.nextDouble();
        if (lesson3Exam1 < 0 || lesson3Exam1 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson3Message2);
        lesson3Exam2 = entry.nextDouble();
        if (lesson3Exam2 < 0 || lesson3Exam2 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson3message3);
        lesson3Exam3 = entry.nextDouble();
        if (lesson3Exam3 < 0 || lesson3Exam3 > 100){
            System.out.println(message7);
        }

        result3Total = (lesson3Exam1 + lesson3Exam2) + lesson3Exam3;
        if (result3Total == 0){
            result3 = 0;
        } else {
            result3 = result3Total / 3;
        }

        System.out.println(message6 + result3);

        if (result3 < 55){
            System.out.println(message3);
        } else if (result3 >= 55 && result3 < 100) {
            System.out.println(message4);
        } else {
            System.out.println(message5);
        }

        // *****************

        System.out.print(lesson4Message1);
        lesson4Exam1 = entry.nextDouble();
        if (lesson4Exam1 < 0 || lesson4Exam1 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson4Message2);
        lesson4Exam2 = entry.nextDouble();
        if (lesson4Exam2 < 0 || lesson4Exam2 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson4message3);
        lesson4Exam3 = entry.nextDouble();
        if (lesson4Exam3 < 0 || lesson4Exam3 > 100){
            System.out.println(message7);
        }

        result4Total = (lesson4Exam1 + lesson4Exam2) + lesson4Exam3;
        if (result4Total == 0){
            result4 = 0;
        } else {
            result4 = result4Total / 3;
        }

        System.out.println(message6 + result4);

        if (result4 < 55){
            System.out.println(message4);
        } else if (result4 >= 55 && result4 < 100) {
            System.out.println(message4);
        } else {
            System.out.println(message5);
        }

        // *****************

        System.out.print(lesson5Message1);
        lesson5Exam1 = entry.nextDouble();
        if (lesson5Exam1 < 0 || lesson5Exam1 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson5Message2);
        lesson5Exam2 = entry.nextDouble();
        if (lesson5Exam2 < 0 || lesson5Exam2 > 100){
            System.out.println(message7);
        }
        System.out.print(lesson5message3);
        lesson5Exam3 = entry.nextDouble();
        if (lesson5Exam3 < 0 || lesson5Exam3 > 100){
            System.out.println(message7);
        }

        result5Total = (lesson5Exam1 + lesson5Exam2) + lesson5Exam3;
        if (result5Total == 0){
            result5 = 0;
        } else {
            result5 = result5Total / 3;
        }

        System.out.println(message6 + result5);

        if (result5 < 55){
            System.out.println(message4);
        } else if (result5 >= 55 && result5 < 100) {
            System.out.println(message4);
        } else {
            System.out.println(message5);
        }

        //******

        total = result1 + result2 + result3 + result4 + result5;
        totalAverage = total / 5;

        System.out.println("\n");
        System.out.println(message12 + totalAverage);

        if (totalAverage < 55){
            System.out.println(message8);
        } else if (totalAverage >= 55 && totalAverage < 75) {
            System.out.println(message9);
        } else if (totalAverage >= 75 && totalAverage < 100) {
            System.out.println(message10);
        } else {
            System.out.println(message11);
        }

    }
}
