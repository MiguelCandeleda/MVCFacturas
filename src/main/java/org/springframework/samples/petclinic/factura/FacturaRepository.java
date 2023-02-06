package org.springframework.samples.petclinic.factura;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.Collection;

public interface FacturaRepository extends Repository<Factura, Integer> {
	@Transactional(readOnly = true)
	@Cacheable("facturas")
	Page<Factura> findAll() throws DataAccessException;


}
