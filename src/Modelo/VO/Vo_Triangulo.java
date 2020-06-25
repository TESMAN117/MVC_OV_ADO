/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VO;

/**
 *
 * @author jesus
 */
public class Vo_Triangulo {

    private double Lado_a;
    private double Lado_b;
    private double Lado_h;

    private double mitad_B;
    private double Altura;

    public double getLado_a() {
        return Lado_a;
    }

    public void setLado_a(double Lado_a) {
        this.Lado_a = Lado_a;
    }

    public double getLado_b() {
        return Lado_b;
    }

    public void setLado_b(double Lado_b) {
        this.Lado_b = Lado_b;
    }

    public double getLado_h() {
        return Lado_h;
    }

    public void setLado_h(double Lado_h) {
        this.Lado_h = Lado_h;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getMitad_B() {
        return mitad_B;
    }

    public void setMitad_B(double mitad_B) {
        this.mitad_B = (mitad_B / 2);
    }

}
