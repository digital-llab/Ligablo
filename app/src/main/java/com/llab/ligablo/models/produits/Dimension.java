package com.llab.ligablo.models.produits;

public class Dimension {

    private int id;
    private Double poid;
    private Double capacite;

    public Dimension() {
    }

    public Dimension(int id, Double poid, Double capacite) {
        this.id = id;
        this.poid = poid;
        this.capacite = capacite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPoid() {
        return poid;
    }

    public void setPoid(Double poid) {
        this.poid = poid;
    }

    public Double getCapacite() {
        return capacite;
    }

    public void setCapacite(Double capacite) {
        this.capacite = capacite;
    }
}
