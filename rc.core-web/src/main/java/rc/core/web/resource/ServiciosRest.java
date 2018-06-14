package rc.core.web.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import rc.core.modelo.ReporteProduccion;
import rc.core.servicio.ReporteProduccionServicio;

@Path("message")
public class ServiciosRest {

	
	@Autowired
	ReporteProduccionServicio pReporteProduccionServicio;
	
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("algo")
	public String getMsg() {
		String vNombre = "alex toro";
		return vNombre;
	}
	
	
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("reporte")
	public List<ReporteProduccion> ObtenerReporte() {		
		
		List<ReporteProduccion> vLista = pReporteProduccionServicio.ObtenerReporte(); 
		
		return vLista;
	}

}
