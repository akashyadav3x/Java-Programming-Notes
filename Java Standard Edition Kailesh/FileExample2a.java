/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

/**
 *
 * @author samsung1
 */
import java.io.*;
import java.util.*;
class FileExample2a
{
	public static void main(String args[]) 
{
    File myfile=new File("D:/Assignments/Test Papers/Test Paper 2.docx");
    System.out.println("File was mod on "+myfile.lastModified());
    Date d=new Date(myfile.lastModified());
    System.out.println("The above time is "+d);
}
}
