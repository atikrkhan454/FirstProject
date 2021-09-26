import java.util.Scanner;

class inputprogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String firstname = input.next();

        System.out.print("Enter your middle name : ");
        String middlename = input.next();

        System.out.print("Enter your last name : ");
        String lastname = input.next();

        System.out.println("Your full name is "+firstname+" "+middlename+" "+lastname);
    }
}        