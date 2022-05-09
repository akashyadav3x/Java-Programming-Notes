/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.File;
import java.util.Date;

/**
 *
 * @author samsung1
 */
public class FileExample2c {
    public static void main(String args[]) 
{
    File newdir=new File("D:\\Assignments\\Test Papers\\mp\\bhopal\\sca");
    System.out.println(newdir.getName()+" exists ?"+newdir.exists());
    System.out.println(newdir.getName()+" got created ?"+newdir.mkdirs());
     System.out.println(newdir.getName()+" exists ?"+newdir.exists());
}
}
