import java.io.File;
import java.util.Iterator;
public class Filewrap {

	File file;
	Filewrap(String name){
		this.file = new File(name);
	}
	
	//copy constructor
	private Filewrap convertFile(File file2) {
		 Filewrap file3 = new Filewrap(file2.getAbsolutePath());
		return file3;
	}
	
	public String getAbsolutePath(){
		return this.file.getAbsolutePath();
		
	}
	
	public Filewrap[] listFiles(){
		 File[] arr = this.file.listFiles();
		 
		 Filewrap[] arr2 = new Filewrap[arr.length];
		 for(int i = 0; i < arr.length; i++){
			 Filewrap temp = convertFile(arr[i]);
			 arr2[i] = temp;
		 }
		 return arr2;
	}
	
	
	public boolean isDirectory(){
		return this.file.isDirectory();
		
	}
	
	public long length(){
		return this.file.length();
	}
	
	public int compareTo(Filewrap other){
		if(this.file.length() > other.file.length()){
			return 1;
		}
		else if(this.file.length() < other.length()){
			return -1;
		}
		else{
			return 0;
		}
	}

	

}
