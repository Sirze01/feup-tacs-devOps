/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.Environment;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.EnvironmentImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link devOps.impl.EnvironmentImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link devOps.impl.EnvironmentImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> variables;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> artifacts;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getVariables() {
		if (variables == null) {
			variables = new EcoreEMap<String,String>(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, DevOpsPackage.ENVIRONMENT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EcoreEMap<String,String>(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, DevOpsPackage.ENVIRONMENT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getSecrets() {
		if (secrets == null) {
			secrets = new EcoreEMap<String,String>(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, DevOpsPackage.ENVIRONMENT__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				return ((InternalEList<?>)getSecrets()).basicRemove(otherEnd, msgs);
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
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				if (coreType) return getVariables();
				else return getVariables().map();
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				if (coreType) return getArtifacts();
				else return getArtifacts().map();
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				if (coreType) return getSecrets();
				else return getSecrets().map();
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
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				((EStructuralFeature.Setting)getVariables()).set(newValue);
				return;
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				((EStructuralFeature.Setting)getArtifacts()).set(newValue);
				return;
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				((EStructuralFeature.Setting)getSecrets()).set(newValue);
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
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				getVariables().clear();
				return;
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				getArtifacts().clear();
				return;
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				getSecrets().clear();
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
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				return secrets != null && !secrets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentImpl
