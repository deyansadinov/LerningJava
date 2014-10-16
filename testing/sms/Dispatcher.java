package com.clouway.testingwithmocks.sms;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:54 Oct 14-10-16
 */
public class Dispatcher {
  private Gateway gateway;
  private Validator validator;

  public Dispatcher(Gateway gateway, Validator validator) {

    this.gateway = gateway;
    this.validator = validator;
  }

  public void send(SMS sms) {

    if(validator.validate(sms).size()==0){
      gateway.send(sms);
    }

  }
}
