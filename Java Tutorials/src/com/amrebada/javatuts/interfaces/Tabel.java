/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amrebada.javatuts.interfaces;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Tabel extends JFrame {

    /**
     * @param args
     */
    int numberOfCheckBoxes = 3;  //this is used to get the number of items in the combobox
    JCheckBox[] checkBoxList;   //the list that contains the checkboxes

    String[] columns = new String[]{"Column 1", "Column 2", "Column 3"};  //something for the table to display
    Object data[][] = {
        {true, new Integer(10), new String("String 1")},
        {false, new Integer(20), new String("String 2")},
        {true, new Integer(30), new String("String 3")}
    };

    JTable table;
    JPanel firstPanel = new JPanel();  //this is just for gui to look better
    JPanel secondPanel = new JPanel();

    @SuppressWarnings("unchecked")
    public void initialize() {

        table = new JTable(data, columns);
        this.setTitle("Tabel");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 200);

        firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.Y_AXIS));
        firstPanel.setBorder(new TitledBorder("Table"));

        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.Y_AXIS));
        secondPanel.setBorder(new TitledBorder("GUI Items"));

        firstPanel.add(table.getTableHeader(), BorderLayout.PAGE_START); //if you don't use this line, the column names won't be displayed in the window

        firstPanel.add(table);

        ArrayList<String> columnNames = new ArrayList<>(); //list for containg the column names

        for (int i = 0; i < table.getColumnCount(); i++) {
            columnNames.add(table.getColumnName(i));
        }

        JComboBox<?> comboBox = new JComboBox(columnNames.toArray());
        numberOfCheckBoxes = comboBox.getItemCount();  //get the number of items in combobox

//		secondPanel.add(comboBox);
        JButton b = new JButton("add");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOfCheckBoxes++;
                checkBoxes(false);
            }
        });
        firstPanel.add(b);
        checkBoxes(true);  //method for creating the checkboxes

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(firstPanel);
        this.add(secondPanel);

    }

    void checkBoxes(boolean isInit) {
        checkBoxList = new JCheckBox[numberOfCheckBoxes];

        if (!isInit) {
            secondPanel.removeAll();
        }

        for (int i = 0; i < checkBoxList.length; ++i) {
            checkBoxList[i] = new JCheckBox("CheckBox #" + i); //create the check boxes and add them to the jframe
            secondPanel.add(checkBoxList[i]);

        }
        if (!isInit) {
            this.remove(secondPanel);
            this.add(secondPanel);
            secondPanel.repaint();
            this.repaint();
            
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tabel program = new Tabel();
        program.initialize();
    }

}
