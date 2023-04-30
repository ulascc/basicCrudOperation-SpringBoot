package kodlama.io.programmingLanguages.webApi.controllers;

import kodlama.io.programmingLanguages.business.abstracts.LanguageService;
import kodlama.io.programmingLanguages.entities.concretes.Language;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {
    private LanguageService languageService;

    Language language1 = new Language(4,"javascript");

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return  languageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    @ResponseBody
    public Language getById(@PathVariable int id){
        return languageService.getById(id);
    }

    @GetMapping("/add")
    public void add(Language language1) throws Exception {
        languageService.add(language1);
    }

    @ResponseBody
    public void delete(Language language1){
        languageService.delete(language1);
    }

    @GetMapping("/update")
    public void update(Language language1){
        languageService.update(language1);
    }


}
