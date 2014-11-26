package com.clouway.networkingandgui.calculator;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 10:32 Nov 14-11-26
 */
public interface CalculatorListener {

  void onNumberPressed(String number);

  void onOperationPressed(String operation);

  void onEvaluate();
}
