package org.springframework.samples.petclinic.factura;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura extends NamedEntity {
	@Column(name = "factura_Id")
	@NotEmpty
	private Integer factura_Id;

	@Column(name = "nombre")
	@NotEmpty
	private String nombre;

	@Column(name = "apellido")
	@NotEmpty
	private String apellido;

	@Column(name = "fecha")
	@NotEmpty
	private Date fecha;

	@Column(name = "motivo")
	@NotEmpty
	private String motivo;

	public Integer getFactura_Id() {
		return factura_Id;
	}

	public void setFactura_Id(Integer factura_Id) {
		this.factura_Id = factura_Id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}



}
