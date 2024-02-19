/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waaawixx;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Waaawixx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner scn = new Scanner(System.in);
    
   
    
        System.out.println("Enter Your First Name:");
        String fName = scn.nextLine();
        
        System.out.println("Enter Your Middle Name:");
        String mName = scn.nextLine();
        
        
        System.out.println("Enter Your Last Name:");
         String lName = scn.nextLine();
         
         
         System.out.println("Enter You Gender:");
         String gender = scn.nextLine();
         
         System.out.println("Enter Your Birthday:");
      
         System.out.println("Month:");
         int month = scn.nextInt();
         
         System.out.println("Year:");
         int year = scn.nextInt();
         
        
         System.out.println("Day:");
         int day = scn.nextInt();
         
         System.out.println("Enter Your Age:");
         int age = scn.nextInt();
         
         String FirstName = fName.substring(0, 1).toUpperCase() + fName.substring(1);
         
         
 
         
         System.out.println("Your Data: " + fName +" "+ mName +" "+ lName +" "+ age +" "+ gender +" "+ month +" "+ year +" "+ day+" "+ age); 
                 System.out.println(FirstName);

                 
                
                 
        
         
         scn.close();
         
}
} 