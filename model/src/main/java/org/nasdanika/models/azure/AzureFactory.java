/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.azure.AzurePackage
 * @generated
 */
public interface AzureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AzureFactory eINSTANCE = org.nasdanika.models.azure.impl.AzureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Management Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Management Group</em>'.
	 * @generated
	 */
	ManagementGroup createManagementGroup();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Resource Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Group</em>'.
	 * @generated
	 */
	ResourceGroup createResourceGroup();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Availability Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Availability Zone</em>'.
	 * @generated
	 */
	AvailabilityZone createAvailabilityZone();

	/**
	 * Returns a new object of class '<em>Region Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Pair</em>'.
	 * @generated
	 */
	RegionPair createRegionPair();

	/**
	 * Returns a new object of class '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workload</em>'.
	 * @generated
	 */
	Workload createWorkload();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AzurePackage getAzurePackage();

} //AzureFactory
