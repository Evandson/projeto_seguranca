/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Evandson
 */
public class Erro implements Serializable {
    
    private final List<String> erros;
   
      public Erro() {
          erros = new ArrayList<>();
      }
   
      public Erro(String mensagem) {
          erros = new ArrayList<>();
          erros.add(mensagem);
      }
   
      public void add(String mensagem) {
          erros.add(mensagem);
      }
      
      public boolean isExisteErros() {
          return !erros.isEmpty();
      }
      
      public List<String> getErros() {
          return erros;
      }
      
      public void limpar(){
          erros.clear();
      }
  }
