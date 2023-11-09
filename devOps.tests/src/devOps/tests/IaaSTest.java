/**
 */
package devOps.tests;

import devOps.DevOpsFactory;
import devOps.IaaS;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iaa S</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IaaSTest extends RunnerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IaaSTest.class);
	}

	/**
	 * Constructs a new Iaa S test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IaaSTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Iaa S test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IaaS getFixture() {
		return (IaaS)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DevOpsFactory.eINSTANCE.createIaaS());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IaaSTest
