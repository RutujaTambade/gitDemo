package java;

import java.io.File;

import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hp\\Desktop\\new.txt");
		 if(f.createNewFile()) {
			 System.out.println("file is sucessfully create");
		    	//System.out.println("File name is :"+f.getName());
		    	//System.out.println("File name is read :"+f.canRead());
		    	//System.out.println("File name is write :"+f.canWrite());
		    	//System.out.println("File name path :"+f.getAbsolutePath());
		    	//System.out.println("File name length:"+f.length());
		    	//System.out.println("File name TotalSpace :"+f.getTotalSpace());
		        
		    }
		   
      else
      {
    	  System.out.println("file is Already exist");
      }
	}

}
