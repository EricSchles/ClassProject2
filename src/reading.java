import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class reading {
public static void main(String[] args){
	System.out.println("Please input a directory to traverse");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	
	try{		
		String root = br.readLine();//expects absolute path!!!
		
		System.out.println(root);
		File thing = new File(root);
		System.out.println(thing.length());
		
	}catch(IOException ioe){
		System.out.println("Failed to read in the root directory");
	}
}
}
