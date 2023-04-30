package kodlama.io.programmingLanguages.business.concretes;

import kodlama.io.programmingLanguages.business.abstracts.LanguageService;
import kodlama.io.programmingLanguages.dataAccess.abstracts.LanguagesRepository;
import kodlama.io.programmingLanguages.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguagesRepository languagesRepository;

    public LanguageManager(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @Override
    public List<Language> getAll() {
        return languagesRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return languagesRepository.getById(id);
    }

    @Override
    public void add(Language language) throws Exception {
        if(language.getName()==null){
            throw new Exception("name cant be NULL");
        }
        for (Language lang : languagesRepository.getAll()) {
            if(lang.getName() == language.getName()){
                throw new Exception("this name already exist");
            }else{
                languagesRepository.add(language);
            }
        }
    }

    @Override
    public void delete(Language language) {
        languagesRepository.delete(language);
    }

    @Override
    public void update(Language language) {
        languagesRepository.update(language);
    }
}
