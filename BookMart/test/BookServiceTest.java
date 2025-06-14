package test;

import book.BookDAO;
import book.BookService;
import book.BookVO;
import book.HWBookService;
import book.HashMapBookDAO;
import book.ListBookDAO;
import book.file.FileBookDB;
import book.file.TextFileHashMapBookDAO;

public class BookServiceTest {
	static BookDAO bookDAO = new TextFileHashMapBookDAO();
	static BookService bs = new HWBookService(bookDAO);

	public static void main(String[] args) {

//		testSaveBooks();
		testLoadBooks();
		
		// 책 목록
	
		
		


	}
	
	public static void testLoadBooks() {
		((FileBookDB)bookDAO).loadBooks();
		System.out.println(bs.listBooks());
		
		bs.registBook(new BookVO("test4", "hh", "mumu", 12220, 21));
		System.out.println(bs.listBooks());
		((FileBookDB)bookDAO).saveBooks();
	}

	
	public static void testSaveBooks() {
		// 책등록
		bs.registBook(new BookVO("test", "hyunwoo", "kopo", 10000, 10));
		bs.registBook(new BookVO("test2", "woohyun", "hopo", 10000, 5));
		bs.registBook(new BookVO("test3", "LIM", "toto", 30000, 3));
		((FileBookDB)bookDAO).saveBooks();
	}
	
	
	static void serviceTest() {
		// 책 상세 정보
		System.out.println(bs.detailBookInfo(112));

		// 책정보 수정
		bs.updateBookInstock(111, 16);
		bs.updateBookPrice(112, 888888);

		System.out.println(bs.listBooks());

		// 책 삭제
		bs.removeBook(113);
		System.out.println(bs.listBooks());

		bs = new HWBookService(new HashMapBookDAO());

		System.out.println("-----------------------------------------------");
		// 책등록
		bs.registBook(new BookVO("test", "hyunwoo", "kopo", 10000, 10));
		bs.registBook(new BookVO("test2", "woohyun", "hopo", 10000, 5));
		bs.registBook(new BookVO("test3", "LIM", "toto", 30000, 3));

		// 책 목록
		System.out.println(bs.listBooks());

		// 책 상세 정보
		System.out.println(bs.detailBookInfo(112));

		// 책정보 수정
		bs.updateBookInstock(111, 16);
		bs.updateBookPrice(112, 888888);

		System.out.println(bs.listBooks());

		// 책 삭제
		bs.removeBook(113);
		System.out.println(bs.listBooks());

	}

	static void DAOTest() {
		BookDAO bookDAO = new ListBookDAO();
		// 책 등록
		bookDAO.insertBook(new BookVO("test", "hyunwoo", "kopo", 10000, 10));
		bookDAO.insertBook(new BookVO("test2", "woohyun", "hopo", 10000, 5));
		bookDAO.insertBook(new BookVO("test3", "LIM", "toto", 30000, 3));

		// 책 정보
		System.out.println(bookDAO.selectAllBooks());
		System.out.println(bookDAO.selectBook(112));

		// 책 정보 수정
		BookVO book = bookDAO.selectBook(111);
		book.setInstock(15);
		bookDAO.updateBook(book);
		System.out.println("책 수정!" + bookDAO.selectBook(111));
		System.out.println(bookDAO.selectAllBooks());

		book = bookDAO.selectBook(112);
		book.setPrice(99999);

		// 책 삭제
		bookDAO.deleteBook(113);
		System.out.println("책 삭제!" + bookDAO.selectAllBooks());
	}
}
