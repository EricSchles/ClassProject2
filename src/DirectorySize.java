
import java.io.*;
import java.util.*;
public class DirectorySize {

	public static double exploreDir(File directory, double TotalSize, LinkedList<File> orderedList){
		
		
		if(directory.isDirectory()){
			
			TotalSize += directory.length();
			File folder = new File(directory.getAbsolutePath());
			File[] files= folder.listFiles();
			for(int i = 0; i < files.length;i++){
				exploreDir(files[i],TotalSize,orderedList);
			}
		}
		else{
			TotalSize += directory.length();
			orderedList.add(directory);
				return TotalSize;
			}
			return TotalSize;
		}
		
	


	public static void main(String[] arguments){
		
		System.out.println("Please input a directory to traverse");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		try{
				
			String root = br.readLine();//expects absolute path!!!
			
			System.out.println(root);
			File rootDir = new File(root);
			LinkedList<File> ordered = new LinkedList<File>();
			//LinkedList<String> result 
			double size = exploreDir( rootDir, 0 , ordered);
			System.out.println(size);
			
			if(ordered.size() > 20){
			int count = 0;
			for(File elem: ordered){
				if(count >= 20){
					break;
				}
				System.out.println(elem.length() +"\t"+ elem.getAbsolutePath());
			    count++;
				
			}
			}else{
				for(File elem: ordered){
					System.out.println( elem.length() + "\t"+ elem.getAbsolutePath());
					
				}
			}
			
		}catch(IOException ioe){
			System.out.println("Failed to read in the root directory");
		}
		
	}
}

