public class Book extends LibraryItem{
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title,author,year,LibraryItemType.BOOK);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    // book objects
    Book book4 =new Book("intro to java","paul", 2008,400);
    Book book5 =new Book("intro to C","harvey", 2016,500);
}
