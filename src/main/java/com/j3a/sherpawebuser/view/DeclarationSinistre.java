package com.j3a.sherpawebuser.view;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.j3a.sherpawebuser.controller.DeclarationSinistreControler;
@Named
@Singleton
public class DeclarationSinistre {

	public DeclarationSinistre() {
		// TODO Auto-generated constructor stub
	}

	//Injection
	@Inject
	DeclarationSinistreControler declarationSinistreControler;

	public DeclarationSinistreControler getDeclarationSinistreControler() {
		return declarationSinistreControler;
	}

	public void setDeclarationSinistreControler(
			DeclarationSinistreControler declarationSinistreControler) {
		this.declarationSinistreControler = declarationSinistreControler;
	}
	
}
