/**
 * Ws_contratos_epsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epssgt.www.ws_contratos_eps;

public interface Ws_contratos_epsSoap extends java.rmi.Remote {
    public com.epssgt.www.ws_contratos_eps.AM_ContratosResult AM_Contratos(int p_empresa, int p_entidad, int p_agencia, org.apache.axis.types.UnsignedShort p_operacion, java.lang.String p_xml_contrato) throws java.rmi.RemoteException;
    public com.epssgt.www.ws_contratos_eps.Cambiar_EstadoResult cambiar_Estado(int p_empresa, int p_entidad, int p_agencia, java.lang.String p_contrato, int p_nuevo_estado) throws java.rmi.RemoteException;
    public com.epssgt.www.ws_contratos_eps.Consultar_EstadoResult consultar_Estado(int p_empresa, int p_entidad, int p_agencia, java.lang.String p_contrato) throws java.rmi.RemoteException;
}
