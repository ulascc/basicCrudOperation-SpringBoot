package kodlama.io.programmingLanguages.dataAccess.abstracts;

import kodlama.io.programmingLanguages.entities.concretes.Language;

import java.util.List;

public interface LanguagesRepository {

    List<Language> getAll();
    Language getById(int id);
    void add(Language language);
    void delete(Language language);
    void update(Language language);

}
