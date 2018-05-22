package cn.edu.hust.utils;

public class KeyVlaue {
    private Long value;
    private String name;

    public KeyVlaue(Long value, String name) {
        this.value = value;
        this.name = name;
    }

    public KeyVlaue() {
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
