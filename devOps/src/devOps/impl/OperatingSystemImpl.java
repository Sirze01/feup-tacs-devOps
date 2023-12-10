/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.OperatingSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.OperatingSystemImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link devOps.impl.OperatingSystemImpl#getOsName <em>Os Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends IaaSImpl implements OperatingSystem {
	/**
	 * The default value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected static final String SHELL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected String shell = SHELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsName() <em>Os Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsName()
	 * @generated
	 * @ordered
	 */
	protected String osName = OS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.OPERATING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(String newShell) {
		String oldShell = shell;
		shell = newShell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.OPERATING_SYSTEM__SHELL, oldShell, shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOsName() {
		return osName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOsName(String newOsName) {
		String oldOsName = osName;
		osName = newOsName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.OPERATING_SYSTEM__OS_NAME, oldOsName, osName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevOpsPackage.OPERATING_SYSTEM__SHELL:
				return getShell();
			case DevOpsPackage.OPERATING_SYSTEM__OS_NAME:
				return getOsName();
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
			case DevOpsPackage.OPERATING_SYSTEM__SHELL:
				setShell((String)newValue);
				return;
			case DevOpsPackage.OPERATING_SYSTEM__OS_NAME:
				setOsName((String)newValue);
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
			case DevOpsPackage.OPERATING_SYSTEM__SHELL:
				setShell(SHELL_EDEFAULT);
				return;
			case DevOpsPackage.OPERATING_SYSTEM__OS_NAME:
				setOsName(OS_NAME_EDEFAULT);
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
			case DevOpsPackage.OPERATING_SYSTEM__SHELL:
				return SHELL_EDEFAULT == null ? shell != null : !SHELL_EDEFAULT.equals(shell);
			case DevOpsPackage.OPERATING_SYSTEM__OS_NAME:
				return OS_NAME_EDEFAULT == null ? osName != null : !OS_NAME_EDEFAULT.equals(osName);
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
		result.append(" (shell: ");
		result.append(shell);
		result.append(", osName: ");
		result.append(osName);
		result.append(')');
		return result.toString();
	}

} //OperatingSystemImpl
