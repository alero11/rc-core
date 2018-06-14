package rc.core.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rc.core.modelo.ReporteProduccion;

@Repository("reporteProduccion")
public interface ReporteProduccionRepositorio extends CrudRepository<ReporteProduccion, Integer> {

	@Query(value = "{call tramite.fp_obtener_datos_produccion}", nativeQuery=true)
	public List<ReporteProduccion> ObtenerReporte();	
}
