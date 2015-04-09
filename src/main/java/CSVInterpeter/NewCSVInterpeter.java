package CSVInterpeter;


import com.google.gson.Gson;

import java.io.*;

/**
 * Created by omer on 12/29/14.
 */
public class NewCSVInterpeter {


    public static void main(String[] args) {

       NewCSVInterpeter obj = new NewCSVInterpeter();
        obj.run();

    }

    public void run() {

        //Setup your favorite settings here !
        String csvFile = "/Users/omer/Desktop/Tweets/tweets15M.csv";
        String fileNameToSave = "/Users/omer/Desktop/Tweets/15MMMMMMMMessages.json";
        int numOfMessages = 1000;



        BufferedReader br = null;
        String lineFromFile = "";
        String csvSplitBy = "\\t";
        int lineNumber = 0;


        try {
            br = new BufferedReader(new FileReader(csvFile));
            FileWriter writer = new FileWriter(fileNameToSave);

            while ((lineFromFile = br.readLine()) != null) {
//                if (lineNumber > (numOfMessages-1))
//                    continue;
                GeoJSON geoJSON;
                try {
                    String[] line = lineFromFile.split(csvSplitBy);
                    String[] tempLine6 = line[6].split("\"");
                    line[6] = tempLine6[0];

                    String[] coordinates = new String[2];
                    coordinates[0] = line[1];
                    coordinates[1] = line[2];


                    geoJSON = new GeoJSON("Feature","TwitterMessage",new Geometry("Point",coordinates), new GeoProperties(line[0],line[5],line[6]));
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
                System.out.println(json);
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
