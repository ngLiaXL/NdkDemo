package com.ldroid.kwei.ndkdemo;


/**
 * 1、java类中新建native方法
 * 2、Build>MakeProject在app/build/intermediates/classes/debug/yourPackageName/下生成class文件
 * 3、打开Terminal，cd 到app/build/intermediates/classes/debug/这个路径下输入
 * javah- jni com.ldroid.kwei.ndkdemo.Ndk 在此目录会生成com_ldroid_kwei_ndkdemo_Ndk.h头文件
 * 4、app/main 新建jni文件夹，讲生成的头文件剪切到jni文件夹
 * 5、在jni路径新建对应的.c文件，重写方法
 * 6、app/build.gradle写入ndk信息
 * 7、Build>MakeProject在app/build/intermediates/ndk/lib下生成so文件
 * 8、调用
 */
public class Ndk {

    static {
        System.loadLibrary("jniTest");
    }

    public native String getString();


}
