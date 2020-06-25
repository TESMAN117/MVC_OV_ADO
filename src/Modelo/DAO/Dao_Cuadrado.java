/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Vo_Cuadrado;

/**
 *
 * @author jesus
 */
public class Dao_Cuadrado {

    public String Area(Vo_Cuadrado x) {
        String Res = "";

        double Areas = x.getLado() * x.getLado();

        Res = "El area del CUADRADO es de: " + Areas;
        return Res;
    }

    public String Perimetro(Vo_Cuadrado x) {
        String Res = "";

        double Peri = x.getLado() * 4;

        Res = "El Perimetro del CUADRADO es de: " + Peri;
        return Res;
    }

}
