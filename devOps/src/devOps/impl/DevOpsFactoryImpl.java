/**
 */
package devOps.impl;

import devOps.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevOpsFactoryImpl extends EFactoryImpl implements DevOpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevOpsFactory init() {
		try {
			DevOpsFactory theDevOpsFactory = (DevOpsFactory)EPackage.Registry.INSTANCE.getEFactory(DevOpsPackage.eNS_URI);
			if (theDevOpsFactory != null) {
				return theDevOpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevOpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DevOpsPackage.PIPELINE: return createPipeline();
			case DevOpsPackage.STAGE: return createStage();
			case DevOpsPackage.STRING_TO_STRING_MAP_ENTRY: return (EObject)createStringToStringMapEntry();
			case DevOpsPackage.ENVIRONMENT: return createEnvironment();
			case DevOpsPackage.TASK: return createTask();
			case DevOpsPackage.WEB_HOOK: return createWebHook();
			case DevOpsPackage.API_TRIGGER: return createAPITrigger();
			case DevOpsPackage.CONTAINER_ENGINE: return createContainerEngine();
			case DevOpsPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case DevOpsPackage.SSH_RUNNER: return createSSHRunner();
			case DevOpsPackage.PHONE_HOME_RUNNER: return createPhoneHomeRunner();
			case DevOpsPackage.CONDITIONAL: return createConditional();
			case DevOpsPackage.CRON_TRIGGER: return createCronTrigger();
			case DevOpsPackage.MERGE_REQUEST: return createMergeRequest();
			case DevOpsPackage.PUSH: return createPush();
			case DevOpsPackage.REGISTRY_TASK: return createRegistryTask();
			case DevOpsPackage.COMMAND: return createCommand();
			case DevOpsPackage.IMPORTED_TASK: return createImportedTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMapEntry() {
		StringToStringMapEntryImpl stringToStringMapEntry = new StringToStringMapEntryImpl();
		return stringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebHook createWebHook() {
		WebHookImpl webHook = new WebHookImpl();
		return webHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APITrigger createAPITrigger() {
		APITriggerImpl apiTrigger = new APITriggerImpl();
		return apiTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerEngine createContainerEngine() {
		ContainerEngineImpl containerEngine = new ContainerEngineImpl();
		return containerEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSHRunner createSSHRunner() {
		SSHRunnerImpl sshRunner = new SSHRunnerImpl();
		return sshRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhoneHomeRunner createPhoneHomeRunner() {
		PhoneHomeRunnerImpl phoneHomeRunner = new PhoneHomeRunnerImpl();
		return phoneHomeRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CronTrigger createCronTrigger() {
		CronTriggerImpl cronTrigger = new CronTriggerImpl();
		return cronTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeRequest createMergeRequest() {
		MergeRequestImpl mergeRequest = new MergeRequestImpl();
		return mergeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegistryTask createRegistryTask() {
		RegistryTaskImpl registryTask = new RegistryTaskImpl();
		return registryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedTask createImportedTask() {
		ImportedTaskImpl importedTask = new ImportedTaskImpl();
		return importedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DevOpsPackage getDevOpsPackage() {
		return (DevOpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevOpsPackage getPackage() {
		return DevOpsPackage.eINSTANCE;
	}

} //DevOpsFactoryImpl
