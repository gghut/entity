package space.ggh.entity;

import net.sf.json.JSONObject;

import java.util.Date;

/**
 * Created by ggh on 3/2/17.
 */
public abstract class JSONEntity extends DateEntity {

    private JSONObject content;


    public JSONObject getContent() {
        return content;
    }

    public void setContent(JSONObject content) {
        this.content = content;
    }

    public String getContentString(){
        return String.valueOf(content);
    }

    public void setContentString(String contentString){
        this.content = JSONObject.fromObject(contentString);
    }

    public Integer getJsonInt(JSONObject json, String key){
        return getJsonInt(json, key, 0);
    }

    public Integer getJsonInt(JSONObject json, String key, int def){
        try {
            return json.getInt(key);
        }catch (Exception e){
            return def;
        }
    }

    public String getJsonString(JSONObject json, String key){
        return getJsonString(json, key, "-");
    }

    public String getJsonString(JSONObject json, String key, String def){
        try {
            return json.getString(key);
        }catch (Exception e){
            return def;
        }
    }

    public Date getJsonDate(JSONObject json, String key){
        return getJsonDate(json, key, new Date());
    }

    public Date getJsonDate(JSONObject json, String key, Date def){
        try {
            return stringToDate(getJsonString(json, key), def);
        }catch (Exception e){
            return def;
        }
    }
}
