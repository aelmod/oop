package com.github.aelmod.oop.polymorphism.source;

public interface DownloadStrategy {
    String charset = "UTF-8";
    String getData(String path);
}
