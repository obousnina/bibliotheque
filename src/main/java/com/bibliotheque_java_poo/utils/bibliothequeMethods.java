package com.bibliotheque_java_poo.utils;

import java.io.File;
public class bibliothequeMethods {
    public static String returnParentPackagePath(String fromThisPathPosition) {

       File currentPackagePath = new File(fromThisPathPosition);
       String packagePathString = currentPackagePath.getPath();
       String parentPackageAbsolutPath = packagePathString.substring(0, packagePathString.length() - fromThisPathPosition.length());
       return parentPackageAbsolutPath;


    }
}
