package CSVInterpeter;

/**
 * Created by omer on 2/27/15.
 */
public class GeoProperties {
    String msg;
    String time;
    String client;


    public GeoProperties(String msg, String time, String client) {
        this.msg = msg;
        this.time = time;
        this.client = client;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


}
