package acertijo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Alejandra Carreño P
 */
public class Acertijo {
    public static void main(String[] args) {
        JFrame wdw = new JFrame ("Acertijo");
        wdw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wdw.setSize(600, 400);
        wdw.setLocationRelativeTo(null);
        
        JTabbedPane Pestañas = new JTabbedPane();
        
        //Inicio
        JPanel Inicio = new JPanel();
        Inicio.add(new JLabel("  BIENVENIDO AL ACERTIJO  "));
        Inicio.add(new JLabel("En cada pestaña de letra encontraras un reto, si aciertas recibiras una letra."));
        Inicio.add(new JLabel("En la pestaña de respuesta debes escribir las tres en orden, teniendolas correctas ganarás"));
        //Botón continuar que te lleve a la primera letra
        
        //Letra 1
        JPanel L1 = new JPanel();
        L1.add(new JLabel("Con estas pistas debes encontrar cinco puntos, al unirlos en orden formarán la letra que buscas"));
        JTextField X1 = new JTextField(5);
        JTextField Y1 = new JTextField(5);
        JTextField X2 = new JTextField(5);
        JTextField Y2 = new JTextField(5);
        JTextField X3 = new JTextField(5);
        JTextField Y3 = new JTextField(5);
        JTextField X4 = new JTextField(5);
        JTextField Y4 = new JTextField(5);
        JTextField X5 = new JTextField(5);
        JTextField Y5 = new JTextField(5);
        JButton Revisión1 = new JButton("Revisar");
        
        L1.add(new JLabel("En esta coordenada X es igual a cualquier raiz y potencia de Y "));
        L1.add(X1);
        L1.add(Y1);
        
        L1.add(new JLabel("4X+1=Y y ambos puntos son enteros menores a 6 "));
        L1.add(X2);
        L1.add(Y2);
        
        L1.add(new JLabel("Y se mantiene igual mientras que a X le sumas el primer multiplo de 3"));
        L1.add(X3);
        L1.add(Y3);
        
        L1.add(new JLabel("Y=X-1 y además X es el menor número compuesto "));
        L1.add(X4);
        L1.add(Y4);
        
        L1.add(new JLabel("Este punto se ubica justo en la mitad de los dos primeros "));
        L1.add(X5);
        L1.add(Y5);
        
        L1.add(Revisión1);
        Revisión1.addActionListener((ActionEvent e) -> {
            int x1 = Integer.parseInt(X1.getText());
            int y1 = Integer.parseInt(Y1.getText());
            int x2 = Integer.parseInt(X2.getText());
            int y2 = Integer.parseInt(Y2.getText());
            int x3 = Integer.parseInt(X3.getText());
            int y3 = Integer.parseInt(Y3.getText());
            int x4 = Integer.parseInt(X4.getText());
            int y4 = Integer.parseInt(Y4.getText());
            int x5 = Integer.parseInt(X5.getText());
            int y5 = Integer.parseInt(Y5.getText());
            if(x1!=1){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(y1!=1){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(x2!=1){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(y2!=5){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(x3!=4){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(y3!=5){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(x4!=4){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(y4!=3){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(x5!=1){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else if(y5!=3){
                JOptionPane.showMessageDialog(wdw, "Revisa tus respuestas, hay algo mal");
            }else{
                JOptionPane.showMessageDialog(wdw, "PERFECTO, ya tienes la letra 1");
            }
        });
        
        //Letra 2
        JPanel L2 = new JPanel();
        L2.add(new JLabel("Para conseguir esta letra debes encontrar un npumero de tres cifras"));
        L2.add(new JLabel("                    La suma de sus digitos es 9                   "));
        L2.add(new JLabel("           El segundo digito es el cuadrado del primero           "));
        L2.add(new JLabel("              Los tres digitos son números diferentes             "));
        JTextField C = new JTextField(3);
        JTextField D = new JTextField(3);
        JTextField U = new JTextField(3);
        L2.add(C);
        L2.add(D);
        L2.add(U);
        JButton Revisión2 = new JButton("Revisar");
        L2.add(Revisión2);
        Revisión2.addActionListener((ActionEvent e) -> {
            int c = Integer.parseInt(C.getText());
            int d = Integer.parseInt(D.getText());
            int u = Integer.parseInt(U.getText());
            if(c!=2){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, vuelve a intentar");
            }else if(d!=4){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, vuelve a intentar");
            }else if(u!=3){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, vuelve a intentar");
            }else{
                JOptionPane.showMessageDialog(wdw, "EXCELENTE, la segunta letra es la O");
            }
        });
        
        //Letra 3
        JPanel L3 = new JPanel();
        JLabel lblInstrucciones = new JLabel("Encuentra el código para abrir la caja.");
        L3.add(lblInstrucciones);
        
        JButton btnAbrirCaja = new JButton("Caja Cerrada 🔒");
        JTextField txtCodigo = new JTextField(10);
        JButton btnVerificar = new JButton("Abrir");
        
        JLabel lblPista1 = new JLabel("Pista 1: La suma de los dígitos es 10 y la diferencia de los dos primeros con los dos ultimos de de 15.");
        JLabel lblPista2 = new JLabel("Pista 2: Es un número par, el digito de las centenas es un 7.");
        JLabel lblPista3 = new JLabel("Pista 3: Está entre 1000 y 2000.");
        
        lblPista1.setVisible(false);
        lblPista2.setVisible(false);
        lblPista3.setVisible(false);
        
        btnAbrirCaja.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblPista1.setVisible(true);
            }
        });
        
        btnAbrirCaja.addActionListener(e -> lblPista2.setVisible(true));
        
        txtCodigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                lblPista3.setVisible(true);
            }
        });
        
        btnVerificar.addActionListener(e -> {
            if (txtCodigo.getText().equals("1702")) {
                JOptionPane.showMessageDialog(null, "¡Asombroso! Has abierto la caja y la tercera letra es la O.", "Caja Abierta", JOptionPane.INFORMATION_MESSAGE);
                btnAbrirCaja.setText("Caja Abierta ✅");
            } else {
                JOptionPane.showMessageDialog(null, "Código incorrecto. Inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        L3.add(btnAbrirCaja);
        L3.add(txtCodigo);
        L3.add(btnVerificar);
        L3.add(lblPista1);
        L3.add(lblPista2);
        L3.add(lblPista3);
        
        //Fin
        JPanel Respuesta = new JPanel();
        Respuesta.add(new JLabel("Ahora ubica las tres letras en mayúsculas y en orden"));
        JTextField l1 = new JTextField(2);
        JTextField l2 = new JTextField(2);
        JTextField l3 = new JTextField(2);
        JButton Fin = new JButton("   GANAR   ");
        
        Respuesta.add(l1);
        Respuesta.add(l2);
        Respuesta.add(l3);
        Respuesta.add(Fin);
        
        Fin.addActionListener(e -> {
            if(!l1.getText().equals("P")){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, ibamos bien, revisa tu progreso");
            }else if(!l2.getText().equals("O")){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, ibamos bien, revisa tu progreso");
            }else if(!l3.getText().equals("O")){
                JOptionPane.showMessageDialog(wdw, "INCORRECTO, ibamos bien, revisa tu progreso");
            }else{
                JOptionPane.showMessageDialog(wdw, "🎉 FELICIDADES GANASTE 🎉");
            }
        });
        
        Pestañas.addTab("   Inicio   ", Inicio);
        Pestañas.addTab("   Letra 1  ", L1);
        Pestañas.addTab("   Letra 2  ", L2);
        Pestañas.addTab("   Letra 3  ", L3);
        Pestañas.addTab("  Respuesta ", Respuesta);
        wdw.add(Pestañas);
        wdw.setVisible(true);
    }
    
}
