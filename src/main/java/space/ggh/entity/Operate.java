package space.ggh.entity;

import net.sf.json.JSONObject;

/**
 * Created by ggh on 3/2/17.
 */
public class Operate extends DateEntity {

    private Object o;

    private String operate;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("object", getO());
        json.put("operate", getOperate());
        json.put("date", getTimeString());
        return json;
    }
}
