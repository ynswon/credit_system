package com.funda.kcb;

/**
 * Created by wonjun-pc on 2016-06-01.
 */
public class KCB371 {

    KCB371(int count, String label, String seg)
    {
        this.count = count;
        this.label = label;
        this.seg   = seg;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private int count;
    private String label;

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }

    private String seg;

}
