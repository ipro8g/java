import java.io.File;

public class Main{

    public static void main(String[] args){
    
        File file = new File("Main.java");
        if (!file.exists() || !file.isFile()) return;
        
        System.out.println(getFileSizeBytes(file));
		System.out.println(getFileSizeKiloBytes(file));
		System.out.println(getFileSizeMegaBytes(file));
	}

	public static String getFileSizeMegaBytes(File file) {
	
		return (double) file.length() / (1024 * 1024) + " mb";
	}
	
	public static String getFileSizeKiloBytes(File file) {
	
		return (double) file.length() / 1024 + "  kb";
	}

	public static String getFileSizeBytes(File file) {
	
		return file.length() + " bytes";
	}
}
