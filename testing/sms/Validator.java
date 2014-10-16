package com.clouway.testingwithmocks.sms;

import java.util.List;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 15:01 Oct 14-10-16
 */
public interface Validator{
  List<String> validate (SMS sms);
}
