package kodlama.io.devs.webAPI;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguageController {
    private final ProgrammingLanguageService languageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }


    @GetMapping("/{id}")
    public ProgrammingLanguage getLanguageId(@PathVariable("id") int languageId) {
        return languageService.getById(languageId);
    }


    @PostMapping()
    public void addLanguage(@RequestBody ProgrammingLanguage language) {
        languageService.add(language);
    }


    @PutMapping("/{id}")
    public void updateLanguage(@PathVariable("id") int id, @RequestBody ProgrammingLanguage language) {
        languageService.update(language, id);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguage(@PathVariable("id") int id) {
        languageService.delete(id);
    }

}
