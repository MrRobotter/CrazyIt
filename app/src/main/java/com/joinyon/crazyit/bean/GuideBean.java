package com.joinyon.crazyit.bean;

import java.io.Serializable;

/**
 * 作者： JoinYon on 2018/10/17.
 * 邮箱：2816886869@qq.com
 */
public class GuideBean implements Serializable {
    private String title;
    private String activity;

    public GuideBean(String title, String activity) {
        this.title = title;
        this.activity = activity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
