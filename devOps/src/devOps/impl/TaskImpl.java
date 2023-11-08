/**
 */
package devOps.impl;

import devOps.Conditional;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.TaskImpl#getStep <em>Step</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#isAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getTaskImports <em>Task Imports</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getRunner <em>Runner</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link devOps.impl.TaskImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

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
	 * The default value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFailure = ALLOW_FAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskImports() <em>Task Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> taskImports;

	/**
	 * The cached value of the '{@link #getRunner() <em>Runner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected Runner runner;

	/**
	 * The cached value of the '{@link #getConditional() <em>Conditional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditional()
	 * @generated
	 * @ordered
	 */
	protected Conditional conditional;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, DevOpsPackage.TASK__STEP);
		}
		return step;
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
	public boolean isAllowFailure() {
		return allowFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFailure(boolean newAllowFailure) {
		boolean oldAllowFailure = allowFailure;
		allowFailure = newAllowFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__ALLOW_FAILURE, oldAllowFailure, allowFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTaskImports() {
		if (taskImports == null) {
			taskImports = new EObjectResolvingEList<Task>(Task.class, this, DevOpsPackage.TASK__TASK_IMPORTS);
		}
		return taskImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runner getRunner() {
		if (runner != null && runner.eIsProxy()) {
			InternalEObject oldRunner = (InternalEObject)runner;
			runner = (Runner)eResolveProxy(oldRunner);
			if (runner != oldRunner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevOpsPackage.TASK__RUNNER, oldRunner, runner));
			}
		}
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runner basicGetRunner() {
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunner(Runner newRunner) {
		Runner oldRunner = runner;
		runner = newRunner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__RUNNER, oldRunner, runner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conditional getConditional() {
		if (conditional != null && conditional.eIsProxy()) {
			InternalEObject oldConditional = (InternalEObject)conditional;
			conditional = (Conditional)eResolveProxy(oldConditional);
			if (conditional != oldConditional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevOpsPackage.TASK__CONDITIONAL, oldConditional, conditional));
			}
		}
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional basicGetConditional() {
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditional(Conditional newConditional) {
		Conditional oldConditional = conditional;
		conditional = newConditional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__CONDITIONAL, oldConditional, conditional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevOpsPackage.TASK__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case DevOpsPackage.TASK__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case DevOpsPackage.TASK__STEP:
				return getStep();
			case DevOpsPackage.TASK__ENVIRONMENT:
				return getEnvironment();
			case DevOpsPackage.TASK__ALLOW_FAILURE:
				return isAllowFailure();
			case DevOpsPackage.TASK__TASK_IMPORTS:
				return getTaskImports();
			case DevOpsPackage.TASK__RUNNER:
				if (resolve) return getRunner();
				return basicGetRunner();
			case DevOpsPackage.TASK__CONDITIONAL:
				if (resolve) return getConditional();
				return basicGetConditional();
			case DevOpsPackage.TASK__NAME:
				return getName();
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
			case DevOpsPackage.TASK__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case DevOpsPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case DevOpsPackage.TASK__ALLOW_FAILURE:
				setAllowFailure((Boolean)newValue);
				return;
			case DevOpsPackage.TASK__TASK_IMPORTS:
				getTaskImports().clear();
				getTaskImports().addAll((Collection<? extends Task>)newValue);
				return;
			case DevOpsPackage.TASK__RUNNER:
				setRunner((Runner)newValue);
				return;
			case DevOpsPackage.TASK__CONDITIONAL:
				setConditional((Conditional)newValue);
				return;
			case DevOpsPackage.TASK__NAME:
				setName((String)newValue);
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
			case DevOpsPackage.TASK__STEP:
				getStep().clear();
				return;
			case DevOpsPackage.TASK__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case DevOpsPackage.TASK__ALLOW_FAILURE:
				setAllowFailure(ALLOW_FAILURE_EDEFAULT);
				return;
			case DevOpsPackage.TASK__TASK_IMPORTS:
				getTaskImports().clear();
				return;
			case DevOpsPackage.TASK__RUNNER:
				setRunner((Runner)null);
				return;
			case DevOpsPackage.TASK__CONDITIONAL:
				setConditional((Conditional)null);
				return;
			case DevOpsPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
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
			case DevOpsPackage.TASK__STEP:
				return step != null && !step.isEmpty();
			case DevOpsPackage.TASK__ENVIRONMENT:
				return environment != null;
			case DevOpsPackage.TASK__ALLOW_FAILURE:
				return allowFailure != ALLOW_FAILURE_EDEFAULT;
			case DevOpsPackage.TASK__TASK_IMPORTS:
				return taskImports != null && !taskImports.isEmpty();
			case DevOpsPackage.TASK__RUNNER:
				return runner != null;
			case DevOpsPackage.TASK__CONDITIONAL:
				return conditional != null;
			case DevOpsPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (allowFailure: ");
		result.append(allowFailure);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
