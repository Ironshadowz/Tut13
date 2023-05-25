package nus.iss.tut13.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class utility 
{
    public static void createDir(String dir)
    {
        File dirFile = new File(dir);
        if(dirFile.exists())
        {

        } else
        {
            dirFile.mkdirs();
        }

    }

}
