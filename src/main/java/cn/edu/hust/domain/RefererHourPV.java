package cn.edu.hust.domain;

public class RefererHourPV {
    private Integer id;

    private String refererUrl;

    private String refererHost;

    private String year;

    private String month;

    private String day;

    private String hour;

    private Long pvRefererCnt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefererUrl() {
        return refererUrl;
    }

    public void setRefererUrl(String refererUrl) {
        this.refererUrl = refererUrl == null ? null : refererUrl.trim();
    }

    public String getRefererHost() {
        return refererHost;
    }

    public void setRefererHost(String refererHost) {
        this.refererHost = refererHost == null ? null : refererHost.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public Long getPvRefererCnt() {
        return pvRefererCnt;
    }

    public void setPvRefererCnt(Long pvRefererCnt) {
        this.pvRefererCnt = pvRefererCnt;
    }
}