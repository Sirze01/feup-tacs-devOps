/**
 */
package devOps.impl;

import devOps.BinaryConditional;
import devOps.DevOpsPackage;
import devOps.LogicOperator;
import devOps.Operand;

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
 * An implementation of the model object '<em><b>Binary Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devOps.impl.BinaryConditionalImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link devOps.impl.BinaryConditionalImpl#getLogicOperator <em>Logic Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryConditionalImpl extends ConditionalImpl implements BinaryConditional {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<Operand> operand;

	/**
	 * The cached value of the '{@link #getLogicOperator() <em>Logic Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicOperator logicOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevOpsPackage.Literals.BINARY_CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operand> getOperand() {
		if (operand == null) {
			operand = new EObjectContainmentEList<Operand>(Operand.class, this, DevOpsPackage.BINARY_CONDITIONAL__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicOperator getLogicOperator() {
		if (logicOperator != null && logicOperator.eIsProxy()) {
			InternalEObject oldLogicOperator = (InternalEObject)logicOperator;
			logicOperator = (LogicOperator)eResolveProxy(oldLogicOperator);
			if (logicOperator != oldLogicOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR, oldLogicOperator, logicOperator));
			}
		}
		return logicOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperator basicGetLogicOperator() {
		return logicOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicOperator(LogicOperator newLogicOperator) {
		LogicOperator oldLogicOperator = logicOperator;
		logicOperator = newLogicOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR, oldLogicOperator, logicOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevOpsPackage.BINARY_CONDITIONAL__OPERAND:
				return ((InternalEList<?>)getOperand()).basicRemove(otherEnd, msgs);
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
			case DevOpsPackage.BINARY_CONDITIONAL__OPERAND:
				return getOperand();
			case DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR:
				if (resolve) return getLogicOperator();
				return basicGetLogicOperator();
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
			case DevOpsPackage.BINARY_CONDITIONAL__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends Operand>)newValue);
				return;
			case DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR:
				setLogicOperator((LogicOperator)newValue);
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
			case DevOpsPackage.BINARY_CONDITIONAL__OPERAND:
				getOperand().clear();
				return;
			case DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR:
				setLogicOperator((LogicOperator)null);
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
			case DevOpsPackage.BINARY_CONDITIONAL__OPERAND:
				return operand != null && !operand.isEmpty();
			case DevOpsPackage.BINARY_CONDITIONAL__LOGIC_OPERATOR:
				return logicOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryConditionalImpl
