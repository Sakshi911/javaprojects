/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class MyClass {
     static String getDate()
    {
        java.util.Date d=new java.util.Date();
        String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
        return dt;
    }
    
}
