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
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author jesus
 */
public class Ctrl_Figuras implements ActionListener {
    
    Figuras Figura;
    Vo_Cuadrado Cuadrado;
    Vo_Rectangulo Rectangulo;
    Vo_Triangulo Triangulo;
    
    Dao_Cuadrado Dao_Cuadrado;
    Dao_Rectangulo Dao_Rectangulo;
    Dao_Triangulo Dao_Triangulo;
    
    public Ctrl_Figuras(Figuras Figura, Vo_Cuadrado Cuadrado, Vo_Rectangulo Rectangulo, Vo_Triangulo Triangulo, Dao_Cuadrado Dao_Cuadrado, Dao_Rectangulo Dao_Rectangulo, Dao_Triangulo Dao_Triangulo) {
        this.Figura = Figura;
        this.Cuadrado = Cuadrado;
        this.Rectangulo = Rectangulo;
        this.Triangulo = Triangulo;
        this.Dao_Cuadrado = Dao_Cuadrado;
        this.Dao_Rectangulo = Dao_Rectangulo;
        this.Dao_Triangulo = Dao_Triangulo;
        
        this.Figura.btn_Calcular.addActionListener(this);
        
        this.Figura.btn_Limpiar.addActionListener(this);
        //this.Figura.panal.setBackground(Color.getHSBColor(255, 153, 153));
        
        this.Figura.CBM_Figura.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                
                if ("Cuadrado".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                    Cleadn();
                    Figura.lbl_lado_a.setVisible(true);
                    Figura.lbl_lado_b.setVisible(false);
                    Figura.lbl_lado_h.setVisible(false);
                    Figura.lbl_ancho.setVisible(false);
                    Figura.lbl_largo.setVisible(false);
                    
                    Figura.txt_lado_a.setVisible(true);
                    Figura.txt_lado_b.setVisible(false);
                    Figura.txt_lado_h.setVisible(false);
                    Figura.txt_ancho.setVisible(false);
                    Figura.txt_largo.setVisible(false);
                    img_label("Cuadrado");
                    Figura.panal.setBackground(Color.blue);
                    
                } else {
                    if ("Triangulo".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                        Cleadn();
                        Figura.lbl_lado_a.setVisible(true);
                        Figura.lbl_lado_b.setVisible(true);
                        Figura.lbl_lado_h.setVisible(true);
                        Figura.lbl_ancho.setVisible(false);
                        Figura.lbl_largo.setVisible(false);
                        
                        Figura.txt_lado_a.setVisible(true);
                        Figura.txt_lado_b.setVisible(true);
                        Figura.txt_lado_h.setVisible(true);
                        Figura.txt_ancho.setVisible(false);
                        Figura.txt_largo.setVisible(false);
                        img_label("Triangulo");
                        Figura.panal.setBackground(Color.red);
                        
                    } else {
                        if ("Rectangulo".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                            Cleadn();
                            Figura.lbl_lado_a.setVisible(false);
                            Figura.lbl_lado_b.setVisible(false);
                            Figura.lbl_lado_h.setVisible(false);
                            Figura.lbl_ancho.setVisible(true);
                            Figura.lbl_largo.setVisible(true);
                            
                            Figura.txt_lado_a.setVisible(false);
                            Figura.txt_lado_b.setVisible(false);
                            Figura.txt_lado_h.setVisible(false);
                            Figura.txt_ancho.setVisible(true);
                            Figura.txt_largo.setVisible(true);
                            img_label("Rectangulo");
                            Figura.panal.setBackground(Color.orange);
                            
                        }
                    }
                }
            }
        });
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Figura.btn_Calcular) {
            if ("Cuadrado".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                Calcular_Cuadrado();
            }
            if ("Triangulo".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                Calcular_Triangulo();
            }
            if ("Rectangulo".equals(Figura.CBM_Figura.getSelectedItem().toString())) {
                Calcular_Rectangulo();
            }
        }
        
        if (e.getSource() == Figura.btn_Limpiar) {
            Cleadn();
        }
    }
    
    public void Calcular_Cuadrado() {
        
        this.Cuadrado.setLado(Double.parseDouble(this.Figura.txt_lado_a.getText()));
        
        this.Figura.txt_Respuesta.setText(this.Dao_Cuadrado.Area(Cuadrado) + " \n " + this.Dao_Cuadrado.Perimetro(Cuadrado));
        
    }
    
    public void Calcular_Rectangulo() {
        
        this.Rectangulo.setBase(Double.parseDouble(this.Figura.txt_ancho.getText()));
        this.Rectangulo.setAltura(Double.parseDouble(this.Figura.txt_largo.getText()));
        
        this.Figura.txt_Respuesta.setText(this.Dao_Rectangulo.Area(Rectangulo) + " \n " + this.Dao_Rectangulo.Perimetro(Rectangulo));
        
    }
    
    public void Calcular_Triangulo() {
        
        this.Triangulo.setLado_a(Double.parseDouble(this.Figura.txt_lado_a.getText()));
        this.Triangulo.setLado_b(Double.parseDouble(this.Figura.txt_lado_b.getText()));
        this.Triangulo.setLado_h(Double.parseDouble(this.Figura.txt_lado_h.getText()));
        this.Triangulo.setMitad_B(Double.parseDouble(this.Figura.txt_lado_b.getText()));
        
        this.Triangulo.setAltura(Math.sqrt((Math.pow(this.Triangulo.getLado_h(), 2) - Math.pow(this.Triangulo.getMitad_B(), 2))));
        
        this.Figura.txt_Respuesta.setText(this.Dao_Triangulo.Area(Triangulo) + " \n " + this.Dao_Triangulo.Perimetro(Triangulo));
        
    }
    
    public void Cleadn() {
        Figura.lbl_lado_a.setVisible(true);
        Figura.lbl_lado_b.setVisible(true);
        Figura.lbl_lado_h.setVisible(true);
        Figura.lbl_ancho.setVisible(true);
        Figura.lbl_largo.setVisible(true);
        
        Figura.txt_lado_a.setVisible(true);
        Figura.txt_lado_b.setVisible(true);
        Figura.txt_lado_h.setVisible(true);
        Figura.txt_ancho.setVisible(true);
        Figura.txt_largo.setVisible(true);
        
        Figura.txt_lado_a.setText("");
        Figura.txt_lado_b.setText("");
        Figura.txt_lado_h.setText("");
        Figura.txt_ancho.setText("");
        Figura.txt_largo.setText("");
        
        Figura.lbl_titulo.setText("Figuras");
        
    }
    
    public void img_label(String tipo) {
        
        ImageIcon icon = new ImageIcon("src\\IMG\\" + tipo + ".png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(this.Figura.lbl_foto_figura.getWidth(), this.Figura.lbl_foto_figura.getHeight(), Image.SCALE_DEFAULT));
        
        this.Figura.lbl_foto_figura.setText(null);
        
        this.Figura.lbl_foto_figura.setIcon(icono);
        Figura.lbl_titulo.setText("Figura " + tipo);
        
    }
    
}
