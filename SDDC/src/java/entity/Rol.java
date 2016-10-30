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
 * Rol generated by hbm2java
 */
@Entity
@Table(name="ROL"
    ,schema="SYSTEM"
)
public class Rol  implements java.io.Serializable {


     private BigDecimal idRol;
     private String nombreRol;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(BigDecimal idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }
    public Rol(BigDecimal idRol, String nombreRol, Set<Usuario> usuarios) {
       this.idRol = idRol;
       this.nombreRol = nombreRol;
       this.usuarios = usuarios;
    }
   
     @Id 

    
    @Column(name="ID_ROL", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(BigDecimal idRol) {
        this.idRol = idRol;
    }

    
    @Column(name="NOMBRE_ROL", nullable=false, length=50)
    public String getNombreRol() {
        return this.nombreRol;
    }
    
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rol")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }




}

