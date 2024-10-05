#include <jni.h>
#include <stdio.h>
#include "com_murilo_java_NativeCodeSample.h"

// Implementation of the native method
JNIEXPORT void JNICALL Java_com_murilo_java_NativeCodeSample_myNativeMethod(JNIEnv *env, jobject obj) {
    printf("This message is coming from your C method! Well done! :)");
}