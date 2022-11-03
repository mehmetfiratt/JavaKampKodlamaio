package kodlama.io.devs.dataAccess.abstarcts;

import kodlama.io.devs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    boolean update(ProgrammingLanguage programmingLanguage, int toUpdate);

    ProgrammingLanguage getById(int id);

    List<ProgrammingLanguage> getAll();
}
