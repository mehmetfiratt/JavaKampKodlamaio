package kodlama.io.devs.core.validator;

import kodlama.io.devs.entities.ProgrammingLanguage;

import java.util.List;

public class ProgrammingLanguageValidator {

    public static void isEmpty(String programmingLanguage) {
        if (programmingLanguage.isEmpty() && programmingLanguage.isBlank())
            throw new RuntimeException("Programming Language is empty");
    }

    public static void duplicateName(List<ProgrammingLanguage> programmingLanguages, String name) {
        if (!name.isEmpty() && !name.isBlank() && programmingLanguages != null) {
            for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
                if (programmingLanguage.getName().equals(name)) {
                    throw new RuntimeException("Programming Language already exist!");
                }
            }
        }
    }
}
