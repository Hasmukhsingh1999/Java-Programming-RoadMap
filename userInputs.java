import java.util.Scanner;
public class userInputs {
    public static void main(String[] args){
//        Scanner is a class to take input
        Scanner sc = new Scanner(System.in);
        //Primitive dataTypes are pre defined like int float boolean etc size doesnt change
        //non primitive are defined by users
//        sc is an object

        //nextInt is a method is work is to take integer value
        int num1 = sc.nextInt();
        String str = sc.nextLine();
        System.out.println("Entered age is : " + num1);
        System.out.println("Name : " + str);

    }
}
