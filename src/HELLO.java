import java.util.Scanner;
public class HELLO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int one = scan.nextInt();
        System.out.print("Type a second number: ");
        int two = scan.nextInt();

        if(one > two){
            System.out.println(one + " is greater ");
        } else {
            System.out.println(two + "is greater ");
        }
    }
}
