package CSVInterpeter;

/**
 * Created by omer on 1/18/15.
 */
public class Location {
        String latitude;
        String longitude;


        public Location(String latitude, String longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }



        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }


    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
