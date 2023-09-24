package com.bilgeadam.repository.entity;

public class Calisan {int id;
    String isim;
    String soyIsim;

    @Override
    public String toString() {
        return "Calisan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                '}';
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public Calisan(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calisan(String isim) {
        this.isim = isim;
    }

    public Calisan(int id) {
        this.id = id;
    }

    public Calisan() {
    }
}

