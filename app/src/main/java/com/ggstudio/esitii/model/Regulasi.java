package com.ggstudio.esitii.model;

/**
 * Created by garya on 9/26/2019.
 */

public class Regulasi {

    private String title;
    private String desc;
    private String fileUri;

    public Regulasi(String title, String desc, String fileUri) {
        this.title = title;
        this.desc = desc;
        this.fileUri = fileUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
