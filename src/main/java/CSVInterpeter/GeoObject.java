package CSVInterpeter;

/**
 * Created by omer on 1/18/15.
 */

public class GeoObject {

        String msg;
        Location location;
        String time1;
        String time2;
        String client;

        public GeoObject(String msg, Location location, String time1, String time2, String client) {
            this.msg = msg;
            this.location = location;
            this.time1 = time1;
            this.time2 = time2;
            this.client = client;
        }



        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }




        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getTime1() {
            return time1;
        }

        public void setTime1(String time1) {
            this.time1 = time1;
        }

        public String getTime2() {
            return time2;
        }

        public void setTime2(String time2) {
            this.time2 = time2;
        }

        public String getClient() {
            return client;
        }

        public void setClient(String client) {
            this.client = client;
        }


        @Override
        public String toString() {
            return "geoObject{" +
                    "msg='" + msg + '\'' +
                    ", location: longitude='" + location.getLongitude() + '\'' + ", latitude=" + location.getLatitude() + '\'' +
                    ", time1='" + time1 + '\'' +
                    ", time2='" + time2 + '\'' +
                    ", client='" + client + '\'' +
                    '}';
        }







}
