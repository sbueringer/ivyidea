package org.clarent.ivyidea.util;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;

public class ModuleDirUtils {

    public static final String $_MODULE_DIR_$ = "$MODULE_DIR$";

    public static String convertModuleDirPath(Module module, String propertiesFile) {
        if(propertiesFile.startsWith($_MODULE_DIR_$)){
            VirtualFile modulePathFile = ModuleRootManager.getInstance(module).getContentRoots()[0];
            String propertiesFileWithoutModuleDir = propertiesFile.replace($_MODULE_DIR_$,"");
            while (propertiesFileWithoutModuleDir.startsWith("/..") || propertiesFileWithoutModuleDir.startsWith("\\..")){
                if(propertiesFileWithoutModuleDir.startsWith("/..")){
                    propertiesFileWithoutModuleDir = propertiesFileWithoutModuleDir.replace("/..","");
                }
                else {
                    propertiesFileWithoutModuleDir = propertiesFileWithoutModuleDir.replace("\\..","");
                }
                modulePathFile = modulePathFile.getParent();
            }
            propertiesFile = modulePathFile.getPath() + propertiesFileWithoutModuleDir;

        }
        return propertiesFile;
    }
}
