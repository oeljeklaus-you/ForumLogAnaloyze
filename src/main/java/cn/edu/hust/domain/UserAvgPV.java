package cn.edu.hust.domain;

public class UserAvgPV {
    private Integer id;

    private String day;

    private Float avgpv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public Float getAvgpv() {
        return avgpv;
    }

    public void setAvgpv(Float avgpv) {
        this.avgpv = avgpv;
    }
}