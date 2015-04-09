package CSVInterpeter;

/**
 * Created by omer on 2/27/15.
 */
public class Geometry {

        String type;
        String[] coordinates;

        public  Geometry(String type, String[] coordinates) {
            this.type = type;
            this.coordinates = coordinates;
        }



        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String[] getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(String[] coordinates) {
            this.coordinates = coordinates;
        }
}
