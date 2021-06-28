package com.company.sevenXXXinsevenweeks.concurrencymodels.c2threadslocks.httpDownload;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;

/**
 * @description: TODO
 * @author: 刘子豪 2021/6/18 15:04
 * @email: liuzihao29@jd.com
 */

public class Downloader extends Thread {
    private InputStream in;
    private OutputStream out;
    private ArrayList<ProgressListener> listeners;

    public Downloader(URL url, String outputFilename) throws IOException {
        in = url.openConnection().getInputStream();
        out = new FileOutputStream(outputFilename);
        listeners = new ArrayList<>();
    }

    public synchronized void addListener(ProgressListener listener) {
        listeners.add(listener);
    }

    public synchronized void removeListener(ProgressListener listener) {
        listeners.remove(listener);
    }

    public synchronized void updateProgress(int n) {
        for (ProgressListener listener : listeners) {
            listener.onProgress(n);
        }
    }

    @Override
    public void run() {
        int n = 0, total = 0;
        byte[] buffer = new byte[1024];

        try {
            while((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
                total += n;
                updateProgress(total);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

