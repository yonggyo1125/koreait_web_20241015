package exam02;

public class Book extends java.lang.Object {
    private String title; // 책 제목
    private String author; // 책 저자
    private String publisher; // 출판사

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) { // 동등성 비교

        if (obj instanceof Book book) {
            if (title.equals(book.title) && author.equals(book.author) && publisher.equals(book.publisher)) {
                return true;
            }
        }

        return false;
    }
}
