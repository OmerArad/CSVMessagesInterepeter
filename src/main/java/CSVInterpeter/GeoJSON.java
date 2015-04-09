package CSVInterpeter;

/**
 * Created by omer on 2/27/15.
 */
public class GeoJSON {
    String type;
    String id;
    Geometry geometry;
    GeoProperties properties;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public GeoProperties getProperties() {
        return properties;
    }

    public void setProperties(GeoProperties properties) {
        this.properties = properties;
    }

    public GeoJSON(String type, String id, Geometry geometry, GeoProperties properties) {
        this.type = type;
        this.id = id;
        this.geometry = geometry;
        this.properties = properties;
    }










}




//{
//        "type": "Feature",
//        "id": "TwitterMessage",
//        "geometry": {
        //        "type": "Point",
        //        "coordinates": [102.0, 0.6]
//        },
//        "properties": {
        //        "msg": "Hello World!",
        //        "time": "259797929",
        //        "client":"twitter_instagram"
//        }
//        }
//      {"type":"Feature",
//      "id":"TwitterMessage",
//      "geometry": {
//          "type":"Point",
//          "coordinates":[40.71660077,-73.95056784]
//       },
//          "properties":
//              {"msg":"\"#Wake Up in #Brooklyn... @ Hotel Le Jolie http://t.co/5aXREre9sE",
//              "time":"259797929",
//              "client":"twitter_instagram"
//          }
// }


