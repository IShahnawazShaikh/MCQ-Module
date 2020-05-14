package com.shahnawazshaikh.checkingstringtype;

import android.webkit.MimeTypeMap;

class MyBean {
    private String question;
    private String q1;
    private String q2;
    private String q3;
    private String q4;

    public MyBean(String question, String q1, String q2, String q3, String q14) {
        this.question = question;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q14;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public boolean isViewableImage(String name) {
        String suffix = name.substring(name.lastIndexOf('.') + 1).toLowerCase();
        if (suffix.length() == 0)
            return false;
        if (suffix.equals("svg"))
            // don't support svg preview
            return false;

        String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(suffix);
        if (mime == null)
            return false;
        return mime.contains("image");
    }
}
