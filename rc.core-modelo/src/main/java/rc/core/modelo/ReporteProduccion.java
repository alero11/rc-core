package rc.core.modelo;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "fp_obtener_datos_produccion", 
				procedureName = "fp_obtener_datos_produccion", 
				resultClasses = ReporteProduccion.class) })
public class ReporteProduccion {
		
	@Id
    @Column(name = "IdDepartamento")
	private int IdDepartamento;
	@Column(name = "NombreDepartamento")
	private String NombreDepartamento;
	@Column(name = "IdFuncionario")
	private int IdFuncionario;
	@Column(name = "NombreOficialia")
	private String NombreOficialia;
	@Column(name = "NombreOficial")
	private String NombreOficial;
	@Column(name = "TipoFuncionario")
	private String TipoFuncionario;
	@Column(name = "CantImpNac")
	private long CantImpNac;
	@Column(name = "CantImpMat")
	private long CantImpMat;
	@Column(name = "CantImpUL")
	private long CantImpUL;
	@Column(name = "CantImp")
	private long CantImp;
	@Column(name = "CantRegNac")
	private long CantRegNac;
	@Column(name = "CantRegMat")
	private long CantRegMat;
	@Column(name = "CantRegDef")
	private long CantRegDef;
	@Column(name = "CantRegUL")
	private long CantRegUL;
	@Column(name = "CantReg")
	private long CantReg;
	@Column(name = "CantTotal")
	private long CantTotal;
	@Column(name = "FechaPrimeraSolicitud")
	private String FechaPrimeraSolicitud;
	@Column(name = "FechaUltimaSolicitud")
	private String FechaUltimaSolicitud;
	
}
