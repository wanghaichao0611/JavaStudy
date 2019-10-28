package com.domain;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ALL集合 {
    private Long id;
    private List<String> list;//<List><value>
    private Map<String,String> map;//<map><entry>
    private Properties properties;//<props><prop>
    private Set<String> set;//<set><value>
    private String[] strings;//<array><value>

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}
