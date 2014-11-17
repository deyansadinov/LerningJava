package com.clouway.networkingandgui.clculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 12:54 Nov 14-11-17
 */
public class Calculator extends JFrame {
  JButton button1, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero,
          buttonPlus, buttonNegative, buttonMultiply, buttonDev, buttonClear, buttonEq, buttonDot;
  JLabel label4, label5;

  private String display = "";


  public Calculator() throws HeadlessException {
    this.setSize(250, 280);
    this.setLocationRelativeTo(null);
    this.setTitle("My Third Frame");
    JPanel panel = new JPanel();
    this.setResizable(false);
    Border panelBorder = BorderFactory.createTitledBorder("Calculator");
    panel.setBorder(panelBorder);
//Button clculate
    button1 = new JButton("Calculate");

///normal calculator--------------------------------------
    JPanel nPanel = new JPanel();
    Border nborder = BorderFactory.createTitledBorder("-");
    nPanel.setBorder(nborder);
    label4 = new JLabel("Display:");
    label5 = new JLabel("");
    nPanel.add(label4);
    nPanel.add(label5);

    JPanel bPanelTwo = new JPanel();

    buttonSeven = new JButton("7");
    buttonSeven.setName("7");
    ButtonSevenClick buttonSevenClick = new ButtonSevenClick();
    buttonSeven.addActionListener(buttonSevenClick);
    buttonEight = new JButton("8");
    buttonEight.setName("8");
    ButtonEightClick buttonEightClick = new ButtonEightClick();
    buttonEight.addActionListener(buttonEightClick);
    buttonNine = new JButton("9");
    buttonNine.setName("9");
    ButtonNineClick buttonNineClick = new ButtonNineClick();
    buttonNine.addActionListener(buttonNineClick);
    buttonPlus = new JButton("+");
    buttonPlus.setName("+");
    ButtonPlusClick buttonPlusClick = new ButtonPlusClick();
    buttonPlus.addActionListener(buttonPlusClick);

    bPanelTwo.add(buttonSeven);
    bPanelTwo.add(buttonEight);
    bPanelTwo.add(buttonNine);
    bPanelTwo.add(buttonPlus);


    JPanel bPanelThree = new JPanel();

    buttonSix = new JButton("6");
    buttonSix.setName("6");
    ButtonSixClicked buttonSixClicked = new ButtonSixClicked();
    buttonSix.addActionListener(buttonSixClicked);
    buttonFive = new JButton("5");
    buttonFive.setName("5");
    ButtonFiveClicked buttonFiveClicked = new ButtonFiveClicked();
    buttonFive.addActionListener(buttonFiveClicked);
    buttonFour = new JButton("4");
    buttonFour.setName("4");
    ButtonFourClicked buttonFourClicked = new ButtonFourClicked();
    buttonFour.addActionListener(buttonFourClicked);
    buttonNegative = new JButton("-");
    buttonNegative.setName("-");
    ButtonNegative buttonNeg = new ButtonNegative();
    buttonNegative.addActionListener(buttonNeg);
    bPanelThree.add(buttonFour);
    bPanelThree.add(buttonFive);
    bPanelThree.add(buttonSix);
    bPanelThree.add(buttonNegative);


    JPanel bPanelFour = new JPanel();

    buttonOne = new JButton("1");
    buttonOne.setName("1");
    ButtonOneClick buttonOneClick = new ButtonOneClick();
    buttonOne.addActionListener(buttonOneClick);
    buttonTwo = new JButton("2");
    buttonTwo.setName("2");
    ButtonTwoClick buttonTwoClick = new ButtonTwoClick();
    buttonTwo.addActionListener(buttonTwoClick);
    buttonThree = new JButton("3");
    buttonThree.setName("3");
    ButtonThreeClick buttonThreeClick = new ButtonThreeClick();
    buttonThree.addActionListener(buttonThreeClick);
    buttonDev = new JButton("/");
    buttonDev.setName("/");
    BUttonDevClick bUttonDevClick = new BUttonDevClick();
    buttonDev.addActionListener(bUttonDevClick);
    bPanelFour.add(buttonOne);
    bPanelFour.add(buttonTwo);
    bPanelFour.add(buttonThree);
    bPanelFour.add(buttonDev);


    JPanel bPanelFive = new JPanel();

    buttonZero = new JButton("0");
    buttonZero.setName("0");
    ButtonZeroClick buttonZeroClick = new ButtonZeroClick();
    buttonZero.addActionListener(buttonZeroClick);
    buttonDot = new JButton(".");
    buttonDot.setName(".");
    ButtonDotClick buttonDotClick = new ButtonDotClick();
    buttonDot.addActionListener(buttonDotClick);
    buttonMultiply = new JButton("*");
    buttonMultiply.setName("*");
    ButtonMultiClick buttonMultiClick = new ButtonMultiClick();
    buttonMultiply.addActionListener(buttonMultiClick);
    buttonClear = new JButton("C");
    ButtonClearClicked buttonClearClicked = new ButtonClearClicked();
    buttonClear.addActionListener(buttonClearClicked);

    bPanelFive.add(buttonZero);
    bPanelFive.add(buttonDot);
    bPanelFive.add(buttonMultiply);
    bPanelFive.add(buttonClear);


    JPanel bPanelSix = new JPanel();

    buttonEq = new JButton("=");
    ButtonEqClicked buttonEqClicked = new ButtonEqClicked();
    buttonEq.addActionListener(buttonEqClicked);
    bPanelSix.add(buttonEq);

    panel.add(nPanel);
    panel.add(bPanelTwo);
    panel.add(bPanelThree);
    panel.add(bPanelFour);
    panel.add(bPanelFive);
    panel.add(bPanelSix);

    this.add(panel);

    this.setVisible(true);
  }

