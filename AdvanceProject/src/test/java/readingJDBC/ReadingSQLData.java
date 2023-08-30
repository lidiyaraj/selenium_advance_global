package readingJDBC;

import java.util.List;

import org.testng.annotations.Test;

import GenericUtility.DataBaseUtility;
import GenericUtility.readdataconstructor;

public class ReadingSQLData {
	public static void main(String[] args) {
		
		DataBaseUtility utility=new DataBaseUtility();
		utility.connectionToDatabase();//"jdbc:mysql://localhost:3306/advanceselenium", "root", "root"
        List<readdataconstructor> storedata = utility.readingDataFromDatabase("SELECT * FROM student");

        for (readdataconstructor d : storedata) {
            System.out.println(d);
        }

			
		
	
		utility.closetheConnection();
		
	}

}