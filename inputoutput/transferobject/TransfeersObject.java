package com.clouway.inputoutput.transferobject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransfeersObject {

  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {
    int byteRead;
    int counter = 0;
    in.skip(offset);
    while ((byteRead = in.read()) != -1) {
      if (numberOfBytes > counter) {
        out.write(byteRead);
        counter++;
      }
      if (numberOfBytes == -1) {
        out.write(byteRead);
        counter++;
      }
    }

    return counter;
  }

}
