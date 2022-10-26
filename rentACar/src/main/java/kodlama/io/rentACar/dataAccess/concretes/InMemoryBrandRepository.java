package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //Bu sınıf bir dataAcces nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{
	
	List<Brand> brands;

	
	public InMemoryBrandRepository() {
		
		brands=new ArrayList<Brand>();
		
		brands.add(new Brand(1,"BMV"));
		brands.add(new Brand(2,"CADİLLAC"));
		brands.add(new Brand(3,"TOYOTA"));
		brands.add(new Brand(4,"HONDA"));
		brands.add(new Brand(5,"TOFAS"));
		
	}

	@Override
	public List<Brand> getAll() {
		
		System.out.println("Liste görüntülendi");

		return brands;
	}

}
