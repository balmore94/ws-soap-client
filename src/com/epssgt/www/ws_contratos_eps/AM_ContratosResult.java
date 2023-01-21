/**
 * AM_ContratosResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.epssgt.www.ws_contratos_eps;

public class AM_ContratosResult  implements java.io.Serializable {
    private boolean resultado;

    private java.lang.String mensaje;

    private int codigo_Error;

    private int transaccion;

    public AM_ContratosResult() {
    }

    public AM_ContratosResult(
           boolean resultado,
           java.lang.String mensaje,
           int codigo_Error,
           int transaccion) {
           this.resultado = resultado;
           this.mensaje = mensaje;
           this.codigo_Error = codigo_Error;
           this.transaccion = transaccion;
    }


    /**
     * Gets the resultado value for this AM_ContratosResult.
     * 
     * @return resultado
     */
    public boolean isResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this AM_ContratosResult.
     * 
     * @param resultado
     */
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the mensaje value for this AM_ContratosResult.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this AM_ContratosResult.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the codigo_Error value for this AM_ContratosResult.
     * 
     * @return codigo_Error
     */
    public int getCodigo_Error() {
        return codigo_Error;
    }


    /**
     * Sets the codigo_Error value for this AM_ContratosResult.
     * 
     * @param codigo_Error
     */
    public void setCodigo_Error(int codigo_Error) {
        this.codigo_Error = codigo_Error;
    }


    /**
     * Gets the transaccion value for this AM_ContratosResult.
     * 
     * @return transaccion
     */
    public int getTransaccion() {
        return transaccion;
    }


    /**
     * Sets the transaccion value for this AM_ContratosResult.
     * 
     * @param transaccion
     */
    public void setTransaccion(int transaccion) {
        this.transaccion = transaccion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AM_ContratosResult)) return false;
        AM_ContratosResult other = (AM_ContratosResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultado == other.isResultado() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            this.codigo_Error == other.getCodigo_Error() &&
            this.transaccion == other.getTransaccion();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isResultado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        _hashCode += getCodigo_Error();
        _hashCode += getTransaccion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AM_ContratosResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "AM_ContratosResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "Resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_Error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "Codigo_Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.epssgt.com/ws_contratos_eps/", "Transaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
