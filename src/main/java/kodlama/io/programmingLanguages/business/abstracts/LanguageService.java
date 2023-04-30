package kodlama.io.programmingLanguages.business.abstracts;

import kodlama.io.programmingLanguages.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();
    Language getById(int id);
    void add(Language language) throws Exception;
    void delete(Language language);
    void update(Language language);

}
