import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("My name is Jintao");
        System.out.println("I love gaming");
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you like sleeping? (y/n): ");
        String ans = scan.nextLine();
        if(ans.equals("y")){
            System.out.println("You should give yourself a pillow");
        } else {
            System.out.println("Why");
        }
    }
}
