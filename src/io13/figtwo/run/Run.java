package io13.figtwo.run;

import io13.figtwo.controller.BookManager;

public class Run {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.fileSave();
        bookManager.fileRead();
    }
}
