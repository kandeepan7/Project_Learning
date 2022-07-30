package ProjectPhase1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CompanyLockers {
	
	//Display Method to List out the available Options for a user
	public static int displaymenu()
	{   System.out.println("");
		System.out.println("Kindly select any one of the options 1.add 2.delete 3.search 4.Exit 5.DisplayMenu to access the files" );
		Scanner obj=new Scanner(System.in);
		//System.out.println("Enter the option");
		int option=obj.nextInt();
		return option;
	}
	//Add Function to add the file
	public static void add(String a) throws IOException
	{
	//System.out.println(a);
	File file=new File(a);
	file.createNewFile();
	System.out.println(a + "<-File got added in the respective location" );
	}
	//Delete Function to delete the file
	public static void delete(String a) throws IOException
	{
		
	File file=new File(a);
	file.delete();
	System.out.println(a + "->Respective File deleted" );
	}
	//Search to find the file
	public static void search(String a) throws IOException
	{   File file=new File(a);
		if(file.exists()){
			//creating a file
			//file.createNewFile();
			System.out.println(a + "->Respective File Exists" );
			InputStream inputstream=new FileInputStream(file);
			byte[] data=inputstream.readAllBytes();
			for (int i=0;i<data.length;i++)
			{
				char ch=(char) data[i];
				
				System.out.print(ch);
			}
			//System.out.println(data);
			inputstream.close();
		}
		
	}
	public static void main(String[] args) throws IOException {
		while(true) {
		int condition=displaymenu();	
		
		//getting the user input
		/*Scanner obj=new Scanner(System.in);
		System.out.println("Enter the option");
		int option=obj.nextInt();*/
		
		//Switch options to access the Options
		switch(condition)
		{
		
		case 1:
			System.out.println("Add Function ,get the name of file");
			Scanner obj1=new Scanner(System.in);
			String filename=obj1.nextLine();
			filename="C:\\Users\\kandeepan\\eclipse-workspace\\Accessmodifierspackage\\" + filename;
			add(filename);

			break;
		case 2:
			System.out.println("Delete Function,please enter the file name below");
			Scanner obj2=new Scanner(System.in);
			String filename2=obj2.nextLine();
			filename2="C:\\Users\\kandeepan\\eclipse-workspace\\Accessmodifierspackage\\" + filename2;
			delete(filename2);
            break;
		case 3:
			System.out.println("Search Function,Enter the filename below");
			Scanner obj3=new Scanner(System.in);
			String filename3=obj3.nextLine();
			filename3="C:\\Users\\kandeepan\\eclipse-workspace\\Accessmodifierspackage\\" + filename3;
			search(filename3);
            break;
		case 4:
			System.exit(0);
			
		case 5:
			//displaymenu();
			
		default:
			System.out.println("Not a available option: select only 1 or 2 or 3 or 4");
			
		}
		
		}
	
	}

}
