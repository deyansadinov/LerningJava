package com.clouway.testingwithmocks.sms.rules;

import com.clouway.testingwithmocks.sms.*;
import com.clouway.testingwithmocks.sms.Error;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:11 Oct 14-10-16
 */
public class ReceiverRuleTenNumbers implements ValidatorRules {

  @Override
  public String theRule(SMS sms) {
    if(sms.getReceiver().length()!=10){
      return "Number must be 10 numbers long.";
    }
    return "";
  }


}
