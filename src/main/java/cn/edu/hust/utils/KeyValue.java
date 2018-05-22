package cn.edu.hust.utils;

public class KeyValue {
    private String name;
    private Long value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public KeyValue(String name, Long value) {
        this.name = name;
        this.value = value;
    }
}
