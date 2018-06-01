package com.neo.dota2item.pojo;

public class Item {
    private int id;
    private String chineseName;
    private String imageName;
    private int price;
    private String active;
    private String passive;
    private String remarks;
    private String attribution;
    private int cooldown;
    private int mana;
    private String detail;

    public Item() {
    }

    public Item(String chineseName, String imageName, int price, String active, String passive, String remarks, String attribution, int cooldown, int mana, String detail) {
        this.chineseName = chineseName;
        this.imageName = imageName;
        this.price = price;
        this.active = active;
        this.passive = passive;
        this.remarks = remarks;
        this.attribution = attribution;
        this.cooldown = cooldown;
        this.mana = mana;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", chineseName='" + chineseName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", price=" + price +
                ", active='" + active + '\'' +
                ", passive='" + passive + '\'' +
                ", remarks='" + remarks + '\'' +
                ", attribution='" + attribution + '\'' +
                ", cooldown=" + cooldown +
                ", mana=" + mana +
                ", detail='" + detail + '\'' +
                '}';
    }
}
