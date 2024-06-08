package com.bibliotheque_java_poo.utils;

import java.io.File;
public class bibliothequeMethods {
    public static String returnParentPackagePath(String fromThisPathPosition) {

        File currentPackagePath = new File(fromThisPathPosition);
        return currentPackagePath.getAbsolutePath();
    }
}
