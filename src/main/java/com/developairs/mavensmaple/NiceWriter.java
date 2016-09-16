package com.developairs.mavensmaple;

import org.springframework.stereotype.Service;

/**
 * Created by alireza on 8/5/16.
 */
@Service
public class NiceWriter implements IWriter {
    public void writer(String s) {
        System.out.println("The string is " + s);
    }
}