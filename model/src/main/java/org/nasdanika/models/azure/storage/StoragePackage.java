/**
 */
package org.nasdanika.models.azure.storage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.nasdanika.models.azure.AzurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.azure.storage.StorageFactory
 * @model kind="package"
 * @generated
 */
public interface StoragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "storage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/azure/storage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.azure.storage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoragePackage eINSTANCE = org.nasdanika.models.azure.storage.impl.StoragePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.StorageAccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.StorageAccountImpl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getStorageAccount()
	 * @generated
	 */
	int STORAGE_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ACCOUNT_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.BlobStorageImpl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getBlobStorage()
	 * @generated
	 */
	int BLOB_STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Blob Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blob Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_STORAGE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.DataLakeStorageGen2Impl <em>Data Lake Storage Gen2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.DataLakeStorageGen2Impl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getDataLakeStorageGen2()
	 * @generated
	 */
	int DATA_LAKE_STORAGE_GEN2 = 2;

	/**
	 * The number of structural features of the '<em>Data Lake Storage Gen2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Lake Storage Gen2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LAKE_STORAGE_GEN2_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.AzureFilesImpl <em>Azure Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.AzureFilesImpl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getAzureFiles()
	 * @generated
	 */
	int AZURE_FILES = 3;

	/**
	 * The number of structural features of the '<em>Azure Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Azure Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_FILES_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.QueueStorageImpl <em>Queue Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.QueueStorageImpl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getQueueStorage()
	 * @generated
	 */
	int QUEUE_STORAGE = 4;

	/**
	 * The number of structural features of the '<em>Queue Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Queue Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_STORAGE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.storage.impl.TableStorageImpl <em>Table Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.storage.impl.TableStorageImpl
	 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getTableStorage()
	 * @generated
	 */
	int TABLE_STORAGE = 5;

	/**
	 * The number of structural features of the '<em>Table Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_STORAGE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.StorageAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.nasdanika.models.azure.storage.StorageAccount
	 * @generated
	 */
	EClass getStorageAccount();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.BlobStorage <em>Blob Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob Storage</em>'.
	 * @see org.nasdanika.models.azure.storage.BlobStorage
	 * @generated
	 */
	EClass getBlobStorage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.DataLakeStorageGen2 <em>Data Lake Storage Gen2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Lake Storage Gen2</em>'.
	 * @see org.nasdanika.models.azure.storage.DataLakeStorageGen2
	 * @generated
	 */
	EClass getDataLakeStorageGen2();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.AzureFiles <em>Azure Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Azure Files</em>'.
	 * @see org.nasdanika.models.azure.storage.AzureFiles
	 * @generated
	 */
	EClass getAzureFiles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.QueueStorage <em>Queue Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Storage</em>'.
	 * @see org.nasdanika.models.azure.storage.QueueStorage
	 * @generated
	 */
	EClass getQueueStorage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.storage.TableStorage <em>Table Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Storage</em>'.
	 * @see org.nasdanika.models.azure.storage.TableStorage
	 * @generated
	 */
	EClass getTableStorage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorageFactory getStorageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.StorageAccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.StorageAccountImpl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getStorageAccount()
		 * @generated
		 */
		EClass STORAGE_ACCOUNT = eINSTANCE.getStorageAccount();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.BlobStorageImpl <em>Blob Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.BlobStorageImpl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getBlobStorage()
		 * @generated
		 */
		EClass BLOB_STORAGE = eINSTANCE.getBlobStorage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.DataLakeStorageGen2Impl <em>Data Lake Storage Gen2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.DataLakeStorageGen2Impl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getDataLakeStorageGen2()
		 * @generated
		 */
		EClass DATA_LAKE_STORAGE_GEN2 = eINSTANCE.getDataLakeStorageGen2();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.AzureFilesImpl <em>Azure Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.AzureFilesImpl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getAzureFiles()
		 * @generated
		 */
		EClass AZURE_FILES = eINSTANCE.getAzureFiles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.QueueStorageImpl <em>Queue Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.QueueStorageImpl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getQueueStorage()
		 * @generated
		 */
		EClass QUEUE_STORAGE = eINSTANCE.getQueueStorage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.storage.impl.TableStorageImpl <em>Table Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.storage.impl.TableStorageImpl
		 * @see org.nasdanika.models.azure.storage.impl.StoragePackageImpl#getTableStorage()
		 * @generated
		 */
		EClass TABLE_STORAGE = eINSTANCE.getTableStorage();

	}

} //StoragePackage
