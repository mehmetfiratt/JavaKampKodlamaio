package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage, int toUpdate);
    ProgrammingLanguage getById(int id);
    List<ProgrammingLanguage> getAll();
}
