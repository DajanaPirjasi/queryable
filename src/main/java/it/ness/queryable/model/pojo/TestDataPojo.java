package it.ness.queryable.model.pojo;

import it.ness.queryable.model.QT;

import java.util.List;

public class TestDataPojo {
    public List<QT> tFieldList;
    public String rsPath;

    @Override
    public String toString() {
        return "TestDataPojo{" +
                "tFieldList=" + tFieldList +
                ", rsPath='" + rsPath + '\'' +
                '}';
    }
}
