/**
 */
package devOps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see devOps.DevOpsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface DevOpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devOps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/examples/devops.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devOps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevOpsPackage eINSTANCE = devOps.impl.DevOpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link devOps.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.PipelineImpl
	 * @see devOps.impl.DevOpsPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENT = 1;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGES = 2;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = 3;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__RUNNER = 4;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Unique Task Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE___UNIQUE_TASK_NAMES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link devOps.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.StageImpl
	 * @see devOps.impl.DevOpsPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__CONDITIONAL = 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.StringToStringMapEntryImpl
	 * @see devOps.impl.DevOpsPackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.EnvironmentImpl
	 * @see devOps.impl.DevOpsPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ARTIFACTS = 1;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SECRETS = 2;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.DevOpsTaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.DevOpsTaskImpl
	 * @see devOps.impl.DevOpsPackageImpl#getDevOpsTask()
	 * @generated
	 */
	int DEV_OPS_TASK = 22;

	/**
	 * The meta object id for the '{@link devOps.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.TaskImpl
	 * @see devOps.impl.DevOpsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The meta object id for the '{@link devOps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.StepImpl
	 * @see devOps.impl.DevOpsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_TASK__ALLOW_FAILURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_TASK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_TASK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_TASK_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ALLOW_FAILURE = DEV_OPS_TASK__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = DEV_OPS_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STEPS = DEV_OPS_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ENVIRONMENT = DEV_OPS_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RUNNER = DEV_OPS_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = DEV_OPS_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = DEV_OPS_TASK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONDITIONAL = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.TriggerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 6;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.RepositoryEventImpl <em>Repository Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.RepositoryEventImpl
	 * @see devOps.impl.DevOpsPackageImpl#getRepositoryEvent()
	 * @generated
	 */
	int REPOSITORY_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_EVENT__REPOSITORY = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_EVENT__BRANCH = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_EVENT_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repository Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_EVENT_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.WebHookImpl <em>Web Hook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.WebHookImpl
	 * @see devOps.impl.DevOpsPackageImpl#getWebHook()
	 * @generated
	 */
	int WEB_HOOK = 8;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_HOOK__BODY = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_HOOK_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web Hook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_HOOK_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.APITriggerImpl <em>API Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.APITriggerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getAPITrigger()
	 * @generated
	 */
	int API_TRIGGER = 9;

	/**
	 * The number of structural features of the '<em>API Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>API Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.RunnerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 10;

	/**
	 * The number of structural features of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.IaaSImpl <em>Iaa S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.IaaSImpl
	 * @see devOps.impl.DevOpsPackageImpl#getIaaS()
	 * @generated
	 */
	int IAA_S = 11;

	/**
	 * The number of structural features of the '<em>Iaa S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_S_FEATURE_COUNT = RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Iaa S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAA_S_OPERATION_COUNT = RUNNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.ContainerEngineImpl <em>Container Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.ContainerEngineImpl
	 * @see devOps.impl.DevOpsPackageImpl#getContainerEngine()
	 * @generated
	 */
	int CONTAINER_ENGINE = 12;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE__IMAGE = IAA_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE__ARGUMENTS = IAA_S_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE__ENTRY_POINT = IAA_S_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE__COMMAND = IAA_S_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE_FEATURE_COUNT = IAA_S_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ENGINE_OPERATION_COUNT = IAA_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.OperatingSystemImpl
	 * @see devOps.impl.DevOpsPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__SHELL = IAA_S_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__OS_NAME = IAA_S_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = IAA_S_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = IAA_S_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.SelfHostedRunnerImpl <em>Self Hosted Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.SelfHostedRunnerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getSelfHostedRunner()
	 * @generated
	 */
	int SELF_HOSTED_RUNNER = 14;

	/**
	 * The number of structural features of the '<em>Self Hosted Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_HOSTED_RUNNER_FEATURE_COUNT = RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Self Hosted Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_HOSTED_RUNNER_OPERATION_COUNT = RUNNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.SSHRunnerImpl <em>SSH Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.SSHRunnerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getSSHRunner()
	 * @generated
	 */
	int SSH_RUNNER = 15;

	/**
	 * The feature id for the '<em><b>Ssh Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_RUNNER__SSH_CREDENTIALS = SELF_HOSTED_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SSH Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_RUNNER_FEATURE_COUNT = SELF_HOSTED_RUNNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SSH Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSH_RUNNER_OPERATION_COUNT = SELF_HOSTED_RUNNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.PhoneHomeRunnerImpl <em>Phone Home Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.PhoneHomeRunnerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getPhoneHomeRunner()
	 * @generated
	 */
	int PHONE_HOME_RUNNER = 16;

	/**
	 * The feature id for the '<em><b>Runner Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_HOME_RUNNER__RUNNER_TOKEN = SELF_HOSTED_RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Phone Home Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_HOME_RUNNER_FEATURE_COUNT = SELF_HOSTED_RUNNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Phone Home Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_HOME_RUNNER_OPERATION_COUNT = SELF_HOSTED_RUNNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.ConditionalImpl
	 * @see devOps.impl.DevOpsPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devOps.impl.CronTriggerImpl <em>Cron Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.CronTriggerImpl
	 * @see devOps.impl.DevOpsPackageImpl#getCronTrigger()
	 * @generated
	 */
	int CRON_TRIGGER = 18;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER__HOURS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER__MINUTES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER__SECONDS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cron Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Positive Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cron Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link devOps.impl.MergeRequestImpl <em>Merge Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.MergeRequestImpl
	 * @see devOps.impl.DevOpsPackageImpl#getMergeRequest()
	 * @generated
	 */
	int MERGE_REQUEST = 19;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__REPOSITORY = REPOSITORY_EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__BRANCH = REPOSITORY_EVENT__BRANCH;

	/**
	 * The number of structural features of the '<em>Merge Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_FEATURE_COUNT = REPOSITORY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_OPERATION_COUNT = REPOSITORY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.PushImpl
	 * @see devOps.impl.DevOpsPackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 20;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__REPOSITORY = REPOSITORY_EVENT__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__BRANCH = REPOSITORY_EVENT__BRANCH;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = REPOSITORY_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_OPERATION_COUNT = REPOSITORY_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link devOps.impl.RegistryTaskImpl <em>Registry Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.RegistryTaskImpl
	 * @see devOps.impl.DevOpsPackageImpl#getRegistryTask()
	 * @generated
	 */
	int REGISTRY_TASK = 21;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK__ALLOW_FAILURE = DEV_OPS_TASK__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK__NAME = DEV_OPS_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK__CONDITIONAL = DEV_OPS_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK__CMD = DEV_OPS_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK__ARGUMENTS = DEV_OPS_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Registry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK_FEATURE_COUNT = DEV_OPS_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Registry Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_TASK_OPERATION_COUNT = DEV_OPS_TASK_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link devOps.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.CommandImpl
	 * @see devOps.impl.DevOpsPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 23;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CONDITIONAL = STEP__CONDITIONAL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CMD = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link devOps.impl.ImportedTaskImpl <em>Imported Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devOps.impl.ImportedTaskImpl
	 * @see devOps.impl.DevOpsPackageImpl#getImportedTask()
	 * @generated
	 */
	int IMPORTED_TASK = 24;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TASK__CONDITIONAL = STEP__CONDITIONAL;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TASK__TASK = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TASK_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imported Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TASK_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link devOps.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see devOps.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link devOps.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOps.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Pipeline#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see devOps.Pipeline#getEnvironment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link devOps.Pipeline#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see devOps.Pipeline#getStages()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stages();

	/**
	 * Returns the meta object for the containment reference list '{@link devOps.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see devOps.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Pipeline#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runner</em>'.
	 * @see devOps.Pipeline#getRunner()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Runner();

	/**
	 * Returns the meta object for the '{@link devOps.Pipeline#UniqueTaskNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Task Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Task Names</em>' operation.
	 * @see devOps.Pipeline#UniqueTaskNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPipeline__UniqueTaskNames__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link devOps.Pipeline#UniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Name</em>' operation.
	 * @see devOps.Pipeline#UniqueName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPipeline__UniqueName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link devOps.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see devOps.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the reference list '{@link devOps.Stage#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see devOps.Stage#getTasks()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Tasks();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Stage#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional</em>'.
	 * @see devOps.Stage#getConditional()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Conditional();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link devOps.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see devOps.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the map '{@link devOps.Environment#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Variables</em>'.
	 * @see devOps.Environment#getVariables()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Variables();

	/**
	 * Returns the meta object for the map '{@link devOps.Environment#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Artifacts</em>'.
	 * @see devOps.Environment#getArtifacts()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Artifacts();

	/**
	 * Returns the meta object for the map '{@link devOps.Environment#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Secrets</em>'.
	 * @see devOps.Environment#getSecrets()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Secrets();

	/**
	 * Returns the meta object for class '{@link devOps.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see devOps.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link devOps.Task#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see devOps.Task#getSteps()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Task#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see devOps.Task#getEnvironment()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Task#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runner</em>'.
	 * @see devOps.Task#getRunner()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Runner();

	/**
	 * Returns the meta object for class '{@link devOps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see devOps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference '{@link devOps.Step#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional</em>'.
	 * @see devOps.Step#getConditional()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Conditional();

	/**
	 * Returns the meta object for class '{@link devOps.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see devOps.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link devOps.RepositoryEvent <em>Repository Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Event</em>'.
	 * @see devOps.RepositoryEvent
	 * @generated
	 */
	EClass getRepositoryEvent();

	/**
	 * Returns the meta object for the attribute '{@link devOps.RepositoryEvent#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see devOps.RepositoryEvent#getRepository()
	 * @see #getRepositoryEvent()
	 * @generated
	 */
	EAttribute getRepositoryEvent_Repository();

	/**
	 * Returns the meta object for the attribute '{@link devOps.RepositoryEvent#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see devOps.RepositoryEvent#getBranch()
	 * @see #getRepositoryEvent()
	 * @generated
	 */
	EAttribute getRepositoryEvent_Branch();

	/**
	 * Returns the meta object for class '{@link devOps.WebHook <em>Web Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Hook</em>'.
	 * @see devOps.WebHook
	 * @generated
	 */
	EClass getWebHook();

	/**
	 * Returns the meta object for the attribute '{@link devOps.WebHook#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see devOps.WebHook#getBody()
	 * @see #getWebHook()
	 * @generated
	 */
	EAttribute getWebHook_Body();

	/**
	 * Returns the meta object for class '{@link devOps.APITrigger <em>API Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Trigger</em>'.
	 * @see devOps.APITrigger
	 * @generated
	 */
	EClass getAPITrigger();

	/**
	 * Returns the meta object for class '{@link devOps.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see devOps.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for class '{@link devOps.IaaS <em>Iaa S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iaa S</em>'.
	 * @see devOps.IaaS
	 * @generated
	 */
	EClass getIaaS();

	/**
	 * Returns the meta object for class '{@link devOps.ContainerEngine <em>Container Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Engine</em>'.
	 * @see devOps.ContainerEngine
	 * @generated
	 */
	EClass getContainerEngine();

	/**
	 * Returns the meta object for the attribute '{@link devOps.ContainerEngine#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see devOps.ContainerEngine#getImage()
	 * @see #getContainerEngine()
	 * @generated
	 */
	EAttribute getContainerEngine_Image();

	/**
	 * Returns the meta object for the map '{@link devOps.ContainerEngine#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Arguments</em>'.
	 * @see devOps.ContainerEngine#getArguments()
	 * @see #getContainerEngine()
	 * @generated
	 */
	EReference getContainerEngine_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link devOps.ContainerEngine#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see devOps.ContainerEngine#getEntryPoint()
	 * @see #getContainerEngine()
	 * @generated
	 */
	EAttribute getContainerEngine_EntryPoint();

	/**
	 * Returns the meta object for the attribute '{@link devOps.ContainerEngine#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see devOps.ContainerEngine#getCommand()
	 * @see #getContainerEngine()
	 * @generated
	 */
	EAttribute getContainerEngine_Command();

	/**
	 * Returns the meta object for class '{@link devOps.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see devOps.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link devOps.OperatingSystem#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see devOps.OperatingSystem#getShell()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Shell();

	/**
	 * Returns the meta object for the attribute '{@link devOps.OperatingSystem#getOsName <em>Os Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Name</em>'.
	 * @see devOps.OperatingSystem#getOsName()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_OsName();

	/**
	 * Returns the meta object for class '{@link devOps.SelfHostedRunner <em>Self Hosted Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Hosted Runner</em>'.
	 * @see devOps.SelfHostedRunner
	 * @generated
	 */
	EClass getSelfHostedRunner();

	/**
	 * Returns the meta object for class '{@link devOps.SSHRunner <em>SSH Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSH Runner</em>'.
	 * @see devOps.SSHRunner
	 * @generated
	 */
	EClass getSSHRunner();

	/**
	 * Returns the meta object for the attribute '{@link devOps.SSHRunner#getSshCredentials <em>Ssh Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Credentials</em>'.
	 * @see devOps.SSHRunner#getSshCredentials()
	 * @see #getSSHRunner()
	 * @generated
	 */
	EAttribute getSSHRunner_SshCredentials();

	/**
	 * Returns the meta object for class '{@link devOps.PhoneHomeRunner <em>Phone Home Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Home Runner</em>'.
	 * @see devOps.PhoneHomeRunner
	 * @generated
	 */
	EClass getPhoneHomeRunner();

	/**
	 * Returns the meta object for the attribute '{@link devOps.PhoneHomeRunner#getRunnerToken <em>Runner Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runner Token</em>'.
	 * @see devOps.PhoneHomeRunner#getRunnerToken()
	 * @see #getPhoneHomeRunner()
	 * @generated
	 */
	EAttribute getPhoneHomeRunner_RunnerToken();

	/**
	 * Returns the meta object for class '{@link devOps.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see devOps.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the attribute '{@link devOps.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see devOps.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EAttribute getConditional_Condition();

	/**
	 * Returns the meta object for class '{@link devOps.CronTrigger <em>Cron Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Trigger</em>'.
	 * @see devOps.CronTrigger
	 * @generated
	 */
	EClass getCronTrigger();

	/**
	 * Returns the meta object for the attribute '{@link devOps.CronTrigger#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see devOps.CronTrigger#getHours()
	 * @see #getCronTrigger()
	 * @generated
	 */
	EAttribute getCronTrigger_Hours();

	/**
	 * Returns the meta object for the attribute '{@link devOps.CronTrigger#getMinutes <em>Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes</em>'.
	 * @see devOps.CronTrigger#getMinutes()
	 * @see #getCronTrigger()
	 * @generated
	 */
	EAttribute getCronTrigger_Minutes();

	/**
	 * Returns the meta object for the attribute '{@link devOps.CronTrigger#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see devOps.CronTrigger#getSeconds()
	 * @see #getCronTrigger()
	 * @generated
	 */
	EAttribute getCronTrigger_Seconds();

	/**
	 * Returns the meta object for the '{@link devOps.CronTrigger#PositiveDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Duration</em>' operation.
	 * @see devOps.CronTrigger#PositiveDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCronTrigger__PositiveDuration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link devOps.MergeRequest <em>Merge Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Request</em>'.
	 * @see devOps.MergeRequest
	 * @generated
	 */
	EClass getMergeRequest();

	/**
	 * Returns the meta object for class '{@link devOps.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see devOps.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for class '{@link devOps.RegistryTask <em>Registry Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry Task</em>'.
	 * @see devOps.RegistryTask
	 * @generated
	 */
	EClass getRegistryTask();

	/**
	 * Returns the meta object for the attribute '{@link devOps.RegistryTask#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see devOps.RegistryTask#getCmd()
	 * @see #getRegistryTask()
	 * @generated
	 */
	EAttribute getRegistryTask_Cmd();

	/**
	 * Returns the meta object for the map '{@link devOps.RegistryTask#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Arguments</em>'.
	 * @see devOps.RegistryTask#getArguments()
	 * @see #getRegistryTask()
	 * @generated
	 */
	EReference getRegistryTask_Arguments();

	/**
	 * Returns the meta object for class '{@link devOps.DevOpsTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see devOps.DevOpsTask
	 * @generated
	 */
	EClass getDevOpsTask();

	/**
	 * Returns the meta object for the attribute '{@link devOps.DevOpsTask#isAllowFailure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Failure</em>'.
	 * @see devOps.DevOpsTask#isAllowFailure()
	 * @see #getDevOpsTask()
	 * @generated
	 */
	EAttribute getDevOpsTask_AllowFailure();

	/**
	 * Returns the meta object for the attribute '{@link devOps.DevOpsTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devOps.DevOpsTask#getName()
	 * @see #getDevOpsTask()
	 * @generated
	 */
	EAttribute getDevOpsTask_Name();

	/**
	 * Returns the meta object for class '{@link devOps.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see devOps.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link devOps.Command#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see devOps.Command#getCmd()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Cmd();

	/**
	 * Returns the meta object for class '{@link devOps.ImportedTask <em>Imported Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Task</em>'.
	 * @see devOps.ImportedTask
	 * @generated
	 */
	EClass getImportedTask();

	/**
	 * Returns the meta object for the reference '{@link devOps.ImportedTask#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see devOps.ImportedTask#getTask()
	 * @see #getImportedTask()
	 * @generated
	 */
	EReference getImportedTask_Task();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevOpsFactory getDevOpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link devOps.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.PipelineImpl
		 * @see devOps.impl.DevOpsPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVIRONMENT = eINSTANCE.getPipeline_Environment();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGES = eINSTANCE.getPipeline_Stages();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__RUNNER = eINSTANCE.getPipeline_Runner();

		/**
		 * The meta object literal for the '<em><b>Unique Task Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIPELINE___UNIQUE_TASK_NAMES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPipeline__UniqueTaskNames__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIPELINE___UNIQUE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPipeline__UniqueName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link devOps.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.StageImpl
		 * @see devOps.impl.DevOpsPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TASKS = eINSTANCE.getStage_Tasks();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__CONDITIONAL = eINSTANCE.getStage_Conditional();

		/**
		 * The meta object literal for the '{@link devOps.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.StringToStringMapEntryImpl
		 * @see devOps.impl.DevOpsPackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link devOps.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.EnvironmentImpl
		 * @see devOps.impl.DevOpsPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__VARIABLES = eINSTANCE.getEnvironment_Variables();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ARTIFACTS = eINSTANCE.getEnvironment_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__SECRETS = eINSTANCE.getEnvironment_Secrets();

		/**
		 * The meta object literal for the '{@link devOps.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.TaskImpl
		 * @see devOps.impl.DevOpsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__STEPS = eINSTANCE.getTask_Steps();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ENVIRONMENT = eINSTANCE.getTask_Environment();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RUNNER = eINSTANCE.getTask_Runner();

		/**
		 * The meta object literal for the '{@link devOps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.StepImpl
		 * @see devOps.impl.DevOpsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CONDITIONAL = eINSTANCE.getStep_Conditional();

		/**
		 * The meta object literal for the '{@link devOps.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.TriggerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link devOps.impl.RepositoryEventImpl <em>Repository Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.RepositoryEventImpl
		 * @see devOps.impl.DevOpsPackageImpl#getRepositoryEvent()
		 * @generated
		 */
		EClass REPOSITORY_EVENT = eINSTANCE.getRepositoryEvent();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_EVENT__REPOSITORY = eINSTANCE.getRepositoryEvent_Repository();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_EVENT__BRANCH = eINSTANCE.getRepositoryEvent_Branch();

		/**
		 * The meta object literal for the '{@link devOps.impl.WebHookImpl <em>Web Hook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.WebHookImpl
		 * @see devOps.impl.DevOpsPackageImpl#getWebHook()
		 * @generated
		 */
		EClass WEB_HOOK = eINSTANCE.getWebHook();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_HOOK__BODY = eINSTANCE.getWebHook_Body();

		/**
		 * The meta object literal for the '{@link devOps.impl.APITriggerImpl <em>API Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.APITriggerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getAPITrigger()
		 * @generated
		 */
		EClass API_TRIGGER = eINSTANCE.getAPITrigger();

		/**
		 * The meta object literal for the '{@link devOps.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.RunnerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getRunner()
		 * @generated
		 */
		EClass RUNNER = eINSTANCE.getRunner();

		/**
		 * The meta object literal for the '{@link devOps.impl.IaaSImpl <em>Iaa S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.IaaSImpl
		 * @see devOps.impl.DevOpsPackageImpl#getIaaS()
		 * @generated
		 */
		EClass IAA_S = eINSTANCE.getIaaS();

		/**
		 * The meta object literal for the '{@link devOps.impl.ContainerEngineImpl <em>Container Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.ContainerEngineImpl
		 * @see devOps.impl.DevOpsPackageImpl#getContainerEngine()
		 * @generated
		 */
		EClass CONTAINER_ENGINE = eINSTANCE.getContainerEngine();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ENGINE__IMAGE = eINSTANCE.getContainerEngine_Image();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ENGINE__ARGUMENTS = eINSTANCE.getContainerEngine_Arguments();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ENGINE__ENTRY_POINT = eINSTANCE.getContainerEngine_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ENGINE__COMMAND = eINSTANCE.getContainerEngine_Command();

		/**
		 * The meta object literal for the '{@link devOps.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.OperatingSystemImpl
		 * @see devOps.impl.DevOpsPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__SHELL = eINSTANCE.getOperatingSystem_Shell();

		/**
		 * The meta object literal for the '<em><b>Os Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__OS_NAME = eINSTANCE.getOperatingSystem_OsName();

		/**
		 * The meta object literal for the '{@link devOps.impl.SelfHostedRunnerImpl <em>Self Hosted Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.SelfHostedRunnerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getSelfHostedRunner()
		 * @generated
		 */
		EClass SELF_HOSTED_RUNNER = eINSTANCE.getSelfHostedRunner();

		/**
		 * The meta object literal for the '{@link devOps.impl.SSHRunnerImpl <em>SSH Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.SSHRunnerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getSSHRunner()
		 * @generated
		 */
		EClass SSH_RUNNER = eINSTANCE.getSSHRunner();

		/**
		 * The meta object literal for the '<em><b>Ssh Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SSH_RUNNER__SSH_CREDENTIALS = eINSTANCE.getSSHRunner_SshCredentials();

		/**
		 * The meta object literal for the '{@link devOps.impl.PhoneHomeRunnerImpl <em>Phone Home Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.PhoneHomeRunnerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getPhoneHomeRunner()
		 * @generated
		 */
		EClass PHONE_HOME_RUNNER = eINSTANCE.getPhoneHomeRunner();

		/**
		 * The meta object literal for the '<em><b>Runner Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_HOME_RUNNER__RUNNER_TOKEN = eINSTANCE.getPhoneHomeRunner_RunnerToken();

		/**
		 * The meta object literal for the '{@link devOps.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.ConditionalImpl
		 * @see devOps.impl.DevOpsPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '{@link devOps.impl.CronTriggerImpl <em>Cron Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.CronTriggerImpl
		 * @see devOps.impl.DevOpsPackageImpl#getCronTrigger()
		 * @generated
		 */
		EClass CRON_TRIGGER = eINSTANCE.getCronTrigger();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_TRIGGER__HOURS = eINSTANCE.getCronTrigger_Hours();

		/**
		 * The meta object literal for the '<em><b>Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_TRIGGER__MINUTES = eINSTANCE.getCronTrigger_Minutes();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_TRIGGER__SECONDS = eINSTANCE.getCronTrigger_Seconds();

		/**
		 * The meta object literal for the '<em><b>Positive Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRON_TRIGGER___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCronTrigger__PositiveDuration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link devOps.impl.MergeRequestImpl <em>Merge Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.MergeRequestImpl
		 * @see devOps.impl.DevOpsPackageImpl#getMergeRequest()
		 * @generated
		 */
		EClass MERGE_REQUEST = eINSTANCE.getMergeRequest();

		/**
		 * The meta object literal for the '{@link devOps.impl.PushImpl <em>Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.PushImpl
		 * @see devOps.impl.DevOpsPackageImpl#getPush()
		 * @generated
		 */
		EClass PUSH = eINSTANCE.getPush();

		/**
		 * The meta object literal for the '{@link devOps.impl.RegistryTaskImpl <em>Registry Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.RegistryTaskImpl
		 * @see devOps.impl.DevOpsPackageImpl#getRegistryTask()
		 * @generated
		 */
		EClass REGISTRY_TASK = eINSTANCE.getRegistryTask();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRY_TASK__CMD = eINSTANCE.getRegistryTask_Cmd();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY_TASK__ARGUMENTS = eINSTANCE.getRegistryTask_Arguments();

		/**
		 * The meta object literal for the '{@link devOps.impl.DevOpsTaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.DevOpsTaskImpl
		 * @see devOps.impl.DevOpsPackageImpl#getDevOpsTask()
		 * @generated
		 */
		EClass DEV_OPS_TASK = eINSTANCE.getDevOpsTask();

		/**
		 * The meta object literal for the '<em><b>Allow Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_OPS_TASK__ALLOW_FAILURE = eINSTANCE.getDevOpsTask_AllowFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_OPS_TASK__NAME = eINSTANCE.getDevOpsTask_Name();

		/**
		 * The meta object literal for the '{@link devOps.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.CommandImpl
		 * @see devOps.impl.DevOpsPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__CMD = eINSTANCE.getCommand_Cmd();

		/**
		 * The meta object literal for the '{@link devOps.impl.ImportedTaskImpl <em>Imported Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devOps.impl.ImportedTaskImpl
		 * @see devOps.impl.DevOpsPackageImpl#getImportedTask()
		 * @generated
		 */
		EClass IMPORTED_TASK = eINSTANCE.getImportedTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_TASK__TASK = eINSTANCE.getImportedTask_Task();

	}

} //DevOpsPackage
