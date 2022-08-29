package io13.figtwo.controller;

import io13.figtwo.model.dto.Book;

import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class BookManager {
    Scanner scanner = new Scanner(System.in);

    public BookManager() {
    }

    public void fileSave() {
        Book[] books = new Book[5];
        books[0] = new Book("C언어", "김씨", 10000, setCalender(2012, 2, 2), 0.1);
        books[1] = new Book("자바", "이씨", 20000, setCalender(2013, 3, 3), 0.2);
        books[2] = new Book("C++", "박씨", 30000, setCalender(2014, 4, 4), 0.3);
        books[3] = new Book("넛지", "서씨", 40000, setCalender(2015, 5, 5), 0.4);
        books[4] = new Book("개미", "최씨", 50000, setCalender(2015, 6, 6), 0.5);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
            for (Book book : books) {
                objectOutputStream.writeObject(book);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Calendar setCalender(int year, int month, int date) {
        Calendar returnCalender = Calendar.getInstance();
        returnCalender.set(Calendar.YEAR, year);
        returnCalender.set(Calendar.MONTH, month);
        returnCalender.set(Calendar.DATE, date);
        return returnCalender;
    }

    public void fileRead() {
        Book[] readBook = new Book[10];
        int count = 0;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("books.dat"))) {
            try {
                while (true) {
                    readBook[count] = (Book) objectInputStream.readObject();
                    System.out.println(readBook[count].toString());
                    count++;
                }
            } catch (EOFException e) {
                System.out.println("books.dat 읽기 완료!");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println("불러드릴 파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("불러드릴 파일이 없습니다.");
        }
    }
}
