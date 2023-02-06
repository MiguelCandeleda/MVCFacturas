package org.springframework.samples.petclinic.factura;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.samples.petclinic.vet.Vets;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
public class FacturaController {

	private final FacturaRepository FacturaRepository;

	public FacturaController(FacturaRepository FacturaRepository) {
		this.FacturaRepository = FacturaRepository;
	}

	/*@GetMapping({ "/factura" })
	public @ResponseBody Vets showResourcesVetList() {
		// Here we are returning an object of type 'Vets' rather than a collection of Vet
		// objects so it is simpler for JSon/Object mapping
		Factura factura = new Factura();
		factura.getFactura_Id().addall(this.FacturaRepository.findAll());
		return factura;
	}*/

}
