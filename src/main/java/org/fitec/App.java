package org.fitec;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App
{
        public int addition(int a, int b)
        {
            return a+b;
        }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String studentsNumber = ResourceBundle.getBundle("param").getString("students.number");
        System.out.println( "Student Number = " + studentsNumber );

        String dateJ = ResourceBundle.getBundle("param").getString("dateJ");
        System.out.println( "Date du jour = " + dateJ );


        String random = RandomStringUtils.randomNumeric(10);
        System.out.println("Chaine =" + random);
    }
}
