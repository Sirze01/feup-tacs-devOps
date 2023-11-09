/**
 */
package devOps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see devOps.DevOpsPackage
 * @generated
 */
public interface DevOpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevOpsFactory eINSTANCE = devOps.impl.DevOpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
	Stage createStage();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Repository Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Event</em>'.
	 * @generated
	 */
	RepositoryEvent createRepositoryEvent();

	/**
	 * Returns a new object of class '<em>Web Hook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Hook</em>'.
	 * @generated
	 */
	WebHook createWebHook();

	/**
	 * Returns a new object of class '<em>API Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Trigger</em>'.
	 * @generated
	 */
	APITrigger createAPITrigger();

	/**
	 * Returns a new object of class '<em>Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runner</em>'.
	 * @generated
	 */
	Runner createRunner();

	/**
	 * Returns a new object of class '<em>Iaa S</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iaa S</em>'.
	 * @generated
	 */
	IaaS createIaaS();

	/**
	 * Returns a new object of class '<em>Container Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Engine</em>'.
	 * @generated
	 */
	ContainerEngine createContainerEngine();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>Self Hosted Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Hosted Runner</em>'.
	 * @generated
	 */
	SelfHostedRunner createSelfHostedRunner();

	/**
	 * Returns a new object of class '<em>SSH Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSH Runner</em>'.
	 * @generated
	 */
	SSHRunner createSSHRunner();

	/**
	 * Returns a new object of class '<em>Phone Home Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phone Home Runner</em>'.
	 * @generated
	 */
	PhoneHomeRunner createPhoneHomeRunner();

	/**
	 * Returns a new object of class '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional</em>'.
	 * @generated
	 */
	Conditional createConditional();

	/**
	 * Returns a new object of class '<em>Unary Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Conditional</em>'.
	 * @generated
	 */
	UnaryConditional createUnaryConditional();

	/**
	 * Returns a new object of class '<em>Binary Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Conditional</em>'.
	 * @generated
	 */
	BinaryConditional createBinaryConditional();

	/**
	 * Returns a new object of class '<em>Operand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operand</em>'.
	 * @generated
	 */
	Operand createOperand();

	/**
	 * Returns a new object of class '<em>Logic Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Operator</em>'.
	 * @generated
	 */
	LogicOperator createLogicOperator();

	/**
	 * Returns a new object of class '<em>Cron Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cron Trigger</em>'.
	 * @generated
	 */
	CronTrigger createCronTrigger();

	/**
	 * Returns a new object of class '<em>Merge Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Request</em>'.
	 * @generated
	 */
	MergeRequest createMergeRequest();

	/**
	 * Returns a new object of class '<em>Push</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push</em>'.
	 * @generated
	 */
	Push createPush();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevOpsPackage getDevOpsPackage();

} //DevOpsFactory
