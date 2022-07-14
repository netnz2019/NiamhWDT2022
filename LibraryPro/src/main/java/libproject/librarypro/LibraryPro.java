/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package libproject.librarypro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author niamh
 */
public class LibraryPro {

    public static void main(String[] args) {
        Map<Long, Integer> bookMap = new HashMap<Long, Integer>();
        Map<String, String> personMap = new HashMap<String, String>();
        ArrayList<String> person = new ArrayList<String>();
        //person file
        String fileNamePerson = "person.txt";
        ArrayList<Person> fileDataPerson = new ArrayList<Person>();
        readFilePerson(fileNamePerson, fileDataPerson);
        showListPerson(fileDataPerson);
       //book file
        String fileNameBook = "book.txt";
        ArrayList<Book> fileDataBook = new ArrayList<Book>();
        readFileBook(fileNameBook, fileDataBook);
        showListBook(fileDataBook);
        //People
        Person Person1 = new Person("Niamh", "Webb", 1);
        Person Person2 = new Person("Layla", "Spector", 2);
        Person Person3 = new Person("Kate", "Belova", 3);
        //Book
        Book book1 = new Book("Malice", "Heather Walter", 9781529101294L, 1);
        Book book2 = new Book("She Gets the Girl", "Alyson Derrick and Rachael Lippincott", 9781398502635L, 2);
        Book book3 = new Book("Heartstopper Volume One", "Alice Oseman", 9781338617436L, 3);
        
//        // add people to arraylist
//        person.add(Person1.getFirstName()+" " + Person1.getLastName());
//        System.out.println(person);
//        bookMap.put(book1.getISBN(), Person1.getPersonIDnum());
//        personMap.put(Person1.getFirstName()+" " + Person1.getLastName(), book1.getBookName());
//        System.out.println(bookMap);
//        System.out.println(personMap);
//        
//        System.out.println("First name: " + Person1.getFirstName());
//        System.out.println("Last name: " + Person1.getLastName());
//        System.out.println("ID number: " + Person1.getPersonIDnum());
//        System.out.println("Book Name: " + book1.getBookName());
//        System.out.println("Author: " + book1.getAuthorName());
//        System.out.println("ISBN: " + book1.getISBN());
//        System.out.println("");
//        
//        System.out.println("First name: " + Person2.getFirstName());
//        System.out.println("Last name: " + Person2.getLastName());
//        System.out.println("ID number: " + Person2.getPersonIDnum());
//        System.out.println("Book Name: " + book2.getBookName());
//        System.out.println("Author: " + book2.getAuthorName());
//        System.out.println("ISBN: " + book2.getISBN());
//        System.out.println("");
//        
//        System.out.println("First name: " + Person3.getFirstName());
//        System.out.println("Last name: " + Person3.getLastName());
//        System.out.println("ID number: " + Person3.getPersonIDnum());
//        System.out.println("Book Name: " + book3.getBookName());
//        System.out.println("Author: " + book3.getAuthorName());
//        System.out.println("ISBN: " + book3.getISBN());
    }
    //A method that gets the string input so that can store than answer and ask question in same line
    public static String readString(String prompt){
        System.out.println(prompt);
        java.util.Scanner keyboard = new java.util.Scanner(System.in);   
        return keyboard.nextLine();
    }
    //method getting the int input
    public static int readInt(String prompt){   
    System.out.println(prompt);
    java.util.Scanner keyboard = new java.util.Scanner(System.in);   
    return keyboard.nextInt(); 
    }
  //Takes the array list and person txt file and reads the data and puts it in the array
    public static void readFilePerson (String fileNamePerson, ArrayList<Person> fileDataPerson){
        File file = new File(fileNamePerson);
        try{
            Scanner fileScan = new Scanner(file);
            while(fileScan.hasNextLine()){
                String[] eachItem = fileScan.nextLine().split(",");
                try{
                    int idNum = Integer.parseInt(eachItem[2].trim());
                    fileDataPerson.add(new Person(eachItem[0], eachItem[1], idNum));
                }
                catch(NumberFormatException e){
                    System.out.println(" ignoring this line - couldn't parse ");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(" File not found ");
            System.exit(1);
        }
    }
    public static void readFileBook (String fileNameBook, ArrayList<Book> fileDataBook){
        File file = new File(fileNameBook);
        try{
            Scanner fileScan = new Scanner(file);
            while(fileScan.hasNextLine()){
                String[] eachItem = fileScan.nextLine().split(",");
                try{
                    long isbn = Long.parseLong(eachItem[2].trim());
                    int idNum = Integer.parseInt(eachItem[3].trim());
                    fileDataBook.add(new Book(eachItem[0], eachItem[1], isbn, idNum));
                }
                catch(NumberFormatException e){
                    System.out.println(" ignoring this line - couldn't parse ");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(" File not found ");
            System.exit(1);
        }
    }
//prints out the details of the txt file from the array list
    public static void showListPerson(ArrayList<Person> fileDataPerson){
        System.out.println("LIST of details");
       for(Person person:fileDataPerson){
           System.out.println(person.getFirstName());
           System.out.println(person.getLastName());
           System.out.println(person.getPersonIDnum());
        }
    }
    public static void showListBook(ArrayList<Book> fileDataBook){
        System.out.println("LIST of details");
       for(Book book:fileDataBook){
           System.out.println(book.getBookName());
           System.out.println(book.getAuthorName());
           System.out.println(book.getISBN());
           System.out.println(book.getBookIDnum());
        }
    }
    public static void addPersonInputs(){
        String firstName = readString("What is the person first name:");
        String lastName = readString("What is the persons last name:");
        int personIDnum = readInt("What is the per");
        
    }
    public static void addPerson(String firstName, String lastName, int personIdnum){
        
    }
    
 }
