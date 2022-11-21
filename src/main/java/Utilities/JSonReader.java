package Utilities;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSonReader {
	
	public static int getForeignPlayer() {
		int noOfForeignPlayer = 0;

		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader("/Users/amitkumar/Desktop/data.json"));
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray array = (JSONArray) jsonObject.get("player");
			for (int i = 0; i < array.size(); i++) {
				String str = array.get(i).toString();
				if(!str.contains("India")) {
            		noOfForeignPlayer+=1;
            	}
			}
			System.out.println("No Of Foreign Player in Team : "+noOfForeignPlayer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return noOfForeignPlayer;
	}
	
	public static int getWicketKeeperCount() {
		int noOfWicketKeeper = 0;

		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader("/Users/amitkumar/Desktop/data.json"));
			JSONObject jsonObject = (JSONObject) obj;

			JSONArray array = (JSONArray) jsonObject.get("player");
			for (int i = 0; i < array.size(); i++) {
				String str = array.get(i).toString();
				if(str.contains("Wicket-keeper")) {
            		noOfWicketKeeper+=1;
            	}
			}
			System.out.println("No Of Wicket Keeper in Team : "+noOfWicketKeeper);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return noOfWicketKeeper;

	}
}
