package ru.mirea.task29;

import java.io.Serializable;
import java.util.Arrays;

public class SavedData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] status;
    private String[] pic;

    public SavedData(String[] status, String[] pic){
        this.status = status;
        this.pic = pic;
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }

    public String[] getPic() {
        return pic;
    }

    public void setPic(String[] pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "SavedData{" +
                "status=" + Arrays.toString(status) +
                ", pic=" + Arrays.toString(pic) +
                '}';
    }
}