#include <com_ldroid_kwei_ndkdemo_Ndk.h>

JNIEXPORT jstring JNICALL Java_com_ldroid_kwei_ndkdemo_Ndk_getString
    (JNIEnv * env, jobject jject){
      return (*env)->NewStringUTF(env,"I am from Jni!");

    }