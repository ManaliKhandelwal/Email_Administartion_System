package emailapp;

import java.util.*;
import java.lang.*;

public class Main_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String f_name = sc.next();
        System.out.println("Enter Last Name:");
        String l_name = sc.next();

        Email em = new Email(f_name,l_name);


        boolean flag = false;
        do{
            System.out.println("\n********\nEnter Your Choice: \n1. Show Info \n2. Change Password \n3. Set Alternate EmailId \n4. None");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    em.getinfo();
                    break;
                case 2:
                    em.change_password();
                    break;
                case 3:
                    em.alternate_email();
                    break;
                case 4:
                    System.out.println("Thank you for using Application!!");
                    break;
                default:
                    System.out.println("Invalid choice!! Please enter valid choice");
            }

        }while (!flag);
    }
}
