package object07.level02.normal.book;


import object07.level02.normal.book.model.dto.BookDto;

public class Application {
    public static void main(String[] args) {
        BookDto nullBook = new BookDto();
        BookDto javaJungsuk = new BookDto("자바의 정석","도우출판","남궁성");
        BookDto honggildong = new BookDto("홍길동전","활빈당","허균",5000000,0.5);
        nullBook.printInformation();
        javaJungsuk.printInformation();
        honggildong.printInformation();
    }
}
