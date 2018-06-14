package rc.core.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rc.core.modelo.ReporteProduccion;
import rc.core.repositorio.ReporteProduccionRepositorio;
import rc.core.servicio.ReporteProduccionServicio;


@Service("ReporteProduccionServicio")
@Transactional
public class ReporteProduccionServicioImpl implements ReporteProduccionServicio {

	@Autowired
	private ReporteProduccionRepositorio pReporteProduccionRepositorio;
	
	public List<ReporteProduccion> ObtenerReporte() {
		// TODO Auto-generated method stub
		return pReporteProduccionRepositorio.ObtenerReporte();
	}

}
