/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package libproject.librarypro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author niamh
 */
public class LibraryPro {

    public static void main(String[] args) {
        Map<Long, Integer> bookMap = new HashMap<Long, Integer>();
        Map<String, String> personMap = new HashMap<String, String>();
        ArrayList<String> person = new ArrayList<String>();
        //People
        Person Person1 = new Person("Niamh", "Webb", 1);
        Person Person2 = new Person("Layla", "Spector", 2);
        Person Person3 = new Person("Kate", "Belova", 3);
        //Book
        Book book1 = new Book("Malice", "Heather Walter", 9781529101294L);
        Book book2 = new Book("She Gets the Girl", "Alyson Derrick and Rachael Lippincott", 9781398502635L);
        Book book3 = new Book("Heartstopper Volume One", "Alice Oseman", 9781338617436L);
        
        // add people to arraylist
        person.add(Person1.getFirstName()+" " + Person1.getLastName());
        System.out.println(person);
        bookMap.put(book1.getISBN(), Person1.getIDnum());
        personMap.put(Person1.getFirstName()+" " + Person1.getLastName(), book1.getBookName());
        System.out.println(bookMap);
        System.out.println(personMap);
        
        System.out.println("First name: " + Person1.getFirstName());
        System.out.println("Last name: " + Person1.getLastName());
        System.out.println("ID number: " + Person1.getIDnum());
        System.out.println("Book Name: " + book1.getBookName());
        System.out.println("Author: " + book1.getAuthorName());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("");
        
        System.out.println("First name: " + Person2.getFirstName());
        System.out.println("Last name: " + Person2.getLastName());
        System.out.println("ID number: " + Person2.getIDnum());
        System.out.println("Book Name: " + book2.getBookName());
        System.out.println("Author: " + book2.getAuthorName());
        System.out.println("ISBN: " + book2.getISBN());
        System.out.println("");
        
        System.out.println("First name: " + Person3.getFirstName());
        System.out.println("Last name: " + Person3.getLastName());
        System.out.println("ID number: " + Person3.getIDnum());
        System.out.println("Book Name: " + book3.getBookName());
        System.out.println("Author: " + book3.getAuthorName());
        System.out.println("ISBN: " + book3.getISBN());
    }
}
