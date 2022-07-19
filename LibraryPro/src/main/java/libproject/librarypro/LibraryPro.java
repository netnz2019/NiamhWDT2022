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

    public static void main(String[] args) throws IOException{
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
        addBook();
        addPerson();
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
           System.out.print(person.getPersonIDnum()+": ");
           System.out.print(person.getFirstName()+" ");
           System.out.println(person.getLastName());
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
//    public static void addPersonInputs(){
//        String firstName = readString("What is the person first name:");
//        String lastName = readString("What is the persons last name:");
//        int personIDnum = readInt("What is the per");
//        addPerson(firstName, lastName, personIDnum);
//        
//    }
//    public static void addPerson(String firstName, String lastName, int personIdnum){
//        Person person = new Person(firstName, lastName, personIdnum);
//        person.add(person);
//    }
    public static void addBook() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        
        try{
            fw = new FileWriter("book.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.print("She Gets the Girl,");
            pw.print("Alyson Derrick and Rachael Lippincott,");
            pw.print(9781398502635L);
            pw.print(",");
            pw.print(2);
            System.out.println("Data Successfully appended into file");
            pw.flush();
        }
        finally{
            try{
                pw.close();
                bw.close();
                fw.close();
            } catch(IOException io){}
        }
    }
    public static void addPerson() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        
        try{
            fw = new FileWriter("person.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.print("Kate,");
            pw.print("Belova,");
            pw.print(3);
            System.out.println("Data Successfully appended into file");
            pw.flush();
        }
        finally{
            try{
                pw.close();
                bw.close();
                fw.close();
            } catch(IOException io){}
        }
    }
    
 }
