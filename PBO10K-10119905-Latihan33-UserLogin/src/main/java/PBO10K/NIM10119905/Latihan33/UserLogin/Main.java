/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan33.UserLogin;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Abraham Rumayara
 * Kelas    : IF10K
 * NIM      : 10119905
 * Deskripsi Program : User login
 */
public class Main {

private static String usName;
private static String passWord;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Username = ");
        usName = scanner.nextLine();
        
        System.out.println("Masukan Password = ");
        passWord = scanner.nextLine();
        
        System.out.println();
        
        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }
}


