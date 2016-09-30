package com.publicbicycle.skyware.citytest;

import java.util.List;

/**
 * Created by hc on 2016/9/30.
 */

public class Response {


    /**
     * status : 0
     * message : query ok
     * data_version : 20160929
     * result : [[],[],[]]
     */

    private int status;
    private String message;
    private String data_version;
    private List<List<City>> result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData_version() {
        return data_version;
    }

    public void setData_version(String data_version) {
        this.data_version = data_version;
    }

    public List<List<City>> getResult() {
        return result;
    }

    public void setResult(List<List<City>> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data_version='" + data_version + '\'' +
                ", result=" + result +
                '}';
    }
}
