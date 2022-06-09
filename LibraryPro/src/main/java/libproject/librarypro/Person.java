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
    private int per;
    
    public Person (String firstName, String lastName, int per){
        this.firstName = firstName;
        this.lastName = lastName;
        this.per = per;
    }
    //getter methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
    return this.lastName;
    }
    public int getPer(){
        return this.per;
    }
    //setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }   
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPer(int per){
        this.per = per; 
   }
}
