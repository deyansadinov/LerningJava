package com.clouway.inputoutput.transferobject;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TransfeersObject {

  private byte[] byteStep = new byte[20];
  private int counter = 0;
  private int bytesNeeded = 0;
  private int off = 0;

  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {
    BufferedInputStream buf = new BufferedInputStream(in);

    int availableBytes = buf.available();
    int lenght = byteStep.length;


    buf.skip(offset);

    while (buf.read(byteStep, 0, lenght) != -1) {
      /**
       * if numberOfBytes ==-1 transfer all of the content.
       */
      if (numberOfBytes == -1) {
        transferAll(buf, availableBytes, lenght, out);
        continue;
      }
      transferNumberOfBytes(numberOfBytes, off, lenght, out, availableBytes);

    }
    return counter;
  }

  /**
   * Transferes All the bytes.
   *
   * @param bff-BufferedInputStream
   * @param availableBytes-from     the input
   * @param lenght=byte[].lenght
   * @param out-OutputStream
   * @throws IOException
   */
  private void transferAll(BufferedInputStream bff, int availableBytes, int lenght, OutputStream out) throws IOException {
    lenght = availableBytes;
    out.write(byteStep, 0, byteStep.length);
    counter++;

    if (availableBytes > lenght) {
      availableBytes = availableBytes - byteStep.length;
      transferAll(bff, availableBytes, lenght, out);
    }

  }

  /**
   * @param numberOfBytes-bytes  to be transfer
   * @param lenght-byte[].lenght
   * @param out-OutputStream
   * @throws IOException
   * @return-the number of steps needed to transfer the object.
   */
  private int transferNumberOfBytes(int numberOfBytes, int off, int lenght, OutputStream out, int availableBytes) throws IOException {
    /**
     * The number of bytes cant be larger then the avalible bytes.
     */
    if (numberOfBytes > availableBytes) {
      numberOfBytes = availableBytes;
    }

    if (bytesNeeded < numberOfBytes) {
      out.write(byteStep, 0, lenght);
      counter++;
      bytesNeeded += lenght;
      if (bytesNeeded + lenght > numberOfBytes) {
        lenght = lenght - (bytesNeeded + lenght - numberOfBytes);
      }
      /**
       * All the bytes that are needed are transfered.
       */
      if (numberOfBytes == bytesNeeded) {
        return counter;
      }

    }
    return counter;
  }
}
