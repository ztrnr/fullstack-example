package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestModel {
    private int ID;
    private String value;

    public RequestModel() {}

    public RequestModel(
             int ID,
             String value
            ) {
        this.ID = ID;
        this.value = value;
        
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVlue() {
        return district;
    }

    public void setValue(String v) {
        this.value = v;
    }
}
