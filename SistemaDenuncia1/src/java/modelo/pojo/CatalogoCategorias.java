package modelo.pojo;
// Generated 10-15-2016 03:51:44 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * CatalogoCategorias generated by hbm2java
 */
public class CatalogoCategorias  implements java.io.Serializable {


     private BigDecimal idCatalogo;
     private Set categorias = new HashSet(0);

    public CatalogoCategorias() {
    }

	
    public CatalogoCategorias(BigDecimal idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public CatalogoCategorias(BigDecimal idCatalogo, Set categorias) {
       this.idCatalogo = idCatalogo;
       this.categorias = categorias;
    }
   
    public BigDecimal getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(BigDecimal idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public Set getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Set categorias) {
        this.categorias = categorias;
    }




}


