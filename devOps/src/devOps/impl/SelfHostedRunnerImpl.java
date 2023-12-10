/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.SelfHostedRunner;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Hosted Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SelfHostedRunnerImpl extends RunnerImpl implements SelfHostedRunner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfHostedRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.SELF_HOSTED_RUNNER;
	}

} //SelfHostedRunnerImpl
