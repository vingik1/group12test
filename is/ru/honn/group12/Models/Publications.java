package is.ru.honn.group12.Models;
/**
 *  Publications.java
 *  Model for Publications
 * @author Viktor Ingi Karason, viktork17@ru.is
 *  * kt. 300696-2289
 * @version 1.0, 30 Sep 2019
 * Licensed under the Open Software License version 3.0
 * (http://opensource.org/licenses/OSL-3.0)
 */
public class Publications {
    private int id;
    private String editor_first_name;
    private String editor_last_name;
    private String publication_title;
    private String isbn;
    private String journal;
    private int year;
    private String type;

    public Publications() {
    }

    public Publications(int id, String editor_first_name, String editor_last_name, String publication_title,
                        String isbn, String journal, int year, String type) {
        this.id = id;
        this.editor_first_name = editor_first_name;
        this.editor_last_name = editor_last_name;
        this.publication_title = publication_title;
        this.isbn = isbn;
        this.journal = journal;
        this.year = year;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getEditor_first_name() {
        return editor_first_name;
    }

    public String getEditor_last_name() {
        return editor_last_name;
    }

    public String getPublication_title() {
        return publication_title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getJournal() {
        return journal;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEditor_first_name(String editor_first_name) {
        this.editor_first_name = editor_first_name;
    }

    public void setEditor_last_name(String editor_last_name) {
        this.editor_last_name = editor_last_name;
    }

    public void setPublication_title(String publication_title) {
        this.publication_title = publication_title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Publications{" +
                "id=" + id +
                ", editor_first_name='" + editor_first_name + '\'' +
                ", editor_last_name='" + editor_last_name + '\'' +
                ", publication_title='" + publication_title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", journal='" + journal + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                "lolololol"+
                '}';
    }
}