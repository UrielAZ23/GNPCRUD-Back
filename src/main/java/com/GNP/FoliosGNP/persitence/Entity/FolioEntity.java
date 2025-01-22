package com.GNP.FoliosGNP.persitence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "folio")
@Getter
@Setter
@NoArgsConstructor
public class FolioEntity {
    @Id
    @Column(nullable = false,length = 20)
    public String folio;
    @Column(nullable = false,length = 200)
    public String catImpresor;


    @Column(nullable = false, length = 200)
    private String  cveProducto;
    @Column(nullable = false,)
    private Date fecha;

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCatImpresor() {
        return catImpresor;
    }

    public void setCatImpresor(String catImpresor) {
        this.catImpresor = catImpresor;
    }

    public String getCveProducto() {
        return cveProducto;
    }

    public void setCveProducto(String cveProducto) {
        this.cveProducto = cveProducto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
