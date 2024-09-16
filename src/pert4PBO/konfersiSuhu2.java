package pert4PBO;

public class konfersiSuhu2 extends konfersisuhu {
    
    // Mengonversi suhu dari Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius * 4/5;
    }
}
