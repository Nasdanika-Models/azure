/**
 */
package org.nasdanika.models.azure.storage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.azure.storage.StoragePackage
 * @generated
 */
public interface StorageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorageFactory eINSTANCE = org.nasdanika.models.azure.storage.impl.StorageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	StorageAccount createStorageAccount();

	/**
	 * Returns a new object of class '<em>Blob Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob Storage</em>'.
	 * @generated
	 */
	BlobStorage createBlobStorage();

	/**
	 * Returns a new object of class '<em>Data Lake Storage Gen2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Lake Storage Gen2</em>'.
	 * @generated
	 */
	DataLakeStorageGen2 createDataLakeStorageGen2();

	/**
	 * Returns a new object of class '<em>Azure Files</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Azure Files</em>'.
	 * @generated
	 */
	AzureFiles createAzureFiles();

	/**
	 * Returns a new object of class '<em>Queue Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Storage</em>'.
	 * @generated
	 */
	QueueStorage createQueueStorage();

	/**
	 * Returns a new object of class '<em>Table Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Storage</em>'.
	 * @generated
	 */
	TableStorage createTableStorage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StoragePackage getStoragePackage();

} //StorageFactory
