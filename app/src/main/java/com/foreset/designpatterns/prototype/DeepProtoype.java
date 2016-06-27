package com.foreset.designpatterns.prototype;

import java.io.Serializable;
import java.util.Objects;

/**
 * 深复制
 * Created by zhijian on 2016/6/27.
 */
public class DeepProtoype implements Serializable{
    private String attr;
    private Object object;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

//    public DeepProtoype deepClone() {
//
//    }
}
