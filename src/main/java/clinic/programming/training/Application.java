package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.*;

public class Application {
    /*
     * Maven Training
     * Added additional comments
     */
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public void greet(){ 
		List<String> greetings = new ArrayList<String>();
		greetings.add("Hello!");
		
		for (String greeting :greetings ){
			System.out.println("Greeting : "+greeting);
		}
	}
	
	public int countWords(String words){
		String[] separatewords = StringUtils.split(words,' ');
		return (separatewords == null) ? 0 : separatewords.length;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
	System.out.println("Word Count : "+app.countWords("I have four words"));
    }
}