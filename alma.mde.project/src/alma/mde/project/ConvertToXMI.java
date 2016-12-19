package alma.mde.project;


import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import com.google.inject.Injector;

import smalluml.impl.SmallumlPackageImpl;

public class ConvertToXMI {
	public static void main(String[] args) {
		SmallumlPackageImpl.init();
	    // change MyLanguage with your language name
	    Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);
	    
	    String inputURI = "C:\\Users\\Abdeldjallil\\runtime-EclipseApplication\\Mywork\\src\\new.suml";
	    String outputURI = "C:\\Users\\Abdeldjallil\\runtime-EclipseApplication\\Mywork\\src\\livre.xmi";
	    URI uri = URI.createFileURI(inputURI);
	    
	    

	    Resource xtextResource = resourceSet.getResource(uri, true);
	    EcoreUtil.resolveAll(xtextResource);
	
	    Resource xmiResource = resourceSet
	            .createResource(URI.createFileURI(outputURI));
	    /*if (xmiResource.getContents().isEmpty())
	    System.out.println("frfr");*/
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}