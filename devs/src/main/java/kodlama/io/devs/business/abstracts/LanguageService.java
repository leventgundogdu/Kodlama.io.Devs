package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.Language;

public interface LanguageService {
	
	List<Language> getAll();
	
	Language getLanguageById(int id) throws Exception;
	
	public void add(Language language) throws Exception;
	public void update(Language language, int id) throws Exception;
	public void delete(Language language);
	
}
