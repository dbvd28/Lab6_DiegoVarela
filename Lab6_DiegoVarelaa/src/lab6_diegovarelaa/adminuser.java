/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_diegovarelaa;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class adminuser {
    private ArrayList<User>listauser = new ArrayList();
    private File archivo = null;

    public adminuser(String path) {
     archivo = new File(path);
    }

    public ArrayList<User> getListauser() {
        return listauser;
    }

    public void setListauser(ArrayList<User> listauser) {
        this.listauser = listauser;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminuser{" + "listauser=" + listauser + '}';
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (User t : listauser) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getNickname()+ ";");
                bw.write(t.getPassword()+ ";");
                bw.write(t.getFechanac()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listauser = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listauser.add(new User(sc.next(),
                            sc.next(),
                            sc.next(),sc.next()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
