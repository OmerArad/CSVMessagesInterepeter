//package CSVInterpeter;
//
//
//import com.google.gson.Gson;
//import com.sun.org.apache.bcel.internal.classfile.LineNumber;
//
//import java.io.*;
//
///**
// * Created by omer on 12/29/14.
// */
//public class CSVInterpeter {
//
//
//    public static void main(String[] args) {
//
//        CSVInterpeter obj = new CSVInterpeter();
//        obj.run();
//
//    }
//
//
//
////    "msg": "\"#Wake Up in #Brooklyn... @ Hotel Le Jolie http://t.co/5aXREre9sE",
////            "location": {"latitude": "40.71660077", "longitude": "-73.95056784"},
////            "time1": "259797929",
////            "time2": "1381270382",
////            "client": "twitter_instagram"
////}
//
//
//
//
//
//
//    public void run() {
//
////        String csvFile = "/Users/omer/Desktop/10kMessagesNewCsv.csv";
//        String csvFile = "/Users/omer/Desktop/Tweets/1MTweets.csv";
//
//        BufferedReader br = null;
//        String lineFromFile = "";
//        String csvSplitBy = "\\t";
//
//
//        int lineNumber = 0;
//        try {
//            br = new BufferedReader(new FileReader(csvFile));
//            FileWriter writer = new FileWriter("/Users/omer/Desktop/Tweets/1KMessagesNewNew.json");
//
//            while ((lineFromFile = br.readLine()) != null) {
//
//                if (lineNumber > 999)
//                    continue;
//
//                GeoObject geoObject;
//                try {
//                    String[] line = lineFromFile.split(csvSplitBy);
//                    String[] tempLine6 = line[6].split("\"");
//                    line[6] = tempLine6[0];
//
//                    geoObject = new GeoObject(line[0], new Location(line[1], line[2]), line[4], line[5], line[6]);
////                    geoObject = new GeoObject("", new Location(line[1], line[2]), line[4], line[5], line[6]);       //TODO: REMOVE THAT!!!!
////                                       Currently missing line[3], which is the "location" with text.
////                                       TODO: line[3] should maybe be added afterwards ?
//                } catch (ArrayIndexOutOfBoundsException e) {
//                    System.out.println("Got ArrayIndexOutOfBoundsException Exception! Line: " + lineNumber);
//                    continue;
//                }
//                Gson gson = new Gson();
//                String json = "";
//                    if (lineNumber == 0) {
//                        json = "[";
//                    } else {
//                        json+=",";
//                    }
//                    json += gson.toJson(geoObject);
////                    System.out.println(json);
//
////                    writer.write(json + ",");
//                    writer.write(json);
////                }
//                lineNumber++;
//
//            }
//                                writer.write("]");
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println("Done! Parsed " + lineNumber + " lines!");
//    }
//
//
//}
