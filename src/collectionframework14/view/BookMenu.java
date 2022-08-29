package collectionframework14.view;

import collectionframework14.controller.BookManager;
import collectionframework14.model.dto.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner scanner = new Scanner(System.in);
    private BookManager bookManager = new BookManager();

    public BookMenu() {
    }

    public void mainMenu() {
        while (true) {
            System.out.printf("*** 도서 관리 프로그램\n" +
                    "1. 새 도서 추가\n" +
                    "2. 도서 삭제\n" +
                    "3. 도서 검색 출력\n" +
                    "4. 전체출력\n" +
                    "0. 끝내기\n" +
                    "메뉴 번호 선택 : ");
            String select = scanner.nextLine();
            if (select.equals("0")) {
                System.out.println("프로그램 종료");
                break;
            }
            if (select.equals("1")) {
                insertBook();
            }
            if (select.equals("2")) {
                deleteBook();
            }
            if (select.equals("3")) {
                searchBook();
            }
            if (select.equals("4")) {
                selectList();
            }
        }
    }

    public void insertBook() {
        System.out.printf("도서 제목 : ");
        String bTitle = scanner.nextLine();
        System.out.printf("\n도서 장르(1:인문 / 2:자연과학 / 3:의료 / 4: 기타) : ");
        int bCategories = Integer.parseInt(scanner.nextLine());
        System.out.printf("\n도서 저자 : ");
        String bAuthor = scanner.nextLine();
        Book book = new Book();
        book.setTitle(bTitle);
        book.setCategory(bCategories);
        book.setAuthor(bAuthor);
        bookManager.insertBook(book);
    }

    public void deleteBook() {
        System.out.printf("도서 번호 :  ");
        int bNo = scanner.nextInt();
        int result = bookManager.deleteBook(bNo);
        if (result == 1) {
            System.out.println("성공적으로 삭제");
        }
        if (result == 0) {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }
    }

    public void searchBook() {
        System.out.printf("도서 제목 : ");
        String bTitle = scanner.nextLine();
        ArrayList<Book> searchBookList = bookManager.searchBook(bTitle);
        if (searchBookList.isEmpty()) {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        if (!searchBookList.isEmpty()) {
            for (Book book : searchBookList) {
                System.out.println(book.toString());
            }
        }
    }

    public void selectList() {
        ArrayList<Book> bookArrayList = bookManager.selectList();
        if (bookArrayList.isEmpty()) {
            System.out.println("도서 목록이 존재하지 않습니다.");
        }
        for (Book book : bookArrayList) {
            System.out.println(book.toString());

        }
    }
}
