package pert4PBO;

public class demoKonversiSuhu {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas konversiSuhu2
        konfersiSuhu2 konversi = new konfersiSuhu2();
        
        // Mengonversi suhu dari Celcius ke Fahrenheit
        double celcius = 25;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamurFromCelcius = konversi.celciusToReamur(celcius);
        
        // Mengonversi suhu dari Fahrenheit ke Reamur
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheit);
        
        // Menampilkan hasil konversi
        System.out.println("Celcius ke Fahrenheit: " + celcius + "C = " + fahrenheit + "F");
        System.out.println("Celcius ke Reamur: " + celcius + "C = " + reamurFromCelcius + "R");
        System.out.println("Fahrenheit ke Reamur: " + fahrenheit + "F = " + reamurFromFahrenheit + "R");
    }
}
