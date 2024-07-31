package nested.test.ex1;
/*
여러 권의 도서 정보를 관리할 수 있어야 한다.
각 도서는 도서 제목(title)과 저자명(author)을 가지고 있다.
시스템은 도서를 추가하고, 모든 도서의 정보를 출력하는 기능을 제공해야 한다.

Library 클래스를 완성해라
    LibraryMain과 실행결과를 참고하자
Book 클래스는 Library 내부에서만 사용된다. Library클래스 외부로 노출하면x
Library클래스는 Book객체 배열을 사용해서 도서 목록을 관리한다.

실행결과
```
도서관 저장 공간이 부족합니다.
 == 책 목록 출력 ==
도서 제목: 책1, 저자: 저자1
도서 제목: 책2, 저자: 저자2
도서 제목: 책3, 저자: 저자3
도서 제목: 자바 ORM 표준 JPA 프로그래밍, 저자: 김영한
```
 */
public class Library {//도서 관리 시스템

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        }else{
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
