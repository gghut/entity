package space.ggh.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ggh on 1/30/17.
 */
public abstract class DateEntity extends Entity {

    protected Date date;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateString(){
        return dateToString(date);
    }

    public void setDateString(String dateString){
        this.date = stringToDate(dateString);
    }

    public String getTimeString(){
        return timeToString(date);
    }

    public void setTimeString(String timeString){
        this.date = stringToTime(timeString);
    }

    protected String dateToString(Date date){
        return date==null?null:dateFormat.format(date);
    }

    protected Date stringToDate(String string, Date def){
        try {
            return dateFormat.parse(string);
        }catch (Exception e){
            return def;
        }
    }

    protected Date stringToDate(String string){
        return stringToDate(string, new Date());
    }

    protected String timeToString(Date time){
        return time==null?null:timeFormat.format(time);
    }

    protected Date stringToTime(String time, Date def){
        try {
            return timeFormat.parse(time);
        }catch (Exception e){
            return def;
        }
    }

    protected Date stringToTime(String time){
        return stringToTime(time, new Date());
    }

}
