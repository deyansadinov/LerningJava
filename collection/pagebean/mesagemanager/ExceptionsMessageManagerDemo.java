package com.clouway.collection.pagebean.mesagemanager;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by clouway on 14-9-25.
 */
public class ExceptionsMessageManagerDemo {
  public static void main(String[] args) {

    Hashtable<String,String> exceptions = new Hashtable<String,String>();

    ExceptionsMessageManager emm = new ExceptionsMessageManager(exceptions);

    emm.registerErrorMessage("Wrong card number","This is not the card number we expected.");
   // emm.registerErrorMessage("Wrong card number","This is not the card number we expected.");

    emm.getErrorMessages();

  }
}
