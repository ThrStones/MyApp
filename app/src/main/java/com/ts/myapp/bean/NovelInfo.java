package com.ts.myapp.bean;

/**
 * Created by yl on 2017/8/30.
 */

public class NovelInfo {
    private int imgId;
    private int novelId;
    private String name;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getNovelId() {
        return novelId;
    }

    public void setNovelId(int novelId) {
        this.novelId = novelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovelInfo(int imgId, int novelId, String name) {
        this.imgId = imgId;
        this.novelId = novelId;
        this.name = name;
    }
}
