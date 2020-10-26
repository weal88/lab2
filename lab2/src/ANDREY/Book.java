package ANDREY;

import java.lang.*;

public class Book {
    class Author {
        private String name = "Default";
        private String surname = "Default";
        public Author() {}
        public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public void set (String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public String getName () {
            return name;
        }
        public String getSurname () {
            return surname;
        }
    }
    class Name {
        private String bookname;
        public Name () {}
        public Name (String bookname) {
            this.bookname = bookname;
        }
        public void set (String bookname) {
            this.bookname = bookname;
        }
        public String getName () {
            return bookname;
        }
    }
    class Year {
        private  int year;
        public Year () {}
        public Year (int year) {
            this.year = year;
        }
        public void setYear (int year) {
            this.year = year;
        }
        public int getYear () {
            return year;
        }
    }
    Author author = new Author();
    Name name = new Name();
    Year year = new Year();
    public Book () {};
    public Book (Name name, Author authtor, Year year) {
        this.name = name;
        this.author = authtor;
        this.year = year;
    }
}