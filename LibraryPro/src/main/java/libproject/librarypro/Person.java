/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libproject.librarypro;

/**
 *
 * @author niamh
 */
public class Person {
    private String firstName;
    private String lastName;
    private int IDnum;

    public Person(String firstName, String lastName, int IDnum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDnum = IDnum;
    }
    
    //getter methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
    return this.lastName;
    }
    public int getIDnum(){
        return this.IDnum;
    }
    //setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }   
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setIDnum(int IDnum){
        this.IDnum = IDnum; 
   }
}
