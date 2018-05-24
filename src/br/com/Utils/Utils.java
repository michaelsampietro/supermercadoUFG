package br.com.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String formataData (Date data ) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        return formato.format(data);
    }
}
