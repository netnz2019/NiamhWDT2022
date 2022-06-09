/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libproject.librarypro;

/**
 *
 * @author niamh
 */
public class Book {
    private String bookName;
    private String authorName;
    private int ISBN;
    
    public Book (String bookName, String authorName, int ISBN){
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }
    //getter methods
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
    return this.authorName;
    }
    public int getISBN(){
        return this.ISBN;
    }
    //setter methods
    public void setBookName(String bookName){
        this.bookName = bookName;
    }   
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setPer(int ISBN){
        this.ISBN = ISBN; 
   }
}
