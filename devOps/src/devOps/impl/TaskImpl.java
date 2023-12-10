/**
 */
package devOps.impl;

import devOps.DevOpsPackage;
import devOps.Environment;
import devOps.Runner;
import devOps.Step;
import devOps.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.TaskImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getRunner <em>Runner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends DevOpsTaskImpl implements Task {
	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getRunner() <em>Runner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected Runner runner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, DevOpsPackage.TASK__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.TASK__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.TASK__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runner getRunner() {
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunner(Runner newRunner, NotificationChain msgs) {
		Runner oldRunner = runner;
		runner = newRunner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__RUNNER, oldRunner, newRunner);
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
	public void setRunner(Runner newRunner) {
		if (newRunner != runner) {
			NotificationChain msgs = null;
			if (runner != null)
				msgs = ((InternalEObject)runner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.TASK__RUNNER, null, msgs);
			if (newRunner != null)
				msgs = ((InternalEObject)newRunner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevOpsPackage.TASK__RUNNER, null, msgs);
			msgs = basicSetRunner(newRunner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__RUNNER, newRunner, newRunner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevOpsPackage.TASK__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case DevOpsPackage.TASK__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case DevOpsPackage.TASK__RUNNER:
				return basicSetRunner(null, msgs);
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
			case DevOpsPackage.TASK__STEPS:
				return getSteps();
			case DevOpsPackage.TASK__ENVIRONMENT:
				return getEnvironment();
			case DevOpsPackage.TASK__RUNNER:
				return getRunner();
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
			case DevOpsPackage.TASK__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case DevOpsPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case DevOpsPackage.TASK__RUNNER:
				setRunner((Runner)newValue);
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
			case DevOpsPackage.TASK__STEPS:
				getSteps().clear();
				return;
			case DevOpsPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case DevOpsPackage.TASK__RUNNER:
				setRunner((Runner)null);
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
			case DevOpsPackage.TASK__STEPS:
				return steps != null && !steps.isEmpty();
			case DevOpsPackage.TASK__ENVIRONMENT:
				return environment != null;
			case DevOpsPackage.TASK__RUNNER:
				return runner != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
