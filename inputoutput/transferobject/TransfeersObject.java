package com.clouway.inputoutput.transferobject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransfeersObject {

  public void transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {
    BufferedInputStream buf = new BufferedInputStream(in);

    byte[] byteStep = new byte[50];

    //int step=10;

    while (buf.read(byteStep,0,byteStep.length) != -1) {
      if(numberOfBytes==-1){
        out.write(byteStep,offset,byteStep.length);
      }else {
        out.write(byteStep,offset,numberOfBytes);
        return;
      }


    }
  }

}
