package com.clouway.testingwithmocks.sms.rules;

import com.clouway.testingwithmocks.sms.SMS;
import com.clouway.testingwithmocks.sms.ValidatorRules;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 16:05 Oct 14-10-16
 */
public class EmptyTitleRule implements ValidatorRules{
  @Override
  public String theRule(SMS sms) {
    if(sms.getTitle()=="" || sms.getTitle()==null){
      return "Wrong Title !";
    }
    return "";
  }
}
