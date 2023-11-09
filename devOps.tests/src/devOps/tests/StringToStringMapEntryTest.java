/**
 */
package devOps.tests;

import devOps.DevOpsFactory;
import devOps.DevOpsPackage;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String To String Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringToStringMapEntryTest extends TestCase {

	/**
	 * The fixture for this String To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringToStringMapEntryTest.class);
	}

	/**
	 * Constructs a new String To String Map Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToStringMapEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, String> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String To String Map Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, String> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, String>)DevOpsFactory.eINSTANCE.create(DevOpsPackage.Literals.STRING_TO_STRING_MAP_ENTRY));
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

} //StringToStringMapEntryTest
