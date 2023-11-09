/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.PhoneHomeRunner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phone Home Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.PhoneHomeRunnerImpl#getRunnerToken <em>Runner Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhoneHomeRunnerImpl extends SelfHostedRunnerImpl implements PhoneHomeRunner {
	/**
	 * The default value of the '{@link #getRunnerToken() <em>Runner Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnerToken()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNER_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunnerToken() <em>Runner Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnerToken()
	 * @generated
	 * @ordered
	 */
	protected String runnerToken = RUNNER_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneHomeRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.PHONE_HOME_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunnerToken() {
		return runnerToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunnerToken(String newRunnerToken) {
		String oldRunnerToken = runnerToken;
		runnerToken = newRunnerToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.PHONE_HOME_RUNNER__RUNNER_TOKEN, oldRunnerToken, runnerToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevOpsPackage.PHONE_HOME_RUNNER__RUNNER_TOKEN:
				return getRunnerToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevOpsPackage.PHONE_HOME_RUNNER__RUNNER_TOKEN:
				setRunnerToken((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevOpsPackage.PHONE_HOME_RUNNER__RUNNER_TOKEN:
				setRunnerToken(RUNNER_TOKEN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevOpsPackage.PHONE_HOME_RUNNER__RUNNER_TOKEN:
				return RUNNER_TOKEN_EDEFAULT == null ? runnerToken != null : !RUNNER_TOKEN_EDEFAULT.equals(runnerToken);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (runnerToken: ");
		result.append(runnerToken);
		result.append(')');
		return result.toString();
	}

} //PhoneHomeRunnerImpl
