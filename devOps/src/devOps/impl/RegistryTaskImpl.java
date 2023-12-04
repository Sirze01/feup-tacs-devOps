/**
 */
package devOps.impl;

import devOps.Conditional;
import devOps.DevOpsPackage;
import devOps.RegistryTask;

import devOps.Step;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registry Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.RegistryTaskImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link devOps.impl.RegistryTaskImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link devOps.impl.RegistryTaskImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistryTaskImpl extends DevOpsTaskImpl implements RegistryTask {
	/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Conditional conditional;

	/**
	 * The default value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected String cmd = CMD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistryTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.REGISTRY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditional getConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(Conditional newConditional, NotificationChain msgs) {
		Conditional oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevOpsPackage.REGISTRY_TASK__CONDITIONAL, oldConditional, newConditional);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditional(Conditional newConditional) {
		if (newConditional != conditional) {
			NotificationChain msgs = null;
			if (conditional != null)
				msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.REGISTRY_TASK__CONDITIONAL, null, msgs);
			if (newConditional != null)
				msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.REGISTRY_TASK__CONDITIONAL, null, msgs);
			msgs = basicSetConditional(newConditional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.REGISTRY_TASK__CONDITIONAL, newConditional, newConditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmd(String newCmd) {
		String oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.REGISTRY_TASK__CMD, oldCmd, cmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getArguments() {
		if (arguments == null) {
			arguments = new EcoreEMap<String,String>(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, DevOpsPackage.REGISTRY_TASK__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevOpsPackage.REGISTRY_TASK__CONDITIONAL:
				return basicSetConditional(null, msgs);
			case DevOpsPackage.REGISTRY_TASK__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevOpsPackage.REGISTRY_TASK__CONDITIONAL:
				return getConditional();
			case DevOpsPackage.REGISTRY_TASK__CMD:
				return getCmd();
			case DevOpsPackage.REGISTRY_TASK__ARGUMENTS:
				if (coreType) return getArguments();
				else return getArguments().map();
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
			case DevOpsPackage.REGISTRY_TASK__CONDITIONAL:
				setConditional((Conditional)newValue);
				return;
			case DevOpsPackage.REGISTRY_TASK__CMD:
				setCmd((String)newValue);
				return;
			case DevOpsPackage.REGISTRY_TASK__ARGUMENTS:
				((EStructuralFeature.Setting)getArguments()).set(newValue);
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
			case DevOpsPackage.REGISTRY_TASK__CONDITIONAL:
				setConditional((Conditional)null);
				return;
			case DevOpsPackage.REGISTRY_TASK__CMD:
				setCmd(CMD_EDEFAULT);
				return;
			case DevOpsPackage.REGISTRY_TASK__ARGUMENTS:
				getArguments().clear();
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
			case DevOpsPackage.REGISTRY_TASK__CONDITIONAL:
				return conditional != null;
			case DevOpsPackage.REGISTRY_TASK__CMD:
				return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
			case DevOpsPackage.REGISTRY_TASK__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case DevOpsPackage.REGISTRY_TASK__CONDITIONAL: return DevOpsPackage.STEP__CONDITIONAL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case DevOpsPackage.STEP__CONDITIONAL: return DevOpsPackage.REGISTRY_TASK__CONDITIONAL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (cmd: ");
		result.append(cmd);
		result.append(')');
		return result.toString();
	}

} //RegistryTaskImpl
