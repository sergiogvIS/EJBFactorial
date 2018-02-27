/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "WSFactorial")
@Stateless()
public class WSFactorial {

    public long devuelveFactorial(int a){
        long b= 1;
        while(a!=0){
            b=b*a;
            a--;
        }
        return b;
    }
}
