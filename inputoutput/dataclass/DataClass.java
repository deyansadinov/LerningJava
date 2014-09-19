package com.clouway.inputoutput.dataclass;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class DataClass {
  /**
   * Saves the paramether o in the output stream
   *
   * @param out
   * @param o
   */
  public void saveObject(OutputStream out, Object o) throws IOException {
    ObjectOutputStream objout = new ObjectOutputStream(out);
    objout.writeObject(o);
    objout.close();
    out.close();
  }

  /**
   * Reads  the input stream from a class and returns in as a result.
   *
   * @param in
   * @return
   */
  public Object getObject(InputStream in) throws IOException, ClassNotFoundException {

    ObjectInputStream objin = new ObjectInputStream(in);
    Object input =objin.readObject();
    objin.close();
    in.close();

    return input;
  }
}
