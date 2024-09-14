package Basic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*{
firstName=Amod,
lastName=Mahajan,
age=28,
salary=10000.56,
IsMarried=true,
Hobbies=[Music, computers, Games],
TechSkill={
    Programming language=Java,
    WebAutomation=Selenium,
    API testing=Rest Assured
}
}*/

public class UserDataExample {
    public static void main(String[] args) {

        HashMap<String, Object> UserData = new HashMap<String, Object>();
        UserData.put("firstName", "Amod");
        UserData.put("lastName", "Mahajan");
        UserData.put("age", 28);
        UserData.put("salary", 10000.56);
        UserData.put("IsMarried", true);
        
        ArrayList<String> hobbies = new ArrayList<String>();
        hobbies.add("Music");
        hobbies.add("computers");
        hobbies.add("Games");
        
        //Add List to Map
        UserData.put("Hobbies", hobbies);
        
        HashMap<String, String> TechSkill = new HashMap<String, String>();
        TechSkill.put("Programming language", "Java");
        TechSkill.put("WebAutomation", "Selenium");
        TechSkill.put("API testing", "Rest Assured");
        
        //Add @nd Map to main Map
        UserData.put("TechSkill", TechSkill);

        // Print the map
        for (Map.Entry<String, Object> entry : UserData.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


