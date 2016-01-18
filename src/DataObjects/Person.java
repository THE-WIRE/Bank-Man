/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;
import java.util.Date;
/**
 *
 * @author Shrikant
 */
public class Person {
    public String name;      
    public String adrs;         //Address
    public Date dob;            //Date of birth
    public String gen;          //Gender
    public String mob;          //Mobile number
    
    public Person()
    {
       name = null;
       dob = null;
       gen = null;
       adrs=null;
       mob=null;
      
    } 
}
