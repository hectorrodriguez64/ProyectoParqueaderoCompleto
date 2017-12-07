/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "carros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carros.findAll", query = "SELECT c FROM Carros c")
    , @NamedQuery(name = "Carros.findByPlacaCarro", query = "SELECT c FROM Carros c WHERE c.placaCarro = :placaCarro")
    , @NamedQuery(name = "Carros.findByHoraLlegada", query = "SELECT c FROM Carros c WHERE c.horaLlegada = :horaLlegada")})
public class Carros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "placa_carro")
    private String placaCarro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_llegada")
    private int horaLlegada;
    
    @OneToOne(mappedBy = "carros")
    private Puestos puestos;
    
/*
    @JoinColumn(name = "placa_carro", referencedColumnName = "placa_carro")
    @OneToOne(optional = false)
    private Puestos puestos;

    @OneToMany(mappedBy = "placaCarro")
    private List<Puestos> puestosList;*/
            
    public Carros() {
    }

    public Carros(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public Carros(String placaCarro, int horaLlegada) {
        this.placaCarro = placaCarro;
        this.horaLlegada = horaLlegada;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(int horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    /* @XmlTransient
    public List<Puestos> getPuestosList() {
        return puestosList;
    }

    public void setPuestosList(List<Puestos> puestosList) {
        this.puestosList = puestosList;
    }*/
    @XmlTransient
    public Puestos getPuestos() {
        return puestos;
    }

    public void setPuestos(Puestos puestos) {
        this.puestos = puestos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placaCarro != null ? placaCarro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carros)) {
            return false;
        }
        Carros other = (Carros) object;
        if ((this.placaCarro == null && other.placaCarro != null) || (this.placaCarro != null && !this.placaCarro.equals(other.placaCarro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.adsi.jpa.entites.Carros[ placaCarro=" + placaCarro + " ]";
    }

}
