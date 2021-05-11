package sample.Entities;

import sample.Entities.Angajat;
import sample.Entities.Sef;

import java.util.*;

/**
 * @author Alexandra Tudor
 */
public class Sarcina {

    private String denumire;
    private Date termen_limita;
    private String status;

    public Sarcina() {
        super();
    }

    public Sarcina(String denumire, Date termen_limita, String status) {
        this.denumire = denumire;
        this.termen_limita = termen_limita;
        this.status = status;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Date getTermen_limita() {
        return termen_limita;
    }

    public void setTermen_limita(Date termen_limita) {
        this.termen_limita = termen_limita;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}