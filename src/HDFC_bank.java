import java.util.Scanner;
public class HDFC_bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("<<<<--Welcome to the HDFC Bank -->>>>");
        System.out.println("1.Deposit Money ");
        System.out.println("2.Withdraw Money ");
        System.out.println("3.show  balance ");
        System.out.println("4.Show contact details ");
        int input=scanner.nextInt();
        int dep=10000;

         int s=0;
        switch (input){
            case 1:
                System.out.println("Enter the balance");
                 s=scanner.nextInt();
                deposit(s);
                break;
            case 2:

                System.out.println("First deposit ");
                int with=scanner.nextInt();
                deposit(with);
                System.out.println("Enter for withdrawal balance");
                int sub=scanner.nextInt();
              withdra(sub,with);
              break;
            case 3:

                System.out.println("First deposit ");
                int show=scanner.nextInt();

                deposit(show);
                break;
            case 4:
                System.out.println("Name - Dipu Kumar");
                System.out.println("Father's Name - Mr. Pramod Sah");
                System.out.println("A/C no - 1234563");
                break;

        }
    }




    public static void withdra(int a ,int b){

        System.out.println("Remaining balance "+(b-a));

    }
    public static void deposit(int a){

        System.out.println("Total balance "+a);

    }
}
