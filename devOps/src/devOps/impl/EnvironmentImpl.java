/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.Environment;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, String>> variables;

	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, String>> artifacts;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, String>> secrets;

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
	public EList<Map.Entry<String, String>> getVariables() {
		if (variables == null) {
			variables = new EObjectResolvingEList<Map.Entry<String, String>>(Entry.class, this, DevOpsPackage.ENVIRONMENT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, String>> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectResolvingEList<Map.Entry<String, String>>(Entry.class, this, DevOpsPackage.ENVIRONMENT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, String>> getSecrets() {
		if (secrets == null) {
			secrets = new EObjectResolvingEList<Map.Entry<String, String>>(Entry.class, this, DevOpsPackage.ENVIRONMENT__SECRETS);
		}
		return secrets;
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
				return getVariables();
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				return getArtifacts();
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				return getSecrets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevOpsPackage.ENVIRONMENT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Map.Entry<String, String>>)newValue);
				return;
			case DevOpsPackage.ENVIRONMENT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Map.Entry<String, String>>)newValue);
				return;
			case DevOpsPackage.ENVIRONMENT__SECRETS:
				getSecrets().clear();
				getSecrets().addAll((Collection<? extends Map.Entry<String, String>>)newValue);
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
