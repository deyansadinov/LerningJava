package com.clouway.inputoutput.transferobject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransfeersObject {

  public void transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {
    BufferedInputStream buf = new BufferedInputStream(in);
//    System.out.println(buf.);
    byte[] byteStep = new byte[100];
    int step=numberOfBytes;
    if(byteStep.length<step){
      step=byteStep.length;
    }


    while (buf.read(byteStep,0, step) != -1) {
      out.write(byteStep,offset,numberOfBytes);

    }
  }

}
