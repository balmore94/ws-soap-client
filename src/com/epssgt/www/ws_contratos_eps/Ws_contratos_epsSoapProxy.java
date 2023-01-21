package com.epssgt.www.ws_contratos_eps;

public class Ws_contratos_epsSoapProxy implements com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap {
  private String _endpoint = null;
  private com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap ws_contratos_epsSoap = null;
  
  public Ws_contratos_epsSoapProxy() {
    _initWs_contratos_epsSoapProxy();
  }
  
  public Ws_contratos_epsSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWs_contratos_epsSoapProxy();
  }
  
  private void _initWs_contratos_epsSoapProxy() {
    try {
      ws_contratos_epsSoap = (new com.epssgt.www.ws_contratos_eps.Ws_contratos_epsLocator()).getws_contratos_epsSoap();
      if (ws_contratos_epsSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ws_contratos_epsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ws_contratos_epsSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ws_contratos_epsSoap != null)
      ((javax.xml.rpc.Stub)ws_contratos_epsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap getWs_contratos_epsSoap() {
    if (ws_contratos_epsSoap == null)
      _initWs_contratos_epsSoapProxy();
    return ws_contratos_epsSoap;
  }
  
  public com.epssgt.www.ws_contratos_eps.AM_ContratosResult AM_Contratos(int p_empresa, int p_entidad, int p_agencia, org.apache.axis.types.UnsignedShort p_operacion, java.lang.String p_xml_contrato) throws java.rmi.RemoteException{
    if (ws_contratos_epsSoap == null)
      _initWs_contratos_epsSoapProxy();
    return ws_contratos_epsSoap.AM_Contratos(p_empresa, p_entidad, p_agencia, p_operacion, p_xml_contrato);
  }
  
  public com.epssgt.www.ws_contratos_eps.Cambiar_EstadoResult cambiar_Estado(int p_empresa, int p_entidad, int p_agencia, java.lang.String p_contrato, int p_nuevo_estado) throws java.rmi.RemoteException{
    if (ws_contratos_epsSoap == null)
      _initWs_contratos_epsSoapProxy();
    return ws_contratos_epsSoap.cambiar_Estado(p_empresa, p_entidad, p_agencia, p_contrato, p_nuevo_estado);
  }
  
  public com.epssgt.www.ws_contratos_eps.Consultar_EstadoResult consultar_Estado(int p_empresa, int p_entidad, int p_agencia, java.lang.String p_contrato) throws java.rmi.RemoteException{
    if (ws_contratos_epsSoap == null)
      _initWs_contratos_epsSoapProxy();
    return ws_contratos_epsSoap.consultar_Estado(p_empresa, p_entidad, p_agencia, p_contrato);
  }
  
  
}