/**
 */
package devOps.util;

import devOps.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see devOps.DevOpsPackage
 * @generated
 */
public class DevOpsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DevOpsValidator INSTANCE = new DevOpsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "devOps";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Task Names' of 'Pipeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PIPELINE__UNIQUE_TASK_NAMES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Name' of 'Pipeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PIPELINE__UNIQUE_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Duration' of 'Cron Trigger'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRON_TRIGGER__POSITIVE_DURATION = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DevOpsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DevOpsPackage.PIPELINE:
				return validatePipeline((Pipeline)value, diagnostics, context);
			case DevOpsPackage.STAGE:
				return validateStage((Stage)value, diagnostics, context);
			case DevOpsPackage.STRING_TO_STRING_MAP_ENTRY:
				return validateStringToStringMapEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case DevOpsPackage.ENVIRONMENT:
				return validateEnvironment((Environment)value, diagnostics, context);
			case DevOpsPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case DevOpsPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case DevOpsPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case DevOpsPackage.REPOSITORY_EVENT:
				return validateRepositoryEvent((RepositoryEvent)value, diagnostics, context);
			case DevOpsPackage.WEB_HOOK:
				return validateWebHook((WebHook)value, diagnostics, context);
			case DevOpsPackage.API_TRIGGER:
				return validateAPITrigger((APITrigger)value, diagnostics, context);
			case DevOpsPackage.RUNNER:
				return validateRunner((Runner)value, diagnostics, context);
			case DevOpsPackage.IAA_S:
				return validateIaaS((IaaS)value, diagnostics, context);
			case DevOpsPackage.CONTAINER_ENGINE:
				return validateContainerEngine((ContainerEngine)value, diagnostics, context);
			case DevOpsPackage.OPERATING_SYSTEM:
				return validateOperatingSystem((OperatingSystem)value, diagnostics, context);
			case DevOpsPackage.SELF_HOSTED_RUNNER:
				return validateSelfHostedRunner((SelfHostedRunner)value, diagnostics, context);
			case DevOpsPackage.SSH_RUNNER:
				return validateSSHRunner((SSHRunner)value, diagnostics, context);
			case DevOpsPackage.PHONE_HOME_RUNNER:
				return validatePhoneHomeRunner((PhoneHomeRunner)value, diagnostics, context);
			case DevOpsPackage.CONDITIONAL:
				return validateConditional((Conditional)value, diagnostics, context);
			case DevOpsPackage.UNARY_CONDITIONAL:
				return validateUnaryConditional((UnaryConditional)value, diagnostics, context);
			case DevOpsPackage.BINARY_CONDITIONAL:
				return validateBinaryConditional((BinaryConditional)value, diagnostics, context);
			case DevOpsPackage.OPERAND:
				return validateOperand((Operand)value, diagnostics, context);
			case DevOpsPackage.LOGIC_OPERATOR:
				return validateLogicOperator((LogicOperator)value, diagnostics, context);
			case DevOpsPackage.CRON_TRIGGER:
				return validateCronTrigger((CronTrigger)value, diagnostics, context);
			case DevOpsPackage.MERGE_REQUEST:
				return validateMergeRequest((MergeRequest)value, diagnostics, context);
			case DevOpsPackage.PUSH:
				return validatePush((Push)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pipeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueName(pipeline, diagnostics, context);
		if (result || diagnostics != null) result &= validatePipeline_UniqueTaskNames(pipeline, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UniqueName constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueName(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pipeline.UniqueName(diagnostics, context);
	}

	/**
	 * Validates the UniqueTaskNames constraint of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePipeline_UniqueTaskNames(Pipeline pipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pipeline.UniqueTaskNames(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStage(Stage stage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringToStringMapEntry(Map.Entry<?, ?> stringToStringMapEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)stringToStringMapEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(task, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepositoryEvent(RepositoryEvent repositoryEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repositoryEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebHook(WebHook webHook, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(webHook, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPITrigger(APITrigger apiTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(apiTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRunner(Runner runner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIaaS(IaaS iaaS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iaaS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerEngine(ContainerEngine containerEngine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerEngine, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingSystem(OperatingSystem operatingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatingSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfHostedRunner(SelfHostedRunner selfHostedRunner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfHostedRunner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSSHRunner(SSHRunner sshRunner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sshRunner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoneHomeRunner(PhoneHomeRunner phoneHomeRunner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phoneHomeRunner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditional(Conditional conditional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryConditional(UnaryConditional unaryConditional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryConditional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryConditional(BinaryConditional binaryConditional, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryConditional, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperand(Operand operand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicOperator(LogicOperator logicOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCronTrigger(CronTrigger cronTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cronTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cronTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateCronTrigger_PositiveDuration(cronTrigger, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PositiveDuration constraint of '<em>Cron Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCronTrigger_PositiveDuration(CronTrigger cronTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cronTrigger.PositiveDuration(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeRequest(MergeRequest mergeRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergeRequest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePush(Push push, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(push, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DevOpsValidator
