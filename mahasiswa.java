/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author HENDRA LESMANA
 */
class Mahasiswa {
 String nama, nim, alamat, golonganDarah, status, tinggiBadan, beratBadan;

     //setter

    void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    void setTinggiBadan(String tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public String getTinggiBadan() {
        return tinggiBadan;
    }

    void setBeratBadan(String beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getBeratBadan() {
        return beratBadan;
    }
}

