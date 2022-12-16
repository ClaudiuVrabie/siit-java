package library;

public class Book extends LibraryCatalog {
        private String bookName;

        private static int pageNumber;


        public void addBook (String bookType) {
            System.out.println(bookType + " " + "was added.");
        }


        public String getBookName () {
            return bookName;
        }

        public void setName (String Name){
            this.bookName = bookName;
        }



        public int getPageNumber (int pageNr) {
            return pageNumber;
        }

        public void setPageNumber () {
            this.pageNumber = pageNumber;
        }
    }

