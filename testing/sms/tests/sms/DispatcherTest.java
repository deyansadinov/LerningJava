package com.clouway.testingwithmocks.sms;

import com.google.common.collect.Lists;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class DispatcherTest {
  @Rule
  public JUnitRuleMockery mockery = new JUnitRuleMockery();



  @Test
  public void testSendWithValidSMS() throws Exception {
    final Gateway gateway=mockery.mock(Gateway.class);
    final Validator validator=mockery.mock(Validator.class);

    Dispatcher dispatcher=new Dispatcher(gateway,validator);
    final SMS sms = new SMS("0998878781","title","Sample text.");

    mockery.checking(new Expectations(){{
      oneOf(validator).validate(sms);
      oneOf(gateway).send(sms);
    }});

    dispatcher.send(sms);

  }
  @Test
  public void testSendWithNOtValidSMS() throws Exception {
    final Gateway gateway=mockery.mock(Gateway.class);
    final Validator validator=mockery.mock(Validator.class);

    Dispatcher dispatcher=new Dispatcher(gateway,validator);
    final SMS sms = new SMS("0998878781","title","Sample text.");

    mockery.checking(new Expectations(){{
      oneOf(validator).validate(sms);will(returnValue(Lists.newArrayList(1)));
      never(gateway).send(sms);
    }});

    dispatcher.send(sms);
  }
}