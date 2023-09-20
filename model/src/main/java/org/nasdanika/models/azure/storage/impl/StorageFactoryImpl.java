/**
 */
package org.nasdanika.models.azure.storage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.azure.storage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorageFactoryImpl extends EFactoryImpl implements StorageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StorageFactory init() {
		try {
			StorageFactory theStorageFactory = (StorageFactory)EPackage.Registry.INSTANCE.getEFactory(StoragePackage.eNS_URI);
			if (theStorageFactory != null) {
				return theStorageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StorageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StoragePackage.STORAGE_ACCOUNT: return createStorageAccount();
			case StoragePackage.BLOB_STORAGE: return createBlobStorage();
			case StoragePackage.DATA_LAKE_STORAGE_GEN2: return createDataLakeStorageGen2();
			case StoragePackage.AZURE_FILES: return createAzureFiles();
			case StoragePackage.QUEUE_STORAGE: return createQueueStorage();
			case StoragePackage.TABLE_STORAGE: return createTableStorage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageAccount createStorageAccount() {
		StorageAccountImpl storageAccount = new StorageAccountImpl();
		return storageAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlobStorage createBlobStorage() {
		BlobStorageImpl blobStorage = new BlobStorageImpl();
		return blobStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLakeStorageGen2 createDataLakeStorageGen2() {
		DataLakeStorageGen2Impl dataLakeStorageGen2 = new DataLakeStorageGen2Impl();
		return dataLakeStorageGen2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AzureFiles createAzureFiles() {
		AzureFilesImpl azureFiles = new AzureFilesImpl();
		return azureFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueStorage createQueueStorage() {
		QueueStorageImpl queueStorage = new QueueStorageImpl();
		return queueStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableStorage createTableStorage() {
		TableStorageImpl tableStorage = new TableStorageImpl();
		return tableStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoragePackage getStoragePackage() {
		return (StoragePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StoragePackage getPackage() {
		return StoragePackage.eINSTANCE;
	}

} //StorageFactoryImpl
