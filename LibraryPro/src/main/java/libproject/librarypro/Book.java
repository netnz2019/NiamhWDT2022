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
    private String ISBN;
    private int bookIDnum;
    
    public Book (String bookName, String authorName, String ISBN, int bookIDnum){
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.bookIDnum = bookIDnum; 
   }
    //getter methods
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
    return this.authorName;
    }
    public String getISBN(){
        return this.ISBN;
    }
    public Integer getBookIDnum(){
        return this.bookIDnum;
    }
    //setter methods
    public void setBookName(String bookName){
        this.bookName = bookName;
    }   
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    public void setPer(String ISBN){
        this.ISBN = ISBN; 
   }
    public void setBookIDnum(int bookIDnum){
        this.bookIDnum = bookIDnum;
    }
}
