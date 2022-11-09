package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	
	Language getLanguageById(int id) throws Exception;
	
	public void add(Language language);
	public void update(Language language, int id) throws Exception;
	public void delete(Language language);
	
	
}
