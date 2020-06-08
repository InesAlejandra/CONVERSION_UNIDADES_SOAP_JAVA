/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.Burbano.controller;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author IABN
 */
@WebService(serviceName = "WS_ConversionUnidades")
public class WS_ConversionUnidades {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pulgadasAcentrimetros")
    public double pulgadasAcentrimetros(@WebParam(name = "pulgadas") double pulgadas) {
        //TODO write your implementation code here:
        return pulgadas * 2.54;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "centimetroApulgadas")
    public double centimetroApulgadas(@WebParam(name = "centimetros") double centimetros) {
        //TODO write your implementation code here:
        return centimetros / 2.54;
    }
}
