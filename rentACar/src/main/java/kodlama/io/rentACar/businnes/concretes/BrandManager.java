package kodlama.io.rentACar.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.businnes.abstracts.BrendService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service //bu sınıf bir businnes nesnesidir
public class BrandManager implements BrendService {
	
	private BrandRepository brandRepository;
	

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}





	@Override
	public List<Brand> getAll() {
		//iskuralları
		
		return brandRepository.getAll();
	}
	
	

}
