/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class EMAILAPP {
    
    public static void main(String [] args){
        //TODO Auto-generated method stud
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String Fname = sc.next();
        System.out.println("Enter Your Last Name:");
        String Lname = sc.next();
        EMAIL em1 = new EMAIL(Fname,Lname);
       // em1.setAlternetEmail("js@gmail.com");
       System.out.println(em1.showInfo());
    }
    
}
