package com.clouway.testingwithmocks.sms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:43 Oct 14-10-16
 */
public class SMSValidator implements Validator {

  private List<ValidatorRules> rules;

  public SMSValidator(List<ValidatorRules> rules) {
    this.rules = rules;
  }

  @Override
  public List<String> validate(SMS sms) {
    List list = new ArrayList();

    for (ValidatorRules rule : rules) {
      String error = rule.theRule(sms);
      if (error.length() != 0 || error.length()>120) {
        list.add(error);
      }
    }
    return list;
  }
}
