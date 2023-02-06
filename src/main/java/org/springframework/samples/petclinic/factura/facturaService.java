/*
package org.springframework.samples.petclinic.factura;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public class facturaService {

	Collection<Factura> findAllFacturas() throws DataAccessException;
	@Override
	@Transactional(readOnly = true)
	public Collection<Factura> findAllFacturas() throws DataAccessException {
		return FacturaRepository.findAll();
	}
}
*/
