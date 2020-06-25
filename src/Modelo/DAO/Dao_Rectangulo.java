/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Vo_Rectangulo;

/**
 *
 * @author jesus
 */
public class Dao_Rectangulo {

    public String Area(Vo_Rectangulo x) {
        String Res = "";

        double Areas = x.getBase() * x.getAltura();

        Res = "El area del RECTANGULO es de: " + Areas;
        return Res;
    }

    public String Perimetro(Vo_Rectangulo x) {
        String Res = "";

        double Peri = (x.getBase() * 2) + (x.getAltura() * 2);

        Res = "El Perimetro del RECTANGULO es de: " + Peri;
        return Res;
    }

}
