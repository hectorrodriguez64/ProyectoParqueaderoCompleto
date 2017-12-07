/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "puestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puestos.findAll", query = "SELECT p FROM Puestos p")
    , @NamedQuery(name = "Puestos.findById", query = "SELECT p FROM Puestos p WHERE p.id = :id")
    , @NamedQuery(name = "Puestos.findByNumeroPuesto", query = "SELECT p FROM Puestos p WHERE p.numeroPuesto = :numeroPuesto")})
public class Puestos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero_puesto")
    private int numeroPuesto;
    @JoinColumn(name = "placa_carro", referencedColumnName = "placa_carro")
    @OneToOne()
    private Carros carros;
   /* @OneToOne(mappedBy = "puestos")
    private Carros carros;
    @JoinColumn(name = "placa_carro", referencedColumnName = "placa_carro")
    @ManyToOne
    private Carros placaCarro;*/
    @JoinColumn(name = "id_parqueadero", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Parqueadero idParqueadero;

    public Puestos() {
    }

    public Puestos(Integer id) {
        this.id = id;
    }

    public Puestos(Integer id, int numeroPuesto) {
        this.id = id;
        this.numeroPuesto = numeroPuesto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    /*public Carros getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(Carros placaCarro) {
        this.placaCarro = placaCarro;
    }*/
    public Carros getCarros() {
        return carros;
    }

    public void setCarros(Carros carros) {
        this.carros = carros;
    }

    public Parqueadero getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Parqueadero idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puestos)) {
            return false;
        }
        Puestos other = (Puestos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.adsi.jpa.entites.Puestos[ id=" + id + " ]";
    }

}