  private class ButtonClearClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonClear) {
        label5.setText("");
        display = "";
      }
    }
  }

  private class ButtonSevenClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonSeven) {
        display += buttonSeven.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonEightClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonEight) {
        display += buttonEight.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonNineClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonNine) {
        display += buttonNine.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonPlusClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonPlus) {
        if (display.equals("")) {
          return;
        }
        if (display.endsWith("-") || display.endsWith("/") || display.endsWith("*")) {
          return;
        }
        if (!display.endsWith("+")) {
          display += buttonPlus.getName();

        }
        label5.setText(display);
      }
    }
  }

  private class ButtonSixClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonSix) {
        display += buttonSix.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonFiveClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonFive) {
        display += buttonFive.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonFourClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonFour) {
        display += buttonFour.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonNegative implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonNegative) {
        if (display.equals("")) {
          return;
        }
        if (display.endsWith("+") || display.endsWith("*") || display.endsWith("/")) {
          return;
        }
        if (!display.endsWith("-")) {
          display += buttonNegative.getName();

        }
        label5.setText(display);
      }
    }
  }

  private class ButtonOneClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonOne) {
        display += buttonOne.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonTwoClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonTwo) {
        display += buttonTwo.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonThreeClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonThree) {
        display += buttonThree.getName();
        label5.setText(display);
      }
    }
  }

  private class BUttonDevClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonDev) {
        if (display.equals("")) {
          return;
        }
        if (display.endsWith("+") || display.endsWith("*") || display.endsWith("-")) {
          return;
        }
        if (!display.endsWith("/")) {
          display += buttonDev.getName();

        }
        label5.setText(display);
      }
    }
  }

  private class ButtonZeroClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonZero) {
        display += buttonZero.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonDotClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonDot) {
        display += buttonDot.getName();
        label5.setText(display);
      }
    }
  }

  private class ButtonMultiClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonMultiply) {
        if (display.equals("")) {
          return;
        }
        if (display.endsWith("+") || display.endsWith("/") || display.endsWith("-")) {
          return;
        }
        if (!display.endsWith("*")) {
          display += buttonMultiply.getName();

        }
        label5.setText(display);
      }
    }
  }

  private class ButtonEqClicked implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == buttonEq) {
        if (display.endsWith("+") || display.endsWith("-") || display.endsWith("-") || display.endsWith("-")) {
          display += "0";
        }

        label5.setText(display);
        ScriptEngineManager scm = new ScriptEngineManager();
        ScriptEngine jsEngine = scm.getEngineByName("JavaScript");
        try {
          label5.setText(jsEngine.eval(display).toString());
        } catch (ScriptException e1) {
          e1.printStackTrace();
        }

      }
    }
  }
}
