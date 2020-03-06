/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_diegovarelaa;

import java.util.Date;

/**
 *
 * @author diego
 */
public class User {
    private String nombre;
    private String nickname;
    private String password;
    private String fechanac;

    public User(String nombre, String nickname, String password, String fechanac) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.password = password;
        this.fechanac = fechanac;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    @Override
    public String toString() {
        return   nombre ;
    }
    
}
