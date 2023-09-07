package DB;

public class Teacher {
    private int id;
    private String name;
    private String surname;
    private int rating;

    public Teacher() {
    }

    public Teacher(int id, String name, String surname, int rating) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
