/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ventana;

/**
 *
 * @author USUARIO
 */
import javax.swing.*;


public class ventana {
<<<<<<< HEAD
    
=======
     
>>>>>>> b96e399a8119789e6f44937c38deddf998f2990d
    public static void main(String[] args){
    
        /*
        Como se vio en la teoria es necesario primero crear el frame 
        */
        
        JFrame ventana = new JFrame("Hola mundo");
       
        //hay que definir el tamaño de la ventana
        ventana.setSize(400, 150);
        //definir sus acciones de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito el panel para poder incorporar los componentes de la interfaz
        JPanel panel = new JPanel();
        //en ese panel agregamos los componentes
        ventana.add(panel);
        
        //vamos a crear un metodo para agregar componentes
        agregarComponente(panel);
        
        
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
    
    

    private static void agregarComponente(JPanel panel) {
        
        // el panel se debe de inicializar
        panel.setLayout(null); //el panel esta vacio
        
        //agregamos los componentes como:
        JLabel userlabel = new JLabel("Nombre de usuario");
        /*
        el cual utiliza 4 parametros para poder posicionar el
        componente dentro del panel        
        2 como coordenadas x y
        2 para definir el tamaño
        */
        userlabel.setBounds(10, 10, 160, 25);
        //lo agregamos al panel
        panel.add(userlabel);
        
        //agregar un campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(160, 10, 160, 25);
        panel.add(usertext);
        
        //etiqueta de password
        
        JLabel userpassword = new JLabel("Password");
        userpassword.setBounds(10, 40, 160, 25);
        panel.add(userpassword);
        
        JTextField passtext = new JTextField(20);
        passtext.setBounds(160, 40, 160, 25);
        panel.add(passtext);
        
        //dos botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(210, 80, 120, 25);
        panel.add(registrobutton);
        
    }

    
    
}
