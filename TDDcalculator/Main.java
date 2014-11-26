package com.clouway.networkingandgui.calculator;

import java.util.HashMap;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:03 Nov 14-11-19
 */
public class Main {
  public static void main(String[] args) {
    NewCalculatorUI newCalculatorUI = new NewCalculatorUI();
    Calculator calculator = new Calculator(newCalculatorUI, new HashMap<String, String>() {{
      put("+", "+");
      put("/", "/");
    }});
    newCalculatorUI.init(calculator);
  }


}
