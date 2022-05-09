
package myfilecodes;
import java.io.*;
class FileExample1
{
	public static void main(String args[]) 
{
    File myfile=new File("D:/Assignments/Test Papers/Test Paper 2.docx");
    if(myfile.exists())
    {
    	System.out.println(myfile.getName() +" is present");
    }
    else
    {
    	System.out.println("File not present");
    	System.exit(0);
    }
    if(myfile.isFile())
    {
    	System.out.println(myfile.getName()  +" is a file");
        
    }
    else
    {
    	System.out.println(myfile.getName()  +" is a directory");
    	
    }
    if(myfile.isHidden())
    {
    	System.out.println(myfile.getName()  +" is hidden");
    }
    else
    {
    	System.out.println(myfile.getName()  +" is not hidden");
    	
    }
}
}
