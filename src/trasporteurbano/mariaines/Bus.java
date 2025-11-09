/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trasporteurbano.mariaines;

/**
 *
 * @author ANDERSON
 */
public class Bus {
 private String  placa;

    public Bus() {
    }

    public Bus(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Bus{" + "placa=" + placa + '}';
    }

 System.out.println("Ander como vas con el trabajo !!!! ");
    
}
