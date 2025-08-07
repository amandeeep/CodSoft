import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks should be between 0 to 100");
        System.out.println("Enter Maths marks: ");
        int m = sc.nextInt();
        System.out.println("Enter English marks: ");
        int e = sc.nextInt();
        System.out.println("Enter Science marks: ");
        int s = sc.nextInt();
        System.out.println("Enter Social Studies marks: ");
        int ss = sc.nextInt();
        System.out.println("Enter Hindi marks: ");
        int h= sc.nextInt();
        int total = m+s+e+ss+h;
        int avg = total/5;
        if(avg<= 100 && avg>90){
            System.out.println("Your grade is A+");
        }
        else if(avg>80) System.out.println("Your grade is A");
        else if(avg>70) System.out.println("Your grade is B++");
        else if(avg>60) System.out.println("Your grade is B");
        else if(avg>50) System.out.println("Your grade is C");
        else if(avg>= 0 && avg <=50) System.out.println("Your grade is D");
        else{
            System.out.println("Wrong marks...");
        }
        System.out.println("Your total marks is "+total);
        System.out.println("Your average marks is "+avg);

    }
}
