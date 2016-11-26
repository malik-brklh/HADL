package m0;

import m1.ClientServeur;
import m1.PortPrincipal;
import m1.client.Client;
import m1.client.ReceiveResponse;
import m1.client.SendRequest;
import m1.connecteur.Called;
import m1.connecteur.Caller;
import m1.serveur.ReceiveRequest;
import m1.serveur.SendResponse;
import m1.serveur.Serveur;
import m1.serveur.detail.ServeurDetail;
import m1.serveur.detail.connectionmanager.ConnectionManager;
import m1.serveur.detail.connectionmanager.DbQuery;
import m1.serveur.detail.connectionmanager.ExternalSocket;
import m1.serveur.detail.connectionmanager.SecurityCheck;
import m1.serveur.detail.database.DataBase;
import m1.serveur.detail.database.QueryManager;
import m1.serveur.detail.database.SecurityDbCheck;
import m1.serveur.detail.securitymanager.AuthQuery;
import m1.serveur.detail.securitymanager.DbCheckQuery;
import m2.Message;
import m2.composant.Composant;
import m2.composant.InterfaceCpt;
import m2.configuration.Configuration;
import m2.configuration.InterfaceCfg;
import m2.connecteur.Connecteur;
import m2.connecteur.InterfaceCnt;

public class App {

	public static void main(String[] args) {
		
	

		// definition des composant
		// définition du client
		Composant client = new Client("Client");
		InterfaceCpt sendRequest = new SendRequest(), receiveResponse = new ReceiveResponse();
		client.addInterface(receiveResponse);
		client.addInterface(sendRequest);
		// definition du serveur
		Composant serveur = new Serveur("Serveur");
		InterfaceCpt receiveRequest = new ReceiveRequest(), sendResponse = new SendResponse();
		serveur.addInterface(sendResponse);
		serveur.addInterface(receiveRequest);
		// definition du connManager
		Composant connectionManager = new ConnectionManager("Connection Manager");
		InterfaceCpt dbQuery = new DbQuery(), securityCheck = new SecurityCheck(),
				externalSocket = new ExternalSocket();
		connectionManager.addInterface(securityCheck);
		connectionManager.addInterface(dbQuery);
		connectionManager.addInterface(externalSocket);
		// def du secMan
		Composant secManager = new m1.serveur.detail.securitymanager.SecurityManager("Security Manager");
		InterfaceCpt authQuery = new AuthQuery(), dbCheckQuery = new DbCheckQuery();
		secManager.addInterface(dbCheckQuery);
		secManager.addInterface(authQuery);
		// def de DataBase
		Composant dataBase = new DataBase("Data Base");
		InterfaceCpt queryMan = new QueryManager(), secDbCheck = new SecurityDbCheck();
		dataBase.addInterface(secDbCheck);
		dataBase.addInterface(queryMan);

		// definition des connecteurs
		// définition du rpc
		Connecteur rpc = new Connecteur("RPC", null);
		InterfaceCnt calledRpc = new Called();
		InterfaceCnt callerRpc = new Caller();
		rpc.addGlue(calledRpc, callerRpc);

		Connecteur sqlRequest = new Connecteur("SQL Request", null);
		InterfaceCnt calledSql = new Called();
		InterfaceCnt callerSql = new Caller();
		sqlRequest.addGlue(calledSql, callerSql);

		Connecteur secAuth = new Connecteur("Security Auth Check", null);
		InterfaceCnt calledSec = new Called();
		InterfaceCnt callerSec = new Caller();
		secAuth.addGlue(calledSec, callerSec);

		Connecteur dbSecCheck = new Connecteur("Security DB Check", null);
		InterfaceCnt calledDbSec = new Called();
		InterfaceCnt callerDbSec = new Caller();
		dbSecCheck.addGlue(calledDbSec, callerDbSec);

		// definition des configuration
		Configuration serveurDetail = new ServeurDetail("Serveur Detail");
		InterfaceCfg sendRespConf = new m1.serveur.detail.SendResponse(),
				receiveReqConf = new m1.serveur.detail.ReceiveRequest();
				
		serveurDetail.addElement(connectionManager);
		serveurDetail.addElement(dataBase);
		serveurDetail.addElement(secManager);
		serveurDetail.addElement(dbSecCheck);
		serveurDetail.addElement(secAuth);
		serveurDetail.addElement(sqlRequest);
		serveurDetail.addInterface(receiveReqConf);
		serveurDetail.addInterface(sendRespConf);
		//ajout des attachement et bindings
		serveurDetail.addAttachement(securityCheck, callerSec);
		serveurDetail.addAttachement(authQuery, calledSec);
		serveurDetail.addAttachement(dbQuery, callerSql);
		serveurDetail.addAttachement(queryMan, calledSql);
		serveurDetail.addAttachement(secDbCheck, callerDbSec);
		serveurDetail.addAttachement(dbCheckQuery, calledDbSec);
		
		
		// systeme global
		Configuration systemeClientServeur = new ClientServeur("Système Client Serveur");
		InterfaceCfg portPrincipale = new PortPrincipal();
		systemeClientServeur.addInterface(portPrincipale);
		
		
		// ajout et definition des lien entre client et rpc
		systemeClientServeur.addElement(client);
		systemeClientServeur.addElement(rpc);
		systemeClientServeur.addElement(serveur);
		systemeClientServeur.addElement(serveurDetail);
		
		systemeClientServeur.addAttachement(sendRequest, callerRpc);
		systemeClientServeur.addAttachement(receiveRequest, calledRpc);
		
		systemeClientServeur.addBinding(sendResponse,receiveReqConf);
		systemeClientServeur.addBinding(receiveResponse,portPrincipale);
		systemeClientServeur.addBinding(externalSocket,sendRespConf);
	//	serveurDetail.addBinding(externalSocket,sendRespConf);
		
	//	serveurDetail.addBinding(externalSocket,receiveReqConf);
		
		
		portPrincipale.sendMessage(systemeClientServeur, new Message("alma2016","hadl"));
		

	}

}
