/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.SSHRunner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSH Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.SSHRunnerImpl#getSshCredentials <em>Ssh Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSHRunnerImpl extends SelfHostedRunnerImpl implements SSHRunner {
	/**
	 * The default value of the '{@link #getSshCredentials() <em>Ssh Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshCredentials()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_CREDENTIALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSshCredentials() <em>Ssh Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshCredentials()
	 * @generated
	 * @ordered
	 */
	protected String sshCredentials = SSH_CREDENTIALS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSHRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.SSH_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSshCredentials() {
		return sshCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSshCredentials(String newSshCredentials) {
		String oldSshCredentials = sshCredentials;
		sshCredentials = newSshCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.SSH_RUNNER__SSH_CREDENTIALS, oldSshCredentials, sshCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevOpsPackage.SSH_RUNNER__SSH_CREDENTIALS:
				return getSshCredentials();
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
			case DevOpsPackage.SSH_RUNNER__SSH_CREDENTIALS:
				setSshCredentials((String)newValue);
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
			case DevOpsPackage.SSH_RUNNER__SSH_CREDENTIALS:
				setSshCredentials(SSH_CREDENTIALS_EDEFAULT);
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
			case DevOpsPackage.SSH_RUNNER__SSH_CREDENTIALS:
				return SSH_CREDENTIALS_EDEFAULT == null ? sshCredentials != null : !SSH_CREDENTIALS_EDEFAULT.equals(sshCredentials);
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
		result.append(" (sshCredentials: ");
		result.append(sshCredentials);
		result.append(')');
		return result.toString();
	}

} //SSHRunnerImpl
