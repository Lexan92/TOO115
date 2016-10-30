package entity;
// Generated 26-oct-2016 13:59:59 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Denuncia generated by hbm2java
 */
@Entity
@Table(name="DENUNCIA"
    ,schema="SYSTEM"
)
public class Denuncia  implements java.io.Serializable {


     private BigDecimal idDenuncia;
     private Categoria categoria;
     private Denunciante denunciante;
     private Departamento departamento;
     private Estado estado;
     private String descripcion;
     private String direccion;
     private Date fecha;
     private Blob imagen;
     private Blob video;

    public Denuncia() {
    }

	
    public Denuncia(BigDecimal idDenuncia, Categoria categoria, Denunciante denunciante, Departamento departamento, Estado estado, String descripcion) {
        this.idDenuncia = idDenuncia;
        this.categoria = categoria;
        this.denunciante = denunciante;
        this.departamento = departamento;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    public Denuncia(BigDecimal idDenuncia, Categoria categoria, Denunciante denunciante, Departamento departamento, Estado estado, String descripcion, String direccion, Date fecha, Blob imagen, Blob video) {
       this.idDenuncia = idDenuncia;
       this.categoria = categoria;
       this.denunciante = denunciante;
       this.departamento = departamento;
       this.estado = estado;
       this.descripcion = descripcion;
       this.direccion = direccion;
       this.fecha = fecha;
       this.imagen = imagen;
       this.video = video;
    }
   
     @Id 

    
    @Column(name="ID_DENUNCIA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdDenuncia() {
        return this.idDenuncia;
    }
    
    public void setIdDenuncia(BigDecimal idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CATEGORIA", nullable=false)
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_DENUNCIANTE", nullable=false)
    public Denunciante getDenunciante() {
        return this.denunciante;
    }
    
    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_DEPARTAMENTO", nullable=false)
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO", nullable=false)
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    @Column(name="DESCRIPCION", nullable=false, length=500)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="DIRECCION", length=150)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=7)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="IMAGEN")
    public Blob getImagen() {
        return this.imagen;
    }
    
    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    
    @Column(name="VIDEO")
    public Blob getVideo() {
        return this.video;
    }
    
    public void setVideo(Blob video) {
        this.video = video;
    }




}

