/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.jpa.entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adsi1261718
 */
@Entity
@Table(name = "parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p")
    , @NamedQuery(name = "Parqueadero.findById", query = "SELECT p FROM Parqueadero p WHERE p.id = :id")
    , @NamedQuery(name = "Parqueadero.findByTarifa", query = "SELECT p FROM Parqueadero p WHERE p.tarifa = :tarifa")
    , @NamedQuery(name = "Parqueadero.findByHoraApertura", query = "SELECT p FROM Parqueadero p WHERE p.horaApertura = :horaApertura")
    , @NamedQuery(name = "Parqueadero.findByHoraCierre", query = "SELECT p FROM Parqueadero p WHERE p.horaCierre = :horaCierre")
    , @NamedQuery(name = "Parqueadero.findByHoraActual", query = "SELECT p FROM Parqueadero p WHERE p.horaActual = :horaActual")
    , @NamedQuery(name = "Parqueadero.findByCaja", query = "SELECT p FROM Parqueadero p WHERE p.caja = :caja")})
public class Parqueadero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tarifa")
    private double tarifa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_apertura")
    private int horaApertura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_cierre")
    private int horaCierre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_actual")
    private int horaActual;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "caja")
    private Double caja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParqueadero")
    private List<Puestos> puestosList;

    public Parqueadero() {
    }

    public Parqueadero(Integer id) {
        this.id = id;
    }

    public Parqueadero(Integer id, double tarifa, int horaApertura, int horaCierre, int horaActual) {
        this.id = id;
        this.tarifa = tarifa;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.horaActual = horaActual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }

    public int getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(int horaCierre) {
        this.horaCierre = horaCierre;
    }

    public int getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(int horaActual) {
        this.horaActual = horaActual;
    }

    public Double getCaja() {
        return caja;
    }

    public void setCaja(Double caja) {
        this.caja = caja;
    }

    @XmlTransient
    public List<Puestos> getPuestosList() {
        return puestosList;
    }

    public void setPuestosList(List<Puestos> puestosList) {
        this.puestosList = puestosList;
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
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.adsi.jpa.entites.Parqueadero[ id=" + id + " ]";
    }
    
}
