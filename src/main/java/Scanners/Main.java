package Scanners;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naritaa
 */

public class Main {
    
    public static void main(String[] args) {
        
        String names = BookManager.getAuthor();
        System.out.println(names); 
        
        String books = BookManager.getBook();
  
        BookManager.addBook("Percy Jackson ", " Rick Riordan");
        System.out.println(names);
        System.out.println(books);
        
    }
}
