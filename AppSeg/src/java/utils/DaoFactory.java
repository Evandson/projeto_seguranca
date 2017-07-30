/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import Dao.AppSegDao;
import Dao.JdbcAppSegDao;

/**
 *
 * @author Evandson
 */
public class DaoFactory {
    public static AppSegDao createAppSegDao(){
        return new JdbcAppSegDao();
    }
    
}
