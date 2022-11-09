package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	
	
	
	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language getLanguageById(int id) throws Exception {
		
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		throw new Exception("Id number cannot be found please try again.");
		
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void update(Language language, int id) throws Exception{
		 Language language1 = getLanguageById(language.getId());
		 language1.setName(language.getName());
		
	}

	@Override
	public void delete(Language language) {
		languages.remove(language);
		
	}

}
