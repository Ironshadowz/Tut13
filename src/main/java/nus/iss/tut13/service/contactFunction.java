package nus.iss.tut13.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import nus.iss.tut13.model.contactInfo;

@Service
public class contactFunction 
{
    
    public void save(contactInfo conInfo, Model model, String dirdata) throws IOException
    {
        String filename = conInfo.getName();
        //File object provides a way to interact with files on a computer's file system
        File dirPath = new File(dirdata+"/"+filename+".txt");
        FileWriter fw = new FileWriter(dirPath);
        //PrintWriter can write formatted data and convert different 
        //data types to their String representation
        //It needs an existing writer object to wrap.
        PrintWriter pw = new PrintWriter(fw);
        try
        {
            pw.println(conInfo.getName());
            pw.println(conInfo.getEmail());
            pw.println(conInfo.getJob());
            pw.println(conInfo.getPhoneNumber());
            model.addAttribute("contactDetail", new contactInfo(conInfo.getName(), conInfo.getJob(), conInfo.getEmail(), conInfo.getPhoneNumber(), conInfo.getDateOfBirth()));
        } catch(Exception e)
        {
            e.getStackTrace();
        } finally
        {
            pw.close();
        }

    }

}
