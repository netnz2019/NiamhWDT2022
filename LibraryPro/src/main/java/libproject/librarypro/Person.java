/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libproject.librarypro;
import java.io.*;
/**
 *
 * @author niamh
 */
public class Person {
    private String firstName;
    private String lastName;
    private int personIDnum;

    public Person(String firstName, String lastName, int personIDnum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personIDnum = personIDnum;
    }
    
    //getter methods
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
    return this.lastName;
    }
    public Integer getPersonIDnum(){
        return this.personIDnum;
    }
    //setter methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }   
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setpersonIDnum(int personIDnum){
        this.personIDnum = personIDnum; 
   }
}
