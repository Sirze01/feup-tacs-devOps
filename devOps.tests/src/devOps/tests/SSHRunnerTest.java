/**
 */
package devOps.tests;

import devOps.DevOpsFactory;
import devOps.SSHRunner;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SSH Runner</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SSHRunnerTest extends SelfHostedRunnerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SSHRunnerTest.class);
	}

	/**
	 * Constructs a new SSH Runner test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SSHRunnerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SSH Runner test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SSHRunner getFixture() {
		return (SSHRunner)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DevOpsFactory.eINSTANCE.createSSHRunner());
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

} //SSHRunnerTest
