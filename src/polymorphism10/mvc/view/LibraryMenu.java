package polymorphism10.mvc.view;

import polymorphism10.mvc.controller.LibraryManager;
import polymorphism10.mvc.model.dto.Book;
import polymorphism10.mvc.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryManager libraryManager = new LibraryManager();
	private Scanner scanner = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = scanner.nextLine();

		System.out.print("나이 : ");
		int age = scanner.nextInt();

		System.out.print("성별 : ");
		char gender = scanner.next().charAt(0);

		Member member = new Member(name, age, gender);

		libraryManager.insertMember(member);

		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");

			String input = scanner.next();

			if (input.equals("1")) {
				System.out.println(libraryManager.myInfo());
			}

			if (input.equals("2")) {
				selectAll();
			}

			if (input.equals("3")) {
				searchBook();
			}

			if (input.equals("4")) {
				rentBook();
			}

			if (input.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	public void selectAll() {
		Book[] books = libraryManager.selectAll();
		for(int i = 0; i < books.length; i++) {
			System.out.println((i+1) + "번도서 : " + books[i]);
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = scanner.next();
		Book[] searchList = libraryManager.searchBook(keyword);

		try {
			for (Book book : searchList){
				System.out.println(book.toString());
			}
		} catch (NullPointerException e) {
			System.out.println("검색된 책이 없습니다.");
		}
	}
	
	public void rentBook() {
		System.out.print("대여할 도서 번호 선택 : ");
		Integer num = scanner.nextInt();

		Integer result = libraryManager.rentBook(num);
		if (result.equals(0)){
			System.out.println("성공적으로 대여되었습니다.");
		}

		if (result.equals(1)){
			System.out.println("나이 제한으로 대여 불가능합니다.");
		}

		if (result.equals(2)){
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}
}