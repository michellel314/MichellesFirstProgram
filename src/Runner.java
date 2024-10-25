import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("My name is Goofy");
        System.out.println("I love gaming");
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you like gaming? (y/n): ");
        String ans = scan.nextLine();
        if(ans.equals("y")){
            System.out.println("I love playing Cookie Run Kingdom");
        } else {
            System.out.println("I recommend you to play something");
        }
    }
}
