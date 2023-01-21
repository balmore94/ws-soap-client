package com.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import org.apache.axis.types.UnsignedShort;

import com.epssgt.www.ws_contratos_eps.AM_ContratosResult;
import com.epssgt.www.ws_contratos_eps.Cambiar_EstadoResult;
import com.epssgt.www.ws_contratos_eps.Consultar_EstadoResult;
import com.epssgt.www.ws_contratos_eps.Ws_contratos_eps;
import com.epssgt.www.ws_contratos_eps.Ws_contratos_epsLocator;
import com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoap;
import com.epssgt.www.ws_contratos_eps.Ws_contratos_epsSoapStub;

public class Cliente {

	public static void main(String[] args) throws MalformedURLException, RemoteException {

		/*Obtener los parametros del servicio*/
		Ws_contratos_eps service = new Ws_contratos_epsLocator();
		
		/*Define los parametros obtenidos del servicio y la ubicacion del servicio*/
		Ws_contratos_epsSoap ws = new Ws_contratos_epsSoapStub(new URL("http://localhost:8088/mockws_contratos_epsSoap12?WSDL"), service);

		
		/*Consumo metodo 1*/
		Consultar_EstadoResult queryState = ws.consultar_Estado(1, 1, 1, "00124");		
		/*Resultado consumo 1*/
		System.out.println("consumption of method Consultar_Estado " + queryState.getCodigo_Estado());
				
		/*Consumo metodo 2*/
		Cambiar_EstadoResult changeState = ws.cambiar_Estado(1, 1, 1, "00124", 5); 
		/*Resultado consumo 2*/
		System.out.println("consumption of method Cambiar_Estado " + changeState.getMensaje());
		
		/*Esta variable la definí por el tipo de dato que recibe el servicio, si no me equiboco deberás hacer la misma operación con los datos que enviarás*/		
		UnsignedShort unsignedShort = new UnsignedShort(1);
		/*Consumo metodo 3*/
		AM_ContratosResult contracts = ws.AM_Contratos(1, 1, 1, unsignedShort, "1");
		/*Resultado consumo 1*/
		System.out.println("consumption of method AM_Contratos " + contracts.getCodigo_Error());
		
		
		/*OJO, las salidas que muestro es para ejemplificar que funciona, no quiere decir que solo eso retorna el servicio*/
	}

}
