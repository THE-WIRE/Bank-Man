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
    public String name, address;
    public Date date;
    public int exp;
    public String gender;
    
    public Person()
    {
       name = null;
       date = null;
       gender = null;
       exp = 0;
    } 
}
