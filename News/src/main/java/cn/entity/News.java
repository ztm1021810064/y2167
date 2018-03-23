package cn.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public class News implements Serializable {
   private Integer newId;

   private String newsTitle;

   private String newsContent;

   private Integer clickCount;

   private List<Talks> list = new ArrayList<Talks>();

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public List<Talks> getList() {
        return list;
    }

    public void setList(List<Talks> list) {
        this.list = list;
    }
}
