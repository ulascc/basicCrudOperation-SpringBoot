package kodlama.io.programmingLanguages.dataAccess.concretes;

import kodlama.io.programmingLanguages.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.programmingLanguages.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguagesRepository {

    private List<Language> languages;

    public InMemoryLanguageRepository() {
       languages = new ArrayList<Language>();
       languages.add(new Language(0,"java"));
       languages.add(new Language(1,"swift"));
       languages.add(new Language(2,"python"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id){
        return languages.get(id);
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(Language language) {
        languages.set(language.getId(),language.setName(language.getName()));
    }
}
