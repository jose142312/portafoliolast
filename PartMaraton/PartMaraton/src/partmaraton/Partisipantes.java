/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partmaraton;

/**
 *
 * @author Aulas Heredia
 */
public class Partisipantes {
    private String nombreCom;
    private int edad;
    private int numcorredor;
    private double TiempEstimado;
    private double TiempReal;
    private String categoria;
    
    public Participante(String nombreCom, int edad, int numcorredor, double TiempEstimado) {
        this.nombreCom = nombreCom;
        this.edad = edad;
        this.numcorredor = numcorredor;
        this.TiempEstimado = TiempEstimado;
        this.TiempReal = 0;
        this.categoria = calcularCategoria(edad);
    }
    private String calcularCategoria(int edad) {
        if (edad < 18) {
            return "Juvenil";
        }
        else if (edad <= 40) {
            return "Adulto";
        } 
        else {
            return "Master";
        }
    }
    public String getNombreCompleto() {
        return nombreCom;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroCorredor() {
        return numcorredor;
    }

    public double getTiempoestimado() {
        return TiempEstimado;
    }

    public double getTiempoReal() {
        return TiempReal;
    }

    public void setTiempoReal(double TiempReal) {
        this.TiempReal= TiempReal;
    }
    public String getCategoria() {
        return categoria;
    }
}