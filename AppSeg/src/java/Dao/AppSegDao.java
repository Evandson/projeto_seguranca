/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;

/**
 *
 * @author Evandson
 */
public interface AppSegDao {
    public boolean userLogin(Usuario usuario);
    public Usuario getId(String email, String senha);
    public void userRegister(Usuario usuario);
    public boolean verifyUser(Usuario usuario);
}
