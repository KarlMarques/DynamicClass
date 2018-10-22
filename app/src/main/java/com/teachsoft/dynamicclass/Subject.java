package com.teachsoft.dynamicclass;

import java.io.Serializable;

class Subject implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mTitle;

    public Subject(String title) {
        mTitle = title;
    }

    String getTitle() {
        return mTitle;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "mTitle='" + mTitle + '\'' +
                '}';
    }
}
