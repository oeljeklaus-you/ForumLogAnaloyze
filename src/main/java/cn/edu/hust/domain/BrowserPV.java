package cn.edu.hust.domain;

public class BrowserPV {
    private Integer id;

    private String browser;

    private String year;

    private String month;

    private String day;

    private Integer pvs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
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

    public Integer getPvs() {
        return pvs;
    }

    public void setPvs(Integer pvs) {
        this.pvs = pvs;
    }
}