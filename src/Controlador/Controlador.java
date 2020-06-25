/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.Dao_Cuadrado;
import Modelo.DAO.Dao_Rectangulo;
import Modelo.DAO.Dao_Triangulo;
import Modelo.VO.Vo_Cuadrado;
import Modelo.VO.Vo_Rectangulo;
import Modelo.VO.Vo_Triangulo;
import Vista.Figuras;

/**
 *
 * @author jesus
 */
public class Controlador {

    public static void main(String args[]) {

        Figuras Figura = new Figuras();
        Vo_Cuadrado Cuadrado = new Vo_Cuadrado();
        Vo_Rectangulo Rectangulo = new Vo_Rectangulo();
        Vo_Triangulo Triangulo = new Vo_Triangulo();

        Dao_Cuadrado Dao_Cuadrado = new Dao_Cuadrado();
        Dao_Rectangulo Dao_Rectangulo = new Dao_Rectangulo();
        Dao_Triangulo Dao_Triangulo = new Dao_Triangulo();

        Ctrl_Figuras CTRL = new Ctrl_Figuras(Figura, Cuadrado, Rectangulo, Triangulo, Dao_Cuadrado, Dao_Rectangulo, Dao_Triangulo);
        Figura.setVisible(true);

    }

}
