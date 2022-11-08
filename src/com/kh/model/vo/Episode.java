package com.kh.model.vo;

import java.util.Date;

public class Episode {
    // ������ȣ, ��ϳ�¥, ȸ��(1ȭ, 2ȭ...), ��ȸ���� ����
    private int webtoonNo;
    private Date uploadDate;
    private int episodeNo;
    private String title;
    public Episode() {
        super();
    }
    public Episode(int webtoonNo, Date uploadDate, int episodeNo, String title) {
        this.webtoonNo = webtoonNo;
        this.uploadDate = uploadDate;
        this.episodeNo = episodeNo;
        this.title = title;
    }
    public int getWebtoonNo() {
        return webtoonNo;
    }
    public void setWebtoonNo(int webtoonNo) {
        this.webtoonNo = webtoonNo;
    }
    public Date getUploadDate() {
        return uploadDate;
    }
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    public int getEpisodeNo() {
        return episodeNo;
    }
    public void setEpisodeNo(int episodeNo) {
        this.episodeNo = episodeNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Episode [webtoonNo=" + webtoonNo + ", uploadDate=" + uploadDate + ", episodeNo=" + episodeNo
                + ", title=" + title + "]";
    }
    
    
    
}
