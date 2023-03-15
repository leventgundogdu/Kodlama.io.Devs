package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{
	
//	List<Language> getAll();
//	
//	Language getLanguageById(int id) throws Exception;
//	
//	public void add(Language language);
//	public void update(Language language, int id) throws Exception;
//	public void delete(Language language);
	
	
}
