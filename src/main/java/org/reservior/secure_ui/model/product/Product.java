package org.reservior.secure_ui.model.product;

public class Product {
    private String serial;
    private String pid;
    private String detail;
    private String discount;
    private String image;

    public Product(String serial, String pid, String detail, String discount, String image) {
        this.serial = serial;
        this.pid = pid;
        this.detail = detail;
        this.discount = discount;
        this.image = image;
    }

    public String getSerial() {
        return serial;
    }

    public String getPid() {
        return pid;
    }

    public String getDetail() {
        return detail;
    }

    public String getDiscount() {
        return discount;
    }

    public String getImage() {
        return image;
    }
}
