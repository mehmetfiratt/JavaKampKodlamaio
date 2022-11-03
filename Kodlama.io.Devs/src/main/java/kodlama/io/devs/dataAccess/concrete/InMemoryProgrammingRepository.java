package kodlama.io.devs.dataAccess.concrete;

import kodlama.io.devs.dataAccess.abstarcts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingRepository implements ProgrammingLanguageRepository {
    private final List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingRepository() {
        this.programmingLanguages = new ArrayList<>();
        initList();
    }

    private void initList() {
        ProgrammingLanguage programmingLanguage1 = new ProgrammingLanguage(1,"Go");
        ProgrammingLanguage programmingLanguage2 = new ProgrammingLanguage(2,"Python");
        ProgrammingLanguage programmingLanguage3 = new ProgrammingLanguage(3,"C#");
        this.programmingLanguages.add(programmingLanguage1);
        this.programmingLanguages.add(programmingLanguage2);
        this.programmingLanguages.add(programmingLanguage3);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage language = getById(id);
        if (language != null) {
            programmingLanguages.remove(language);
        }
    }

    @Override
    public boolean update(ProgrammingLanguage programmingLanguage, int toUpdate) {
        ProgrammingLanguage language = getById(toUpdate);
        if (language != null) {
            language.setName(programmingLanguage.getName());
            return true;
        } else
            return false;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == id)
                return language;
        }
        return null;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.programmingLanguages;
    }
}
