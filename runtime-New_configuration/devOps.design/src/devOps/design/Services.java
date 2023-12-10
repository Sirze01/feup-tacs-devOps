package devOps.design;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.PlatformUI;

import devOps.Pipeline;
import devOps.Stage;
import devOps.Step;
import devOps.Task;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;


/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    /**
     * Service to retrieve a EObject from other model file, through a LoadResource dialog
     * Source: https://www.eclipse.org/forums/index.php/t/1111468/
     * */
    public EObject loadResource(EObject obj) {
    	// Get session and domain
    	//Session session = SessionManager.INSTANCE.getSession(obj);
    	Session session = new EObjectQuery(obj).getSession();
    	EditingDomain domain = session.getTransactionalEditingDomain();
    	//EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(obj);
    	
    	// create and open Dialog
    	LoadResourceDialog loadResourceDialog = new LoadResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), domain);
        loadResourceDialog.open();
        
        // get selected URI
        List<URI> URIList = loadResourceDialog.getURIs();
        URI uri = URIList.get(0);
        
        Resource resource;
        // code taken from "createModel" function in Ess_coreEditor.java in the editor project.
        try {
			// Load the resource through the editing domain.
			resource = domain.getResourceSet().getResource(uri, true);
		}
		catch (Exception e) {
			resource = domain.getResourceSet().getResource(uri, false);
		}
        
        //get root object from the resource to set.
        EObject retobj = resource.getContents().get(0);
        
        return retobj;
    }
    
    public Step getNextStep(Step currentStep) {
    	List<Step> steps = ((Task)currentStep.eContainer()).getSteps();
    	int position = steps.indexOf(currentStep); 
    	if(position+1 > steps.size()) {
    		return null;
    	}
    	
    	return steps.get(position + 1);
    }
    
    public Stage getNextStage(Stage currentStage) {
    	List<Stage> stages = ((Pipeline)currentStage.eContainer()).getStages();
    	int position = stages.indexOf(currentStage); 
    	if(position+1 > stages.size()) {
    		return null;
    	}
    	
    	return stages.get(position + 1);
    }
    
    public List<Task> unsetTaskReference(Task element) {
    	((Stage) element.eContainer()).getTasks().remove(element);
    	List<Task> tasks = ((Stage) element.eContainer()).getTasks();
    	tasks.remove(element);
    	return tasks;
    }
}
