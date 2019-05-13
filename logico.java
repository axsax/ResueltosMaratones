/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

/**
 *
 * @author jhon-
 */
public class logico extends JFrame implements ActionListener {

    JLabel agua, coca, jugo, cigarrillo, limonada, papas, chocolatinas, galletas, mani, uvas, pepsi, colombiana, productos, precio, textoMiles, textoCentenas;
    JLabel imagenAgua, imagenCoca, imagenJugo, imagenCigarrillo, imagenLimonada, imagenPapas, imagenChocolatinas, imagenGalletas, imagenMani, imagenUvas, imagenPepsi, imagenColombiana;
    JRadioButton escogerAgua, escogerCoca, escogerjugo, escogerCigarrillo, escogerLimonada, escogerPapas, escogerChocolatinas, escogerGalletas, escogerMani, escogerUvas, escogerPepsi, escogerColombiana;
    JPanel fondoImagenes;
    JButton pagar, cancelar;
    JTextPane suma, vueltas, sumaTotal,dinero;
    JComboBox miles, centenas;

    public logico() {
        fondoImagenes = new JPanel();
        fondoImagenes.setLayout(null);
        fondoImagenes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 4), "TIENDA DONDE MARTA"));
        fondoImagenes.setBackground(Color.white);
        fondoImagenes.setBounds(5, 5, 800, 520);
        add(fondoImagenes);

        // afuera
        miles = new JComboBox();
        miles.addItem("0.000");
        miles.addItem("1.000");
        miles.addItem("2.000");
        miles.addItem("3.000");
        miles.addItem("4.000");
        miles.addItem("5.000");
        miles.setActionCommand("miles");
        miles.addActionListener(this);
        miles.setBounds(980, 5, 100, 30);
        miles.setBorder(null);
        add(miles);

        centenas = new JComboBox();
        centenas.addItem(".000");
        centenas.addItem(".100");
        centenas.addItem(".200");
        centenas.addItem(".300");
        centenas.addItem(".400");
        centenas.addItem(".500");
        centenas.setActionCommand("centenas");
        centenas.addActionListener(this);
        centenas.setBounds(1110, 5, 100, 30);
        centenas.setBorder(null);
        add(centenas);

        suma = new JTextPane();
        suma.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 4), "Precios"));
        suma.setBounds(820, 5, 140, 220);
        add(suma);

        sumaTotal = new JTextPane();
        sumaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 4), "Total"));
        sumaTotal.setBounds(840, 240, 100, 50);
        add(sumaTotal);

        vueltas = new JTextPane();
        vueltas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 4), "Vueltas"));
        vueltas.setBounds(820, 450, 100, 100);
        add(vueltas);

         dinero = new JTextPane();
        dinero.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 4), "Dinero"));
        dinero.setBounds(1050, 50, 100, 40);
        add(dinero);
        
        pagar = new JButton("PAGAR");
        pagar.setBounds(1100, 510, 100, 30);
        pagar.setBackground(Color.LIGHT_GRAY);
        pagar.setBorder(null);
        pagar.setActionCommand("pagar");
        pagar.addActionListener(this);
        add(pagar);

        cancelar = new JButton("CANCELAR");
        cancelar.setBounds(940, 510, 100, 30);
        cancelar.setBackground(Color.LIGHT_GRAY);
        cancelar.setBorder(null);
        cancelar.setActionCommand("cancelar");
        cancelar.addActionListener(this);
        add(cancelar);

        //afuera
        agua = new JLabel("Agua");
        agua.setBounds(50, 30, 100, 30);
        fondoImagenes.add(agua);

        escogerAgua = new JRadioButton();
        escogerAgua.setBounds(20, 35, 20, 20);
        escogerAgua.setActionCommand("agua");
        escogerAgua.setBackground(null);
        escogerAgua.addActionListener(this);
        fondoImagenes.add(escogerAgua);

        imagenAgua = new JLabel();
        Icon a = new ImageIcon(getClass().getResource("agua.png"));
        imagenAgua.setIcon(a);
        imagenAgua.setBounds(20, 60, 100, 110);
        fondoImagenes.add(imagenAgua);

        coca = new JLabel("Coca");
        coca.setBounds(250, 30, 100, 30);
        fondoImagenes.add(coca);

        escogerCoca = new JRadioButton();
        escogerCoca.setBounds(220, 35, 20, 20);
        escogerCoca.setActionCommand("coca");
        escogerCoca.setBackground(null);
        escogerCoca.addActionListener(this);
        fondoImagenes.add(escogerCoca);

        imagenCoca = new JLabel();
        Icon b = new ImageIcon(getClass().getResource("coca.png"));
        imagenCoca.setIcon(b);
        imagenCoca.setBounds(220, 60, 100, 110);
        fondoImagenes.add(imagenCoca);

        jugo = new JLabel("Jugo");
        jugo.setBounds(490, 30, 100, 30);
        fondoImagenes.add(jugo);

        escogerjugo = new JRadioButton();
        escogerjugo.setBounds(460, 35, 20, 20);
        escogerjugo.setActionCommand("jugo");
        escogerjugo.setBackground(null);
        escogerjugo.addActionListener(this);
        fondoImagenes.add(escogerjugo);

        imagenJugo = new JLabel();
        Icon c = new ImageIcon(getClass().getResource("jugo.png"));
        imagenJugo.setIcon(c);
        imagenJugo.setBounds(460, 60, 100, 110);
        fondoImagenes.add(imagenJugo);

        cigarrillo = new JLabel("Cigarrillo");
        cigarrillo.setBounds(700, 30, 100, 30);
        fondoImagenes.add(cigarrillo);

        escogerCigarrillo = new JRadioButton();
        escogerCigarrillo.setBounds(670, 35, 20, 20);
        escogerCigarrillo.setActionCommand("cigarrillo");
        escogerCigarrillo.setBackground(null);
        escogerCigarrillo.addActionListener(this);
        fondoImagenes.add(escogerCigarrillo);

        imagenCigarrillo = new JLabel();
        Icon d = new ImageIcon(getClass().getResource("cigarrillo.png"));
        imagenCigarrillo.setIcon(d);
        imagenCigarrillo.setBounds(670, 60, 100, 110);
        fondoImagenes.add(imagenCigarrillo);

        limonada = new JLabel("Limonada");
        limonada.setBounds(50, 180, 100, 30);
        fondoImagenes.add(limonada);

        escogerLimonada = new JRadioButton();
        escogerLimonada.setBounds(20, 185, 20, 20);
        escogerLimonada.setActionCommand("limonada");
        escogerLimonada.setBackground(null);
        escogerLimonada.addActionListener(this);
        fondoImagenes.add(escogerLimonada);

        imagenLimonada = new JLabel();
        Icon e = new ImageIcon(getClass().getResource("limonada.png"));
        imagenLimonada.setIcon(e);
        imagenLimonada.setBounds(20, 210, 100, 110);
        fondoImagenes.add(imagenLimonada);

        papas = new JLabel("Papas");
        papas.setBounds(250, 180, 100, 30);
        fondoImagenes.add(papas);

        escogerPapas = new JRadioButton();
        escogerPapas.setBounds(220, 185, 20, 20);
        escogerPapas.setActionCommand("papas");
        escogerPapas.setBackground(null);
        escogerPapas.addActionListener(this);
        fondoImagenes.add(escogerPapas);

        imagenPapas = new JLabel();
        Icon f = new ImageIcon(getClass().getResource("papas.png"));
        imagenPapas.setIcon(f);
        imagenPapas.setBounds(220, 210, 100, 110);
        fondoImagenes.add(imagenPapas);

        chocolatinas = new JLabel("Chocolatinas");
        chocolatinas.setBounds(490, 180, 100, 30);
        fondoImagenes.add(chocolatinas);

        escogerChocolatinas = new JRadioButton();
        escogerChocolatinas.setBounds(460, 185, 20, 20);
        escogerChocolatinas.setActionCommand("chocolatinas");
        escogerChocolatinas.setBackground(null);
        escogerChocolatinas.addActionListener(this);
        fondoImagenes.add(escogerChocolatinas);

        imagenChocolatinas = new JLabel();
        Icon g = new ImageIcon(getClass().getResource("chocolatinas.png"));
        imagenChocolatinas.setIcon(g);
        imagenChocolatinas.setBounds(460, 210, 100, 110);
        fondoImagenes.add(imagenChocolatinas);

        galletas = new JLabel("Galletas");
        galletas.setBounds(700, 180, 100, 30);
        fondoImagenes.add(galletas);

        escogerGalletas = new JRadioButton();
        escogerGalletas.setBounds(670, 185, 20, 20);
        escogerGalletas.setActionCommand("galletas");
        escogerGalletas.setBackground(null);
        escogerGalletas.addActionListener(this);
        fondoImagenes.add(escogerGalletas);

        imagenGalletas = new JLabel();
        Icon h = new ImageIcon(getClass().getResource("galletas.png"));
        imagenGalletas.setIcon(h);
        imagenGalletas.setBounds(670, 210, 100, 110);
        fondoImagenes.add(imagenGalletas);

        mani = new JLabel("Mani");
        mani.setBounds(50, 370, 100, 30);
        fondoImagenes.add(mani);

        escogerMani = new JRadioButton();
        escogerMani.setBounds(20, 375, 20, 20);
        escogerMani.setActionCommand("mani");
        escogerMani.setBackground(null);
        escogerMani.addActionListener(this);
        fondoImagenes.add(escogerMani);

        imagenMani = new JLabel();
        Icon i = new ImageIcon(getClass().getResource("mani.png"));
        imagenMani.setIcon(i);
        imagenMani.setBounds(20, 400, 100, 110);
        fondoImagenes.add(imagenMani);

        uvas = new JLabel("Uvas");
        uvas.setBounds(250, 370, 100, 30);
        fondoImagenes.add(uvas);

        escogerUvas = new JRadioButton();
        escogerUvas.setBounds(230, 375, 20, 20);
        escogerUvas.setActionCommand("uvas");
        escogerUvas.setBackground(null);
        escogerUvas.addActionListener(this);
        fondoImagenes.add(escogerUvas);

        imagenUvas = new JLabel();
        Icon j = new ImageIcon(getClass().getResource("uvas.png"));
        imagenUvas.setIcon(j);
        imagenUvas.setBounds(230, 400, 100, 110);
        fondoImagenes.add(imagenUvas);

        pepsi = new JLabel("Pepsi");
        pepsi.setBounds(490, 370, 100, 30);
        fondoImagenes.add(pepsi);

        escogerPepsi = new JRadioButton();
        escogerPepsi.setBounds(460, 375, 20, 20);
        escogerPepsi.setActionCommand("pepsi");
        escogerPepsi.setBackground(null);
        escogerPepsi.addActionListener(this);
        fondoImagenes.add(escogerPepsi);

        imagenPepsi = new JLabel();
        Icon k = new ImageIcon(getClass().getResource("pepsi.png"));
        imagenPepsi.setIcon(k);
        imagenPepsi.setBounds(460, 400, 100, 110);
        fondoImagenes.add(imagenPepsi);

        colombiana = new JLabel("Colombiana");
        colombiana.setBounds(700, 370, 100, 30);
        fondoImagenes.add(colombiana);

        escogerColombiana = new JRadioButton();
        escogerColombiana.setBounds(670, 375, 20, 20);
        escogerColombiana.setActionCommand("colombiana");
        escogerColombiana.setBackground(null);
        escogerColombiana.addActionListener(this);
        fondoImagenes.add(escogerColombiana);

        imagenColombiana = new JLabel();
        Icon l = new ImageIcon(getClass().getResource("colombiana.png"));
        imagenColombiana.setIcon(l);
        imagenColombiana.setBounds(670, 400, 100, 110);
        fondoImagenes.add(imagenColombiana);
        /*
        productos = new JLabel("Productos");
        productos.setBounds(5, 30, 100, 30);
        add(productos);

        precio = new JLabel("Precio");
        precio.setBounds(5, 30, 100, 30);
        add(precio);

        vueltas = new JLabel("Vueltas");
        vueltas.setBounds(5, 30, 100, 30);
        add(vueltas);

        miles = new JLabel("Miles");
        miles.setBounds(5, 30, 100, 30);
        add(miles);

        centenas = new JLabel("Centenas");
        centenas.setBounds(5, 30, 100, 30);
        add(centenas);
         */
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sumas = "";
        Double sum = 0.0;
        
          Double toto = 0.0;
            if (miles.getSelectedIndex() == 0) {
                toto += 0.0;
            }
            if (miles.getSelectedIndex() == 1) {
                toto += 1.000;
            }
            if (miles.getSelectedIndex() == 2) {
                toto += 2.000;
            }
            if (miles.getSelectedIndex() == 3) {
                toto += 3.000;
            }
            if (miles.getSelectedIndex() == 4) {
                toto += 4.000;
            }
            if (miles.getSelectedIndex() == 5) {
                toto += 5.000;
            }
            if (centenas.getSelectedIndex() == 0) {
                toto += 0.000;
            }
            if (centenas.getSelectedIndex() == 1) {
                toto += 0.100;
            }
            if (centenas.getSelectedIndex() == 2) {
                toto += 0.200;
            }
            if (centenas.getSelectedIndex() == 3) {
                toto += 0.300;
            }
            if (centenas.getSelectedIndex() == 4) {
                toto += 0.400;
            }
            if (centenas.getSelectedIndex() == 5) {
                toto += 0.500;
            }
            dinero.setText(""+toto);
        
        
        
        if (escogerAgua.isSelected()) {
            sumas += "Agua: $.100" + "\n";
            sum += 0.100;
        }
        if (escogerChocolatinas.isSelected()) {
            sumas += "Chocolatinas: $.200" + "\n";
            sum += 0.200;
        }
        if (escogerCigarrillo.isSelected()) {
            sumas += "Cigarrilo: $.300" + "\n";
            sum += 0.300;
        }
        if (escogerCoca.isSelected()) {
            sumas += "Coca $.400" + "\n";
            sum += 0.400;
        }
        if (escogerColombiana.isSelected()) {
            sumas += "Colombiana $.500" + "\n";
            sum += 0.500;
        }
        if (escogerGalletas.isSelected()) {
            sumas += "Galletas $.600" + "\n";
            sum += 0.600;
        }
        if (escogerLimonada.isSelected()) {
            sumas += "Limonada: $.700" + "\n";
            sum += 0.700;
        }
        if (escogerMani.isSelected()) {
            sumas += "Mani: $.800" + "\n";
            sum += 0.800;
        }
        if (escogerPapas.isSelected()) {
            sumas += "Papas: $.900" + "\n";
            sum += 0.900;
        }
        if (escogerPepsi.isSelected()) {
            sumas += "Pepsi: $1.000" + "\n";
            sum += 1.000;
        }
        if (escogerUvas.isSelected()) {
            sumas += "Uvas: $1.100" + "\n";
            sum += 1.100;
        }
        if (escogerjugo.isSelected()) {
            sumas += "Jugo: $1.200" + "\n";
            sum += 1.200;
        }
        suma.setText(sumas);
        sumaTotal.setText("$ " + sum);
        if (ae.getActionCommand().equals("pagar")) {
            Double resto = 0.0;
            Double tot = 0.0;
            Double otro = sum;
            if (miles.getSelectedIndex() == 0) {
                tot += 0.0;
            }
            if (miles.getSelectedIndex() == 1) {
                tot += 1.000;
            }
            if (miles.getSelectedIndex() == 2) {
                tot += 2.000;
            }
            if (miles.getSelectedIndex() == 3) {
                tot += 3.000;
            }
            if (miles.getSelectedIndex() == 4) {
                tot += 4.000;
            }
            if (miles.getSelectedIndex() == 5) {
                tot += 5.000;
            }
            if (centenas.getSelectedIndex() == 0) {
                tot += 0.000;
            }
            if (centenas.getSelectedIndex() == 1) {
                tot += 0.100;
            }
            if (centenas.getSelectedIndex() == 2) {
                tot += 0.200;
            }
            if (centenas.getSelectedIndex() == 3) {
                tot += 0.300;
            }
            if (centenas.getSelectedIndex() == 4) {
                tot += 0.400;
            }
            if (centenas.getSelectedIndex() == 5) {
                tot += 0.500;
            }
            System.out.println("tot "+tot+"sum "+sum);
            Double ojo1,ojo2;
            ojo1=tot;
            ojo2=sum;
            if ((ojo1 -= ojo2) > 0) {
                vueltas.setText(""+(tot -= sum));
            }else{
                JOptionPane.showMessageDialog(null, "NO TE ALCANZA");
            }

        }
        if (ae.getActionCommand().equals("cancelar")) {

        }
    }

}
