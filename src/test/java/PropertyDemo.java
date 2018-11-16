import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\training_d5.01.02\\eclipse-workspace\\neha_sele\\Seleniumtest\\src\\test\\resources\\test.properties");
		FileInputStream fileinput = new FileInputStream(file);
		
		Properties properties = new Properties(); //LIFO
		
		properties.load(fileinput);//load entire data from property object
		fileinput.close();
		
		Enumeration enukeys = properties.keys();
		
		while(enukeys.hasMoreElements())
		{
			String key = (String) enukeys.nextElement();
			
			String value = properties.getProperty(key);
			System.out.println(key + ": "+ value);
		}
			//writing data
			FileOutputStream fout = new FileOutputStream(file);
			properties.setProperty("xpath","\\iframes");
			properties.store(fout,null);//saving the data into file
			fout.close();
			
			
		
				
	}

}
