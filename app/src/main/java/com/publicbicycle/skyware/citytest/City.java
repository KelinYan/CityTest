package com.publicbicycle.skyware.citytest;

import java.util.List;

/**
 * Created by hc on 2016/9/30.
 */

public class City {


    /**
     * id : 110000
     * name : 北京
     * fullname : 北京市
     * pinyin : ["bei","jing"]
     * location : {"lat":39.90469,"lng":116.40717}
     * cidx : [0,16]
     */

    private String id;
    private String name;
    private String fullname;
    /**
     * lat : 39.90469
     * lng : 116.40717
     */

    private LocationBean location;
    private List<String> pinyin;
    private List<Integer> cidx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public List<String> getPinyin() {
        return pinyin;
    }

    public void setPinyin(List<String> pinyin) {
        this.pinyin = pinyin;
    }

    public List<Integer> getCidx() {
        return cidx;
    }

    public void setCidx(List<Integer> cidx) {
        this.cidx = cidx;
    }

    public static class LocationBean {
        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", location=" + location +
                ", pinyin=" + pinyin +
                ", cidx=" + cidx +
                '}';
    }
}
