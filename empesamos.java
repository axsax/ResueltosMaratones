/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_sistemas_operativos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import proy_sistemas_operativos.logico;

public class empesamos extends JFrame implements ActionListener {

    JPanel fondo, entrada, muestra, grafica, resultados;
    JLabel textoEscoja, textoCantidad, entradaProceso, entradaLlegada, entradaTiempo, muestraProceso, muestraLlegada, muestraTiempo, resultadosProceso, resultadosLlegada, resultadosTiempo, resultadosT, resultadosE, resultadosP;
    JComboBox escoger;
    JTextField cantidad, proceso, llegada, tiempo;
    JTextArea muestraColocar, resultadosColocar;
    JButton anadir, limpiar, aceptar, cancelar;
    String texto = "", otroTexto = "";
    LinkedList<String> cola = new LinkedList<>();
    int llegada1 = 0, tiempo1 = 0, suma = 0, co = 0;
    String tabla[][];
    int t[];
    int e[];
    double p[];
    double resultado;
    int r = 120;
    JPanel dibujo;
    JFrame jf;

    public empesamos() {

        jf = new JFrame();
        jf.setBounds(380, 65, 865, 270);
        jf.setUndecorated(true);
        jf.setBackground(Color.yellow);
        jf.setAlwaysOnTop(true);
        jf.setVisible(true);

        //INICIA TODO DENTRO DE FONDO
        dibujo = new JPanel();
        dibujo.setBounds(0, 0, 850, 250);
        dibujo.setVisible(true);
        dibujo.setBackground(Color.LIGHT_GRAY);

        fondo = new JPanel();
        fondo.setLayout(null);
        fondo.setBackground(Color.LIGHT_GRAY);
        fondo.setBounds(5, 5, 1225, 630);

        add(fondo);
        //INICIA ESCOGER
        textoEscoja = new JLabel("Escoja el algoritmo :");
        textoEscoja.setBounds(5, 5, 120, 30);
        fondo.add(textoEscoja);

        escoger = new JComboBox();
        escoger.addItem("FCFS");
        escoger.addItem("SPN");
        escoger.addItem("RRQ");
        escoger.setBounds(130, 5, 100, 30);
        escoger.setActionCommand("escoger");
        escoger.addActionListener(this);
        fondo.add(escoger);
        //TERMINAR ESCOGER

        //INICIA CANTIDAD
        textoCantidad = new JLabel("Cantidad de procesos :");
        textoCantidad.setBounds(5, 40, 160, 30);
        fondo.add(textoCantidad);

        cantidad = new JTextField();
        cantidad.setBounds(150, 40, 100, 25);
        fondo.add(cantidad);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(5, 240, 80, 25);
        limpiar.setActionCommand("limpiar");
        limpiar.addActionListener(this);
        fondo.add(limpiar);

        anadir = new JButton("Añadir");
        anadir.setBounds(255, 240, 80, 25);
        anadir.setActionCommand("anadir");
        anadir.addActionListener(this);
        fondo.add(anadir);

        cancelar = new JButton("cancelar");
        cancelar.setBounds(5, 600, 100, 25);
        cancelar.setActionCommand("cancelar");
        cancelar.addActionListener(this);
        fondo.add(cancelar);

        aceptar = new JButton("Aceptar");
        aceptar.setBounds(255, 600, 80, 25);
        aceptar.setActionCommand("aceptar");
        aceptar.addActionListener(this);
        fondo.add(aceptar);
        //TERMINA CANTIDAD
        //TERMINA TODO DE FONDO
        //INICIA TODO DE PANEL ENTRADA
        entrada = new JPanel();
        entrada.setLayout(null);
        entrada.setBackground(Color.yellow);
        entrada.setBounds(5, 90, 330, 140);
        fondo.add(entrada);

        entradaProceso = new JLabel("Proceso");
        entradaProceso.setBounds(5, 5, 100, 30);
        entrada.add(entradaProceso);

        proceso = new JTextField();
        proceso.setBounds(100, 5, 100, 30);
        entrada.add(proceso);

        entradaLlegada = new JLabel("Llegada");
        entradaLlegada.setBounds(5, 50, 100, 30);
        entrada.add(entradaLlegada);

        llegada = new JTextField();
        llegada.setBounds(100, 50, 100, 30);
        entrada.add(llegada);

        entradaTiempo = new JLabel("Tiempo");
        entradaTiempo.setBounds(5, 95, 100, 30);
        entrada.add(entradaTiempo);

        tiempo = new JTextField();
        tiempo.setBounds(100, 95, 100, 30);
        entrada.add(tiempo);

        //TERMINA TODO DE PANEL ENTRADA
        //INICIA PANEL DE MOSTRAR
        muestra = new JPanel();
        muestra.setLayout(null);
        muestra.setBackground(Color.yellow);
        muestra.setBounds(5, 300, 330, 290);
        fondo.add(muestra);

        muestraProceso = new JLabel("Proceso");
        muestraProceso.setBounds(5, 5, 100, 20);
        muestra.add(muestraProceso);

        muestraLlegada = new JLabel("Llegada");
        muestraLlegada.setBounds(130, 5, 100, 20);
        muestra.add(muestraLlegada);

        muestraTiempo = new JLabel("Tiempo");
        muestraTiempo.setBounds(260, 5, 100, 20);
        muestra.add(muestraTiempo);

        muestraColocar = new JTextArea();
        muestraColocar.setBounds(5, 40, 320, 240);
        muestraColocar.setEditable(false);
        muestraColocar.setLineWrap(true);

        muestra.add(muestraColocar);
        //TERMINA PANEL DE MOSTRAR
        grafica = new JPanel();
        grafica.setLayout(null);
        grafica.setBackground(Color.yellow);
        grafica.setBounds(360, 10, 850, 250);
        fondo.add(grafica);
        //AQUI INICIA RESULTADOS
        resultados = new JPanel();
        resultados.setLayout(null);
        resultados.setBackground(Color.yellow);
        resultados.setBounds(360, 340, 850, 250);
        fondo.add(resultados);

        resultadosProceso = new JLabel("Procesos");
        resultadosProceso.setBounds(5, 5, 100, 30);
        resultados.add(resultadosProceso);

        resultadosLlegada = new JLabel("Llegada");
        resultadosLlegada.setBounds(165, 5, 100, 30);
        resultados.add(resultadosLlegada);

        resultadosTiempo = new JLabel("Tiempo");
        resultadosTiempo.setBounds(320, 5, 100, 30);
        resultados.add(resultadosTiempo);

        resultadosT = new JLabel("T");
        resultadosT.setBounds(475, 5, 100, 30);
        resultados.add(resultadosT);

        resultadosE = new JLabel("E");
        resultadosE.setBounds(620, 5, 100, 30);
        resultados.add(resultadosE);

        resultadosP = new JLabel("P");
        resultadosP.setBounds(770, 5, 100, 30);
        resultados.add(resultadosP);

        resultadosColocar = new JTextArea();
        resultadosColocar.setBounds(5, 40, 840, 240);
        resultadosColocar.setEditable(false);
        resultadosColocar.setLineWrap(true);
        resultados.add(resultadosColocar);

        //AQUI TERMINA RESULTADOS
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("anadir")) {
            texto += "       " + proceso.getText() + "\t               " + llegada.getText() + "\t                              " + tiempo.getText() + "\n";

            muestraColocar.setText(texto);
            cola.add(proceso.getText());

            cola.add(llegada.getText());
            cola.add(tiempo.getText());

            int b = Integer.valueOf(llegada.getText());
            int c = Integer.valueOf(tiempo.getText());
           logico casi = new logico(b, c, r);
            System.out.println("asasd");
            jf.add(casi);
            
            jf.setSize(865, 270);
            jf.setVisible(true);
            jf.invalidate();//Con esto me pinta y evita bugueada
            jf.validate();//Con esto me pinta y evita bugueada
            jf.repaint();//Con esto me pinta y evita bugueada
            /*
            dibujo.add(casi);
            dibujo.setBounds(0, 0, 850, 250);
            dibujo.setVisible(true);
             */
            r -= 25;

        }

