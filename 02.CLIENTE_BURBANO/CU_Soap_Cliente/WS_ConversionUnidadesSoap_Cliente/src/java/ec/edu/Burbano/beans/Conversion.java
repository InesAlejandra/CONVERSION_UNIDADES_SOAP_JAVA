/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.Burbano.beans;

import ec.edu.Burbano.model.WSConversionUnidades;
import ec.edu.Burbano.model.WSConversionUnidades_Service;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import javax.annotation.PostConstruct;

import javax.inject.Named;

import javax.xml.ws.WebServiceRef;

/**
 *
 * @author IABN
 */
@Named(value = "conversion")
@RequestScoped
public class Conversion implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WebServiceConversionUnidadesSoap_Java_Server_Burbano/WS_ConversionUnidades.wsdl")
    private WSConversionUnidades_Service service;
   

    private double dato1;
    private double respuesta;

    public Conversion() {
    }

    @PostConstruct
    public void init() {
        dato1 = 0;
        respuesta = 0;
        service= new WSConversionUnidades_Service();
         WSConversionUnidades port = service.getWSConversionUnidadesPort();
    }

    public void centimetrosPulgada() {
        this.respuesta = centimetroApulgadas(this.dato1);

    }

    public void pulgadaCentimetro() {
        this.respuesta = pulgadasAcentrimetros(this.dato1);
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(double respuesta) {
        this.respuesta = respuesta;
    }

    public double pulgadasAcentrimetros(double pulgadas) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ec.edu.Burbano.model.WSConversionUnidades port = service.getWSConversionUnidadesPort();
        return port.pulgadasAcentrimetros(pulgadas);
    }

    public double centimetroApulgadas(double centimetros) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ec.edu.Burbano.model.WSConversionUnidades port = service.getWSConversionUnidadesPort();
        return port.centimetroApulgadas(centimetros);
    }

}
