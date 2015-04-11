package CSVInterpeter;


import com.google.gson.Gson;

import java.io.*;

public class CSVInterpeter {

    public static void main(String[] args) {
       CSVInterpeter obj = new CSVInterpeter();
        obj.run();
    }

    public void run() {
        // These are the settings that you cant change and modify for the current run.

        // Input CSV FILE + Output file name:
        String csvFile = "/Users/omer/Desktop/Tweets/tweets15M.csv";
        String fileNameToSave = "/Users/omer/Desktop/Tweets/1MMessages.json";

        // The number of messages you want to convert to the JSON file:
        int numOfMessages = 1000000;

        // Would you like to save also the Messages themselves or just the Location + Time ?
        Boolean saveMessagesData = true;



        BufferedReader br = null;
        String lineFromFile = "";
        String csvSplitBy = "\\t";
        int lineNumber = 0;


        try {
            br = new BufferedReader(new FileReader(csvFile));
            FileWriter writer = new FileWriter(fileNameToSave);

            while ((lineFromFile = br.readLine()) != null) {
                if (lineNumber > (numOfMessages-1))
                    break;
                GeoJSON geoJSON;
                try {
                    String[] line = lineFromFile.split(csvSplitBy);
                    String[] tempLine6 = line[6].split("\"");
                    line[6] = tempLine6[0];

                    String[] coordinates = new String[2];
                    coordinates[0] = line[1];
                    coordinates[1] = line[2];
                    String msg;

                    if (saveMessagesData) {
                         msg = line[0];
                    } else {
                         msg = "";
                    }

                    String time = line[5];
                    String client = line[6];

                    geoJSON = new GeoJSON("Feature","TwitterMessage",new Geometry("Point",coordinates), new GeoProperties(msg,time,client));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Got ArrayIndexOutOfBoundsException Exception! Line: " + lineNumber);
                    continue;
                }
                Gson gson = new Gson();
                String json = "";
                if (lineNumber == 0) {
                    json = "{\"type\":\"FeatureCollection\", \"features\": [";
                } else {
                    json+=",";
                }
                json += gson.toJson(geoJSON);

                // Good for debug. If you want to see the JSON file for this specific item.
//                System.out.println(json);
                System.out.println(lineNumber);
                writer.write(json);
                lineNumber++;

            }
            writer.write("]}");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done! Parsed " + lineNumber + " lines!");
    }


}
