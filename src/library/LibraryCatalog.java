package library;

import org.w3c.dom.ls.LSOutput;

public class LibraryCatalog {
    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book();

        Book book3 = new Book();



        book1.addBook("book1");
        book2.addBook("book2");
        book3.addBook("book3");


        Novels novels = new Novels();
        novels.setPageNumber();
        System.out.println(novels.type("SF"));


        ArtAlbums artAlbums = new ArtAlbums();
        System.out.println(artAlbums.paperQuality(70));
        artAlbums.getBookName();
        System.out.println(artAlbums.getPageNumber('4'));
    }


}