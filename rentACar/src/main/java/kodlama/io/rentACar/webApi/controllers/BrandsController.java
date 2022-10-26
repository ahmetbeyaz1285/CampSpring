package kodlama.io.rentACar.webApi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.businnes.abstracts.BrendService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController // annotasion(bilgilendirme)
@RequestMapping("api/brands")
public class BrandsController {

	private BrendService brendService;

	@Autowired
	public BrandsController(BrendService brendService) {
		super();
		this.brendService = brendService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){
		return brendService.getAll();
	}

}
