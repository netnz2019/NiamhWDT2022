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


/**
 *
 * @author niamh
 */
public class LibraryPro {

    public static void main(String[] args) {
        Map<Long, Integer> bookMap = new HashMap<Long, Integer>();
        Map<String, String> personMap = new HashMap<String, String>();
        ArrayList<String> person = new ArrayList<String>();
        //file
        String fileName = "data.txt";
        ArrayList<Person> fileData = new ArrayList<Person>();
        readFile(fileName, fileData);
        showList(fileData);
       
        
        //People
        Person Person1 = new Person("Niamh", "Webb", 1);
        Person Person2 = new Person("Layla", "Spector", 2);
        Person Person3 = new Person("Kate", "Belova", 3);
        //Book
        Book book1 = new Book("Malice", "Heather Walter", 9781529101294L, 1);
        Book book2 = new Book("She Gets the Girl", "Alyson Derrick and Rachael Lippincott", 9781398502635L, 2);
        Book book3 = new Book("Heartstopper Volume One", "Alice Oseman", 9781338617436L, 3);
        
        // add people to arraylist
        person.add(Person1.getFirstName()+" " + Person1.getLastName());
        System.out.println(person);
        bookMap.put(book1.getISBN(), Person1.getPersonIDnum());
        personMap.put(Person1.getFirstName()+" " + Person1.getLastName(), book1.getBookName());
        System.out.println(bookMap);
        System.out.println(personMap);
        
        System.out.println("First name: " + Person1.getFirstName());
        System.out.println("Last name: " + Person1.getLastName());
        System.out.println("ID number: " + Person1.getPersonIDnum());
        System.out.println("Book Name: " + book1.getBookName());
        System.out.println("Author: " + book1.getAuthorName());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("");
        
        System.out.println("First name: " + Person2.getFirstName());
        System.out.println("Last name: " + Person2.getLastName());
        System.out.println("ID number: " + Person2.getPersonIDnum());
        System.out.println("Book Name: " + book2.getBookName());
        System.out.println("Author: " + book2.getAuthorName());
        System.out.println("ISBN: " + book2.getISBN());
        System.out.println("");
        
        System.out.println("First name: " + Person3.getFirstName());
        System.out.println("Last name: " + Person3.getLastName());
        System.out.println("ID number: " + Person3.getPersonIDnum());
        System.out.println("Book Name: " + book3.getBookName());
        System.out.println("Author: " + book3.getAuthorName());
        System.out.println("ISBN: " + book3.getISBN());
    }
    public static void readFile (String fileName, ArrayList<Person> fileData){
        File file = new File(fileName);
        try{
            Scanner fileScan = new Scanner(file);
            while(fileScan.hasNextLine()){
                String[] eachItem = fileScan.nextLine().split(",");
                try{
                    int idNum = Integer.parseInt(eachItem[2].trim());
                    fileData.add(new Person(eachItem[0], eachItem[1], idNum));
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

    public static void showList(ArrayList<Person> fileData){
        System.out.println("LIST of details");
        for(Person person:fileData){
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(person.getPersonIDnum());
        }
    }
}
