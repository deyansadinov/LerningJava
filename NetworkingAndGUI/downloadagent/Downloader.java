package com.clouway.networkingandgui.downloadagent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ author Ivan Genchev <ivan.genchev1989@gmail.com> 14:08 Nov 14-11-24
 */
public class Downloader extends JFrame {


  private JLabel url, downloadTo;
  private JTextField forUrl, forDownload;
  private JButton download;
  private JProgressBar jProgressBar;
  private String urlName, newFileNAme, fileExtenction;


  public Downloader() {

    this.setSize(700, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setTitle("Downloader");

    JPanel panel = new JPanel();
    url = new JLabel("Enter The URL");
    panel.add(url);
    forUrl = new JTextField("", 50);
    forUrl.setText("http://195.149.248.189:8080/2012-06-03/e85b81b74ab015974778d922fb0e3eee_512x384.jpg");
    panel.add(forUrl);

    JPanel panel2 = new JPanel();
    downloadTo = new JLabel("Enter The name for the new file");
    panel2.add(downloadTo);
    forDownload = new JTextField("", 10);
    panel2.add(forDownload);

    jProgressBar = new JProgressBar();
    jProgressBar.setBorderPainted(true);
    jProgressBar.setStringPainted(true);

    JPanel panel3 = new JPanel();
    download = new JButton("DOWNLOAD NOW");
    DownloadClick downloadClick = new DownloadClick();
    download.addActionListener(downloadClick);

    panel3.add(jProgressBar);
    panel3.add(download);


    this.add(panel);
    panel.add(panel2);
    panel2.add(panel3);
    this.setVisible(true);

  }


  private class DownloadClick implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == download) {

        urlName = forUrl.getText();
        newFileNAme = forDownload.getText();
        fileExtenction = getExtention();

        URL url = null;
        try {
          url = new URL(forUrl.getText());
          URLConnection connection = url.openConnection();
          InputStream in = connection.getInputStream();
          FileOutputStream outputStream = new FileOutputStream(newFileNAme + "." + fileExtenction);
          jProgressBar.setMaximum(connection.getContentLength());

          TransfeersObject transfeersObject = new TransfeersObject();

          new DownloadingThread(transfeersObject, in, outputStream).start();
          new ProgressThread(transfeersObject,jProgressBar).start();
        } catch (MalformedURLException e1) {
          e1.printStackTrace();
        } catch (IOException e1) {
          e1.printStackTrace();
        }
      }
    }
 }
  private String getExtention() {
    String[] ext = urlName.split("[.]");
    return ext[ext.length - 1];
  }
}
