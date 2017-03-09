package com.github.aelmod.oop.polymorphism.source;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadStrategyByUrl implements DownloadStrategy {
    @Override
    public String getData(String path) {
        String data = null;
        try (InputStream in = new URL(path).openStream()) {
            data = IOUtils.toString(in, charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
