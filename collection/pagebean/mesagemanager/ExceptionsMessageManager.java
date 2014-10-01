package com.clouway.collection.pagebean.mesagemanager;

//Набора от съобщения се пази в Хаштаблица (Hashtable) "exceptions", в която и ключовете и стойностите са от тип String.
//        Съобщения да може да се попълва с помощта на:
//        registerErrorMessage(String messageCode, String message)
//        Формалният параметър mess е съобщение, което трябва да се добави към комбинцията message.
//        Методът да проверява дали в набора съобщения exceptions има съобщение с такава стойност.
//        Ако не - да хвърля грешка по избор на програмиста. Ако да - съобщението се включва в комбинацията message.


import java.util.Hashtable;


public class ExceptionsMessageManager {

  private final Hashtable<String,String> exceptions;

  public ExceptionsMessageManager(Hashtable exceptions) {
    this.exceptions = exceptions;
    exceptions.put("1","Wrong PIN");
    exceptions.put("2","Invalid number of debit card");
    exceptions.put("3","Invalid postcode");
  }
  /**
   * @param messageCode-key
   * @param message
   */
  public void registerErrorMessage(String messageCode, String message) {
    raiseError(messageCode);
    if (exceptions.contains(message)) {
      throw new MessageExistsException();
    }
    exceptions.put(messageCode, message);
  }
  /**
   *
   * @param messageCode
   * @return
   */
  public String raiseError(String messageCode){
    if(exceptions.containsKey(messageCode)){
      throw new KeyIsNotFreeException();
    }
    return messageCode;
  }
  public void getErrorMessages() {
    for (Object key : exceptions.keySet()) {
      System.out.println(key + ":" + exceptions.get(key));
    }
  }
}
