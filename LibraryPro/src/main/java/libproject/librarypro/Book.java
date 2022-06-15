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
    private long ISBN;
    
    public Book (String bookName, String authorName, long ISBN){
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
    public long getISBN(){
        return this.ISBN;
    }
    //setter methods
    public void setBookName(String bookName){
        this.bookName = bookName;
    }   
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setPer(long ISBN){
        this.ISBN = ISBN; 
   }
}
