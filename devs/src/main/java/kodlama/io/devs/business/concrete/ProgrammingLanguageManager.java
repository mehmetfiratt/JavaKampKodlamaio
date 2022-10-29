package kodlama.io.devs.business.concrete;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.core.validator.ProgrammingLanguageValidator;
import kodlama.io.devs.dataAccess.abstarcts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private final ProgrammingLanguageRepository languageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguageValidator.isEmpty(programmingLanguage.getName());
        ProgrammingLanguageValidator.duplicateName(this.languageRepository.getAll(), programmingLanguage.getName());
        System.out.println("Added!");
        this.languageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.delete(id);
        System.out.println("Deleted!");
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int toUpdate) {
        boolean isUpdated = this.languageRepository.update(programmingLanguage, toUpdate);
        if (isUpdated)
            System.out.println("Updated!");
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        ProgrammingLanguage language = this.languageRepository.getById(id);
        if (language == null)
            throw new RuntimeException("Programming Language Not Found");
        else
            return language;

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.languageRepository.getAll();
    }
}
