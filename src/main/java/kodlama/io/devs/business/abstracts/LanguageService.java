package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateLanguageRequest;
import kodlama.io.devs.business.requests.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.devs.entities.Language;

public interface LanguageService {
	
	List<GetAllLanguagesResponse> getAll();
	
	Language getLanguageById(int id) throws Exception;
	
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception;
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception;
	public void delete(DeleteLanguageRequest deleteLanguageRequest);
	
}
