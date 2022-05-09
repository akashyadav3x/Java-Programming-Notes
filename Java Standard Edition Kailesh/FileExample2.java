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
class FileExample2
{
	public static void main(String args[]) 
{
    File myfile=new File("D:/Assignments/Test Papers/mysecret.txt");
    System.out.println(myfile.getName()+" is present ?"+myfile.exists());
    System.out.println(myfile.getName()+" is of "+myfile.length()+ " bytes ");
    System.out.println(myfile.getName()+" is deleted ?"+myfile.delete());
    System.out.println(myfile.getName()+" is present ?"+myfile.exists());
}
}