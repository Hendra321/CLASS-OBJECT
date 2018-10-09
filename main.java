
package main;


public class Main {

    public static void main(String[] args) {
      System.out.println("----------Menampilkan Kotak-----------");
        //Buat object dari kelas kotak
        Kotak main = new Kotak();
        //mengatur ukuran kotak
        main.setPanjang(16.34);
        main.setLebar(5.34);

        //memanggil object kotak
        System.out.println("panjang: " + main.getPanjang());
        System.out.println("lebar: " + main.getLebar());
        System.out.println("luas: " + main.getPanjang() * main.getLebar());
        System.out.println("keliling: " + main.getPanjang() * main.getLebar() * main.getPanjang() * main.getLebar());

        System.out.println("----------------Menampilkan Mahasiswa---------------");
        Mahasiswa Mahasiswa = new Mahasiswa();

        Mahasiswa.nama              = "HENDRA LESMANA";
        Mahasiswa.nim               = "D0217515";
        Mahasiswa.alamat            = "KAROSSA";
        Mahasiswa.golonganDarah     = "A";
        Mahasiswa.status            = "Mahasiswa";
        Mahasiswa.tinggiBadan       = "156";
        Mahasiswa.beratBadan        = "49";

        //getter mahasiswa
        System.out.println("nama: " + Mahasiswa.getNama());
        System.out.println("nim: " + Mahasiswa.getNim());
        System.out.println("alamat: " + Mahasiswa.getAlamat());
        System.out.println("golongan darah: " + Mahasiswa.getGolonganDarah());
        System.out.println("status: " + Mahasiswa.getStatus());
        System.out.println("tinggi badan: " + Mahasiswa.getTinggiBadan());
        System.out.println("berat badan: " + Mahasiswa.getBeratBadan());

        System.out.println("---------------Menampilkan Note---------------");
        //membuat object dari kelas note
        node node = new node();
        node.Label = "Sprite";
        node.Value = 7;

        //getter node
        System.out.println("Nama Label: " + node.getLabel());
        System.out.println("Jumlah Label: " + node.getValue());

        System.out.println("-------------Menampilkan Stack-------------");
        //membuat object kelas stack
        stack stack = new stack();

        stack.value[0]    = "Hendra lesmana";
        stack.value[1]    = "Minions";
        stack.value[2]    = "Gery";
        stack.value[3]    = "Squecr";
        stack.value[4]    = "Kt Pery";
        stack.value[5]    = "Sepatu";
        stack.setValueAt(6, "Kartun");

        for (int i = 0; i < stack.value.length; i++) {
            System.out.println(stack.value[i]);};

        }

    }
   
