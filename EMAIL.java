/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.*;
public class EMAIL {
    //variable setup
    private String FirstName;
    private String LastName;
    private String Password;
    private String Department;
    private int mailboxCapacity = 5000;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String email;
    private String em1;
    private String companySuffix = "gmail.com";
    //Constructor to receive the frst name and last name
    public EMAIL(String FirstName,String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        System.out.println("EMAIL CREATED:"+this.FirstName+" "+this.LastName);
        //call for method asking for the deprtment - return the department
        this.Department = setDepartment();
        System.out.println("Department:"+this.Department);
        //Call a method that return a random password
        this.Password = randomPassword(8);
        System.out.println(this.Password);
         //combne element to gerate element
        email = FirstName.toLowerCase() + "."+ LastName.toLowerCase() + "@" + Department + companySuffix;
        System.out.println("your email is :" + email);
        
    }
    //Ask for the department
    private String setDepartment(){
        System.out.println("Department Code:\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\n Enter department code:");
        Scanner in = new Scanner(System.in);
        int depchoise =in.nextInt();
        if(depchoise ==1){
            return "sales";
        }else if (depchoise ==2){
            return "development";
        }else if(depchoise ==3){
            return "accounting";
        }else {
            return "enter valid number";
        } 
    }
    //Generate a random passord
    private String randomPassword(int length){
        String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789/*-+!@#$%^&*(){}[]:;<>";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
           int rand = (int)(Math.random()*PasswordSet.length());
           password[i] = PasswordSet.charAt(rand);
           
        }
        System.out.println("your system genrated password is :");
        return new String(password);
    }
   
    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    
    //set alternet email
    public void setAlternetEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change the password
    public void changePassword(String password){
        this.Password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return Password;
    }
    public String showInfo(){
        return "Display Name:" + FirstName + " " + LastName+
                "\nCompany Email:"+ email +"\nMalBox Capacity:" + mailboxCapacity + "mb";
    }
}