        if (ae.getActionCommand().equals("limpiar")) {
            llegada.setText("");
            proceso.setText("");
            tiempo.setText("");
        }

        if (ae.getActionCommand().equals("cancelar")) {
            llegada1 = 0;
            tiempo1 = 0;
            suma = 0;
            co = 0;

            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla[i].length; j++) {
                    tabla[i][j] = null;
                }
            }

            int t[];
            int e[];
            double p[];
            double resultado;
            llegada.setText("");
            proceso.setText("");
            tiempo.setText("");
            cantidad.setText("");
            cola.clear();
            texto = "";
            otroTexto = "";
            resultadosColocar.setText("");
            muestraColocar.setText("");
        }

        if (ae.getActionCommand().equals("aceptar")) {
            switch (escoger.getSelectedIndex()) {
                case 0:
                    FCFS();
                    break;
                //SPN
                case 1:
                    break;
                //RRQ
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
public void FCFS(){
    int cantidadProcesos;
                    //FCFS
                    int escogiendo = 0;
                    cantidadProcesos = Integer.parseInt(cantidad.getText());
                    t = new int[cantidadProcesos];
                    e = new int[cantidadProcesos];
                    p = new double[cantidadProcesos];
                    tabla = new String[cantidadProcesos][6];
                    for (int i = 0; i < cantidadProcesos; i++) {
                        for (int j = 0; j < 3; j++) {
                            tabla[i][j] = cola.get(escogiendo);
                            escogiendo++;
                        }
                    }
                    for (int j = 0; j < cantidadProcesos; j++) {
                        for (int k = 1; k < 3; k++) {
                            if (k == 1) {
                                llegada1 = Integer.parseInt(tabla[j][k]);
                            } else if (k == 2) {
                                tiempo1 = Integer.parseInt(tabla[j][k]);
                                if (co == 0) {
                                    suma = tiempo1;
                                }
                                co++;
                            }
                        }
                        if (co == 1) {
                            suma = 0;
                        }
                        suma = suma + tiempo1;
                        int re = (Math.abs(suma - llegada1));
                        t[j] = re;

                        for (int i = 0; i < cantidadProcesos; i++) {
                            e[i] = t[i] - Integer.parseInt(tabla[i][2]);
                            p[i] = t[i] / Double.parseDouble(tabla[i][2]);
                        }
                        for (int i = 0; i < cantidadProcesos; i++) {
                            for (int k = 3; k < 6; k++) {
                                if (k == 3) {
                                    tabla[i][k] = Integer.toString(t[i]);

                                } else if (k == 4) {
                                    tabla[i][k] = Integer.toString(e[i]);

                                } else if (k == 5) {
                                    resultado = p[i] * Math.pow(10, 3);
                                    resultado = Math.round(resultado);
                                    resultado = resultado / Math.pow(10, 3);
                                    tabla[i][k] = Double.toString(resultado);
                                }
                            }
                        }
                    }
                    //saber tabla
                    for (int i = 0; i < cantidadProcesos; i++) {
                        for (int k = 0; k < 6; k++) {
                            otroTexto += "     " + tabla[i][k] + "                                            ";
                        }
                        otroTexto += "\n";
                    }
                    resultadosColocar.setText(otroTexto);

}
}
