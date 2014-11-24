package com.clouway.networkingandgui.calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:56 Nov 14-11-19
 */
public class NewCalculator extends JFrame {
  private JTextField textField1, textField2;
  private JButton button7, button8, button9, button4, button5, button6, button1, button2, button3, button0;
  private JButton buttonDev, buttonMulty, buttonSub, buttonPlus, buttonDot;
  private JButton buttonClear, buttonRemove, buttonEq;
  private JPanel panel;
  private JButton[] numberButtons = new JButton[]{button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,};
  private JButton[] opperatorsButtons = new JButton[]{buttonDev, buttonMulty, buttonPlus, buttonSub, buttonDot};
  private JButton[] clearOrRemoveButtons = new JButton[]{buttonRemove, buttonClear, buttonEq};
  private String display = "";

  public NewCalculator() {
    this.setSize(500, 200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(panel);
    this.setVisible(true);
    ActionListener numbersListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (JButton button : numberButtons) {
          if (e.getSource() == button) {
            display += button.getText();
            textField1.setText(display);
          }
        }
      }
    };
    for (JButton button : numberButtons) {
      button.addActionListener(numbersListener);
    }
    ActionListener opperatorListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        for (JButton opperator : opperatorsButtons) {
          if (opperator == e.getSource()) {
            if (display.endsWith("+") || display.endsWith("-") || display.endsWith("*") || display.endsWith("/") || display.equals(".")) {
              return;
            }
            if (display.length() == 0) {
              return;
            }
            display += opperator.getText();
            textField1.setText(display);
          }
        }
      }
    };
    for (JButton opperator : opperatorsButtons) {
      opperator.addActionListener(opperatorListener);
    }
    ActionListener removeClearEqListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonClear) {
          display = "";
          textField1.setText(display);
        } else if (e.getSource() == buttonRemove) {
          String[] allDisplay = display.split("");
          allDisplay[allDisplay.length - 1] = "";
          display = "";
          for (String x : allDisplay) {
            display += x;
          }
          textField1.setText(display);
        } else if (e.getSource() == buttonEq) {
          ScriptEngineManager scm = new ScriptEngineManager();
          ScriptEngine jsEngine = scm.getEngineByName("JavaScript");
          if (display.endsWith("+") || display.endsWith("-") || display.endsWith(".")) {
            textField1.setText(display += 0);
          }
          if (display.endsWith("*") || display.endsWith("/")) {
            textField1.setText(display += 1);
          }
          try {
            textField2.setText(jsEngine.eval(display).toString());
          } catch (ScriptException e1) {
            e1.printStackTrace();
          }
        }
      }
    };
    for (JButton opperator : clearOrRemoveButtons) {
      opperator.addActionListener(removeClearEqListener);
    }
  }
}
