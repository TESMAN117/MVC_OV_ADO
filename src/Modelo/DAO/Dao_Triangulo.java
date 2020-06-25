/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Vo_Triangulo;

/**
 *
 * @author jesus
 */
public class Dao_Triangulo {

    public String Area(Vo_Triangulo x) {

        System.out.print(x.getMitad_B()+"\n ");
        String Res = "";
        System.out.print(x.getAltura());
        double Areas = x.getLado_b() * x.getAltura();

        Res = "El area del TRIANGULO es de: " + Areas;
        return Res;
    }

    public String Perimetro(Vo_Triangulo x) {
        String Res = "";

        double Peri = x.getLado_a() + x.getLado_b() + x.getLado_h();
        Res = "El Perimetro del TRIANGULO es de: " + Peri;
        return Res;
    }

}
