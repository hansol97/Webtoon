package com.kh.model.vo;

public class Webtoon {
    private int webtoonNo; // 웹툰 번호
    private String title; // 웹툰 제목
    private String cartoonist; // 작가
    private int accessAge; // 분류등급
    private String plot; // 줄거리
    private String day; // 연재요일
    private String link; // 링크
    public Webtoon() {
    }
    public Webtoon(int webtoonNo, String title, String cartoonist, int accessAge, String plot, String day, String link) {
        this.webtoonNo = webtoonNo;
        this.title = title;
        this.cartoonist = cartoonist;
        this.accessAge = accessAge;
        this.plot = plot;
        this.day = day;
        this.link = link;
    }
    public int getWebtoonNo() {
        return webtoonNo;
    }
    public void setWebtoonNo(int webtoonNo) {
        this.webtoonNo = webtoonNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCartoonist() {
        return cartoonist;
    }
    public void setCartoonist(String cartoonist) {
        this.cartoonist = cartoonist;
    }
    public int getAccessAge() {
        return accessAge;
    }
    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
    public String getPlot() {
        return plot;
    }
    public void setPlot(String plot) {
        this.plot = plot;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    @Override
    public String toString() {
        return "Webtoon [webtoonNo=" + webtoonNo + ", title=" + title + ", cartoonist=" + cartoonist + ", accessAge="
                + accessAge + ", plot=" + plot + ", day=" + day + "], link=" + link + "]";
    }
    
    
    
}
