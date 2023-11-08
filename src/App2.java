
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.transform.SourceLocator; 

public class App2 {
    public static void main(String[] args) throws Exception {
        boolean verific; 
        verific = true;
        while (verific == true){
            Scanner menu2 = new Scanner(System.in); 
            System.out.println("1 | 2 | 3 | 4 "); 
            int menuSelec = Integer.parseInt(menu2.nextLine()); 
                if(menuSelec == 1){
                    verific = false;
                } 
        } 
    }
}; 