package ConfigReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.json.JSONObject;

public class JsonReader {
	
	String filePath = System.getProperty("user.dir") + "\\TestData\\users.json";

	public void jsonWriter(Object Jsonobject) {

		try (FileWriter file = new FileWriter(filePath)) {
			file.append(Jsonobject.toString());

			// file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public JSONObject jsonReader() throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();

		Object obj = parser.parse(new FileReader(filePath));
		JSONObject jsonObject = (JSONObject) obj;
		Map jbody = (Map) jsonObject.get("result");

		return (JSONObject) jbody;
	}



}
