package pert4PBO;

public class matematikainheritance {
    public static void main(String[] args) {
        matematika2 mtk = new matematika2();
        
        int tambah = mtk.pertambahan(10, 5);
        int kurang = mtk.pengurangan(10, 5);
        int kali = mtk.perkalian(10, 5);
        int bagi = mtk.pembagian(10, 5);    
        
//        ini yang baru
        int mod = mtk.modulus(10, 3);
        
        System.out.println("Hasil Pertambahan: " + tambah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);
        System.out.println("Hasil Modulus: " + mod);
    }
}
