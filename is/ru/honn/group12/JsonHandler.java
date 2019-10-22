package is.ru.honn.group12;

import is.ru.honn.group12.Models.Publications;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *  JsonHandler.java
 *  Passes the Data in json files to an arraylist to use for testing prototype
 *
 * @author Viktor Ingi Karason, viktork17@ru.is
 *  * kt. 300696-2289
 * @version 1.0, 30 Sep 2019
 * Licensed under the Open Software License version 3.0
 * (http://opensource.org/licenses/OSL-3.0)
 */
public class JsonHandler {
    /*public static ArrayList<Friends> friendsCreator() {
        ArrayList<Friends> friendsArrayList = new ArrayList<Friends>();
        JSONParser parser = new JSONParser();
        long friendId = 0;
        String first_name = "";
        String last_name = "";
        String email = "";
        String phone = "";
        String address = "";

        try{
            //https://stackoverflow.com/questions/48708561/java-parse-json-array-from-json-file from the user "simo-r"
            Object objArr = parser.parse(new FileReader("t-302-honn_2019_Friends-P2.json"));

            JSONArray jsonArray = (JSONArray) objArr;
            for(Object obj : jsonArray){
                JSONObject jsonObject = (JSONObject) obj;
                friendId = (long) jsonObject.get("id");

                first_name = (String) jsonObject.get("first_name");

                last_name = (String) jsonObject.get("last_name");

                email = (String) jsonObject.get("email");

                phone = (String) jsonObject.get("phone");

                address = (String) jsonObject.get("address");

                friendsArrayList.add(new Friends((int)friendId, first_name, last_name, email, phone, address));
            }

        } catch (IOException | ParseException e){
            e.printStackTrace();
        }
        return friendsArrayList;
    }*/
    public static ArrayList<Publications> publicationsCreator() {
        ArrayList<Publications> publicationArrayList = new ArrayList<Publications>();
        JSONParser parser = new JSONParser();
        long publicationId = 0;
        String editor_first_name = "";
        String editor_last_name = "";
        String title = "";
        String isbn = "";
        String journal = "";
        long year = 0;
        String type = "";

        try {
            //https://stackoverflow.com/questions/48708561/java-parse-json-array-from-json-file from the user "simo-r"
            Object objArr = parser.parse(new FileReader("t-302-honn_2019_Publications-P2.json"));

            JSONArray jsonArray = (JSONArray) objArr;
            for(Object obj : jsonArray){
                JSONObject jsonObject = (JSONObject) obj;
                publicationId = (long) jsonObject.get("id");

                editor_first_name = (String) jsonObject.get("editor_first_name");

                editor_last_name = (String) jsonObject.get("editor_last_name");

                title = (String) jsonObject.get("publication_title");

                isbn = (String) jsonObject.get("isbn");

                journal = (String) jsonObject.get("journal");

                if(jsonObject.get("year") == null){
                    year = 0;
                }
                else{
                    year = (long) jsonObject.get("year");
                }

                type = (String) jsonObject.get("type");

                publicationArrayList.add(new Publications((int)publicationId, editor_first_name, editor_last_name,
                        title, isbn,  journal, (int)year, type));
            }

        } catch (ParseException | IOException e){
            e.printStackTrace();
        }
        return publicationArrayList;
    }
}
