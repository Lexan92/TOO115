package entity;
// Generated 26-oct-2016 13:59:59 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Departamento generated by hbm2java
 */
@Entity
@Table(name="DEPARTAMENTO"
    ,schema="SYSTEM"
)
public class Departamento  implements java.io.Serializable {


     private BigDecimal idDepartamento;
     private String nombreDepartamento;
     private Set<Denuncia> denuncias = new HashSet<Denuncia>(0);
     private Set<Municipio> municipios = new HashSet<Municipio>(0);

    public Departamento() {
    }

	
    public Departamento(BigDecimal idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }
    public Departamento(BigDecimal idDepartamento, String nombreDepartamento, Set<Denuncia> denuncias, Set<Municipio> municipios) {
       this.idDepartamento = idDepartamento;
       this.nombreDepartamento = nombreDepartamento;
       this.denuncias = denuncias;
       this.municipios = municipios;
    }
   
     @Id 

    
    @Column(name="ID_DEPARTAMENTO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(BigDecimal idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    
    @Column(name="NOMBRE_DEPARTAMENTO", nullable=false, length=50)
    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }
    
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Denuncia> getDenuncias() {
        return this.denuncias;
    }
    
    public void setDenuncias(Set<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="departamento")
    public Set<Municipio> getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Set<Municipio> municipios) {
        this.municipios = municipios;
    }




}


