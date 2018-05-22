package cn.edu.hust.utils;

import java.io.Serializable;
import java.util.List;

public class JsonBean implements Serializable{
    private List<String> categories;
    private List<Integer> datas;
    private List<KeyVlaue> keyValues;
    private List<KeyValue> keyValues2;
    private Long min;
    private Long max;

    public JsonBean() {
    }

    public JsonBean(List<String> categories, List<Integer> datas) {
        this.categories = categories;
        this.datas = datas;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<Integer> getDatas() {
        return datas;
    }

    public void setDatas(List<Integer> datas) {
        this.datas = datas;
    }

    public List<KeyVlaue> getKeyValues() {
        return keyValues;
    }

    public void setKeyValues(List<KeyVlaue> keyValues) {
        this.keyValues = keyValues;
    }

    public List<KeyValue> getKeyValues2() {
        return keyValues2;
    }

    public void setKeyValues2(List<KeyValue> keyValues2) {
        this.keyValues2 = keyValues2;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }
}
