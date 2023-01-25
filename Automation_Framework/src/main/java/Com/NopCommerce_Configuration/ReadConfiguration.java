package Com.NopCommerce_Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties pro;
	public ReadConfiguration() {
		File src = new File("\\Users\\prati\\eclipse-workspace\\Automation_Framework\\src\\main\\java\\Com\\NopCommerce_Configuration\\Configure.properties");
		
		FileInputStream fis;

		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String getApplicationURL() {		
		String url =pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {		
		String username =pro.getProperty("username");
		return username;
	}
	public String getPassword() {		
		String password =pro.getProperty("password");
		return password;
	}
	public String getChromepath() {		
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getEdgeDriver() {		
		String Edge =pro.getProperty("Edgepath");
		return Edge;
		
	}	
	}


