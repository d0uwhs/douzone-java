package io13.figtwo.model.dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {
    private String title;
    private String author;
    private int price;
    private Calendar dates;
    private double discountRate;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Calendar getDates() {
        return dates;
    }

    public void setDates(Calendar dates) {
        this.dates = dates;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        return title + " " + author + " " + price + " " + simpleDateFormat.format(dates.getTime()) + " 출간 " + discountRate ;
    }

    public Book(String title, String author, int price, Calendar dates, double discountRate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.dates = dates;
        this.discountRate = discountRate;
    }

}
