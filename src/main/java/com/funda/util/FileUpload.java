package com.funda.util;

/**
 * Created by wonjun-pc on 2016-06-24.
 */

import java.io.FileOutputStream;
import org.springframework.web.multipart.MultipartFile;

public class FileUpload {

    private FileOutputStream fos;

    public void writeFile(MultipartFile file, String path, String fileName){

        try{

            byte fileData[] = file.getBytes();

            fos = new FileOutputStream(path + "/" + fileName);
            //System.out.println(path+"/"+fileName);
            fos.write(fileData);

        }catch(Exception e){

            e.printStackTrace();

        }finally{

            if(fos != null){

                try{
                    fos.close();
                }catch(Exception e){}

            }
        }// try end;

    }// wirteFile() end;
}