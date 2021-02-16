/*
PROGRAMADOR: CRISTOBAL VARGAS RODRIGUEZ

PROGRAMA: HACER UNA CALCULADORA CON INTERFAZ GRAFICA EN JAVA

FECHA: 15/02/21
*/
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Calculadora_VargasRodriguezCristobal extends JFrame
{
   
   JTextField num1;
   JTextField num2;
   JButton botonSuma;
   JButton botonResta;
   JButton botonMultiplicacion;
   JButton botonDivision;
   JButton botonSalir;
   JLabel letreroNum1, letreroNum2, letreroPrincipal, respuesta;
   
   JPanel panel;
   
   public Calculadora_VargasRodriguezCristobal()
   {
      iniciarComponentes(); // Inicia los componentes que vamos a ver en la interfaz grafica
   }
   
   private void iniciarComponentes()
   {
      /*---- AQUI VA TODOS LOS COMPONENTES QUE PONDREMOS EN LA INTERFAZ Y EL ORDEN DE COMO ESTARA EN EL PANEL*/
      setSize(400, 200);
      setTitle("Caculadora CVargas");
      
      num1= new JTextField(8); // 8 caracteres solamente podra ingresar el usuario
      num2= new JTextField(8);
      letreroPrincipal  = new JLabel("CACULADORA CRISTOBAL VR          ");
      letreroNum1 = new JLabel("Ingrese un numero: ");
      letreroNum2 = new JLabel("Ingrese otro numero: ");
      
      
      botonSuma = new JButton("Suma");
      botonSuma.setMnemonic('s');
      botonSuma.addMouseListener(new MyClickSuma());
      
      botonResta= new JButton("Resta");
      botonResta.setMnemonic('r');
      botonResta.addMouseListener(new MyClickResta());
      
      botonMultiplicacion= new JButton("Multiplicacion");
      botonMultiplicacion.setMnemonic('m');
      botonMultiplicacion.addMouseListener(new MyClickMultiplicacion());
      
      botonDivision= new JButton("Division");
      botonDivision.setMnemonic('d');
      botonDivision.addMouseListener(new MyClickDivision());
    
      botonSalir = new JButton("salir");
      botonSalir.setMnemonic('s');
      botonSalir.addMouseListener(new SALIR()); 
   
      
      respuesta = new JLabel();
      
      /*COMPONENTES QUE SERAN VISIBLES EN LA INTERFAZ SEGUN EL ACOMODO QUE LE DEMOS*/
      panel = new JPanel();
      
      panel.add(letreroPrincipal);
      
      panel.add(letreroNum1);
      panel.add(num1);
      
      panel.add(letreroNum2);
      panel.add(num2);
   
      
      panel.add(botonSuma);
      panel.add(botonResta);
      panel.add(botonMultiplicacion);
      panel.add(botonDivision);
      
      panel.add(botonSalir);
      
      panel.add(respuesta); // Esto es para que en la interfaz aparezca la respuesta abajo la imprimo
      setContentPane(panel);
      setVisible(true);
   }
   /*CUANDO LE DE CLICK EN SUMA SE VENDRA AQUI Y SE CREARAN LAS VARIABLES Y DESPUES EL EVENTO SERA HACER LA SUMA*/
   private class MyClickSuma extends MouseAdapter // cuando le de al boton suma 
   {
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event) // cuando le de click en el boton aceptar 
      {
         
         numero1 = Double.parseDouble(num1.getText()); // convierto a numero la cadena que ingreso el usuario
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1+numero2; 
         //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
         respuesta.setText("Resultado "+String.valueOf(resul));
         
            
            
      }
   }
   /*--------------- BOTON EN RESTA -------------------------------------------*/
   private class MyClickResta extends MouseAdapter // cuando le de al boton suma 
   {
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event) // cuando le de click en el boton aceptar 
      {
         
         numero1 = Double.parseDouble(num1.getText()); // convierto a numero la cadena que ingreso el usuario
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1-numero2; 
         //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
         respuesta.setText("Resultado "+String.valueOf(resul));
         
            
            
      }
   }
   /*--------------- BOTON EN MULTIPLIACION -------------------------------------------*/
   private class MyClickMultiplicacion extends MouseAdapter // cuando le de al boton suma 
   {
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event) // cuando le de click en el boton aceptar 
      {
         
         numero1 = Double.parseDouble(num1.getText()); // convierto a numero la cadena que ingreso el usuario
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1*numero2; 
         //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
         respuesta.setText("Resultado "+String.valueOf(resul));
         
            
            
      }
   }
   /*--------------- BOTON EN DIVISION -------------------------------------------*/
   private class MyClickDivision extends MouseAdapter // cuando le de al boton suma 
   {
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event) // cuando le de click en el boton aceptar 
      {
         
         numero1 = Double.parseDouble(num1.getText()); // convierto a numero la cadena que ingreso el usuario
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1/numero2; 
         //para que algo se pueda imprimir en la interfaz, tiene que ser todo de tipo String
         respuesta.setText("Resultado "+String.valueOf(resul));
         
            
            
      }
   }



   
   
   
   
   
   
   
   
   /*ESTA CLASE ES PARA CUANDO LE DE AL BOTON SALIR Y QUE TERMINE EL PROGRAMA*/
   private class SALIR extends MouseAdapter // cuando le de al boton salir
   {
      public void mouseClicked(MouseEvent event)
      {
         System.exit(0);
      }
   }

}