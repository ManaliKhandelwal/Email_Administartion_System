package emailapp;
import java.awt.*;
import java.util.*;

public class Email {
    public Scanner sc = new Scanner(System.in);
    private String fname;
    private String lname;
    private String dept;
    private String email;
    private String password;
    private String alter_email;

    public Email(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        System.out.println("New Employee: " + fname + " " + lname);
        this.dept = setDept();
        this.email = generate_Email();
        this.password = generate_password();


    }
//    Email creation for comapany
    private String generate_Email()
        {
           return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+this.dept.toLowerCase()+".infosys.com";
          }

//          setting a Department of company
    private String setDept(){
        System.out.println("Department name: \n1. Sales \n2. Development \n3. Accounting \n4. None");
        boolean flag = false;
        do {
            System.out.println("Enter Your Choice :- ");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 4:
                    return "None";
                default:
                    System.out.println("Invalid Choice, Please enter valid choice.");
            }
        }while (!flag);
        return null;
    }

//    generate password for email Id
    private String generate_password(){
        Random random = new Random();
        String alpha_capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alpha_lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbol = "!@#$%^%&*()_+";
        String password_value = alpha_capital+alpha_lower+symbol+numbers;

        String password = "";
        for(int i=0;i<8;i++){
            int index = random.nextInt(password_value.length());
            password += password_value.charAt(index);
        }
        return password;
    }

//    changing the password
    public void change_password(){
        boolean flag = false;
        System.out.println("Do you want to change password? (Y/N)");
        char choice = sc.next().charAt(0);
        do {
            if(choice == 'y' || choice == 'N') {
                flag = true;
                System.out.println("Enter Current Password: ");
                String temp = sc.next();
                if (temp.equals(this.password)) {
                    System.out.println("Enter new Password:");
                    this.password = sc.next();
                    System.out.println("Password changed successfully!");
                } else {
                    System.out.println("Enter valid current password");
                }
            }
                else if (choice == 'n' || choice == 'N')
                {
                    flag = true;
                    System.out.println("Password change option cancelled!");
                }
                else
                {
                    System.out.println("Choice Invalid!!");
                }

        }while (!flag);
    }

//    alternate Email Id
    public void alternate_email(){
            System.out.println("Enter alternate Email id for recovery :");
            this.alter_email = sc.next();
            System.out.println("Alternate Email Id is set! ");
    }

//    displaying the user information
    public void getinfo(){
        System.out.println("New Employee:");
        System.out.println("Name: "+this.fname+" "+this.lname);
        System.out.println("Department: "+this.dept);
        System.out.println("Email: "+this.email);
        System.out.println("Password: "+this.password);
        System.out.println("Alter Email-Id: "+this.alter_email);
    }
}













