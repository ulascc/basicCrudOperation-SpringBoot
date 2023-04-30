package kodlama.io.programmingLanguages.entities.concretes;

public class Language {
    private int id;
    private String name;

    public Language() {

    }

    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Language setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Language setName(String name) {
        this.name = name;
        return this;
    }
}
