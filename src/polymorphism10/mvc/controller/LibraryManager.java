package polymorphism10.mvc.controller;


import polymorphism10.mvc.model.dto.AniBook;
import polymorphism10.mvc.model.dto.Book;
import polymorphism10.mvc.model.dto.CookBook;
import polymorphism10.mvc.model.dto.Member;

public class LibraryManager {
	private Member member = null;
	private Book[] books = new Book[5];

	{
		books[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		books[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		books[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		books[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		books[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member member) {
		this.member = member;
	}

	public Member myInfo() {
		return member;
	}

	public Book[] selectAll() {
		return books;
	}

	public Book[] searchBook(String keyword) {
		Book[] bookList = new Book[5];

		for(int i = 0; i < books.length; i++) {
			if(books[i].getTitle().contains(keyword)) {
				bookList[i] = books[i];
			}
		}
		return bookList;
	}

	public int rentBook(int index) {
		int result = 0;

		if(books[index-1] instanceof AniBook) {
			if(member.getAge() < ((AniBook) books[index-1]).getAccessAge() ) {
				result = 1;
			}
		}
		if(books[index-1] instanceof CookBook) {//요리책
			if(((CookBook) books[index-1]).isCoupon()) {
				result = 2;
				member.setCouponCount(member.getCouponCount() + 1);
			}
		}
		return result;
	}
}
