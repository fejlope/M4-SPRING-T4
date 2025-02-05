package co.bancolombia.aplicacionbancaria.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name="logtransacciones")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long transaccionid;
    @Column(name = "tipo")
    private String tipotransaccion;
    @Column(name = "valor")
    private BigDecimal valortransaccion;
    @Column(name = "fecha")
    private Timestamp fechatransaccion;

    @ManyToOne
    @JoinColumn(name = "idcuenta")
    private Cuenta cuenta;

    public Transaccion() {
    }

    public Transaccion(Long transaccionid, String tipotransaccion, BigDecimal valortransaccion, Timestamp fechatransaccion, Cuenta cuenta) {
        this.transaccionid = transaccionid;
        this.tipotransaccion = tipotransaccion;
        this.valortransaccion = valortransaccion;
        this.fechatransaccion = fechatransaccion;
        this.cuenta = cuenta;
    }

    public Long getTransaccionid() {
        return transaccionid;
    }

    public void setTransaccionid(Long transaccionid) {
        this.transaccionid = transaccionid;
    }

    public String getTipotransaccion() {
        return tipotransaccion;
    }

    public void setTipotransaccion(String tipotransaccion) {
        this.tipotransaccion = tipotransaccion;
    }

    public BigDecimal getValortransaccion() {
        return valortransaccion;
    }

    public void setValortransaccion(BigDecimal valortransaccion) {
        this.valortransaccion = valortransaccion;
    }

    public Timestamp getFechatransaccion() {
        return fechatransaccion;
    }

    public void setFechatransaccion(Timestamp fechatransaccion) {
        this.fechatransaccion = fechatransaccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}