package ua.lviv.lga.Less12.task03;

public class Books {
    private String autorSurname;
    private String name;
    private int pageCount;
    private int year;

    public Books(String autorSurname, String name, int pageCount, int year) {
        super();
        this.name = name;
        this.pageCount = pageCount;

        this.autorSurname = autorSurname;
        this.year = year;
    }

    public Books() {
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAutorSurname() {
        return autorSurname;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setAutorSurname(String autorSurname) {
        this.autorSurname = autorSurname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Books " +
                "title='" + name + '\'' +
                ", autor = " + autorSurname +
                ", " + pageCount + "p.,  " +
                "published in " + year;
    }
}
