package com.murilo.java;

public class NativeCodeSample {

  // This scans your java.library.path and searches for .dll(windows)/.so(linux)/.dylib(macOS) files
  // trying to match the one provided below.
  // you don't need the extension when setting it here, the filename will be
  //NativeCodeSample.dll

  static {
    System.loadLibrary("NativeCodeSample"); // No need for .dll extension
  }

  // Declare the native method, this will be linked to the C implementation because
  // we followed all the requirements that JNI imposes so it can be able to link them.
  public native void myNativeMethod();


  public static void main(String[] args) {
    NativeCodeSample sample = new NativeCodeSample();
    sample.myNativeMethod();  // Call the native method
  }
}