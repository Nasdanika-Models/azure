/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.azure.AzurePackage;

import org.nasdanika.models.azure.networking.NetworkingPackage;

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
 * @see org.nasdanika.models.azure.compute.ComputeFactory
 * @model kind="package"
 * @generated
 */
public interface ComputePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compute";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/azure/compute";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.azure.compute";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputePackage eINSTANCE = org.nasdanika.models.azure.compute.impl.ComputePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__DISKS = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__NETWORK_INTERFACES = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__IMAGE = AzurePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SIZE = AzurePackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.DiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.DiskImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getDisk()
	 * @generated
	 */
	int DISK = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__TYPE = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK__SIZE = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.DiskTypeImpl <em>Disk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.DiskTypeImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getDiskType()
	 * @generated
	 */
	int DISK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE__DISKS = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Disk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISK_TYPE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineSizeImpl <em>Virtual Machine Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineSizeImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineSize()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Virtual Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE__VIRTUAL_MACHINES = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Machine Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SIZE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImageImpl <em>Virtual Machine Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineImageImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineImage()
	 * @generated
	 */
	int VIRTUAL_MACHINE_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Virtual Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_IMAGE_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineScaleSetImpl <em>Virtual Machine Scale Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineScaleSetImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineScaleSet()
	 * @generated
	 */
	int VIRTUAL_MACHINE_SCALE_SET = 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__LOCATIONS = VIRTUAL_MACHINE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__RESOURCE_TAGS = VIRTUAL_MACHINE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__DISKS = VIRTUAL_MACHINE__DISKS;

	/**
	 * The feature id for the '<em><b>Network Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__NETWORK_INTERFACES = VIRTUAL_MACHINE__NETWORK_INTERFACES;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__IMAGE = VIRTUAL_MACHINE__IMAGE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET__SIZE = VIRTUAL_MACHINE__SIZE;

	/**
	 * The number of structural features of the '<em>Virtual Machine Scale Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET_FEATURE_COUNT = VIRTUAL_MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Machine Scale Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_SCALE_SET_OPERATION_COUNT = VIRTUAL_MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.AppServiceImpl <em>App Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.AppServiceImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getAppService()
	 * @generated
	 */
	int APP_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The number of structural features of the '<em>App Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>App Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SERVICE_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.ContainerInstanceImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getContainerInstance()
	 * @generated
	 */
	int CONTAINER_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__LOCATIONS = NetworkingPackage.SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__RESOURCE_TAGS = NetworkingPackage.SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__SUBNET = NetworkingPackage.SUBNET_RESOURCE__SUBNET;

	/**
	 * The number of structural features of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_FEATURE_COUNT = NetworkingPackage.SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_OPERATION_COUNT = NetworkingPackage.SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.compute.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.compute.impl.KubernetesServiceImpl
	 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getKubernetesService()
	 * @generated
	 */
	int KUBERNETES_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__LOCATIONS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__RESOURCE_TAGS = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Virtual Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE__VIRTUAL_NETWORK = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK;

	/**
	 * The number of structural features of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_FEATURE_COUNT = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kubernetes Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_SERVICE_OPERATION_COUNT = NetworkingPackage.VIRTUAL_NETWORK_RESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.compute.VirtualMachine#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disks</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachine#getDisks()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Disks();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.azure.compute.VirtualMachine#getNetworkInterfaces <em>Network Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Interfaces</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachine#getNetworkInterfaces()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_NetworkInterfaces();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.compute.VirtualMachine#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachine#getImage()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Image();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.compute.VirtualMachine#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Size</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachine#getSize()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EReference getVirtualMachine_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see org.nasdanika.models.azure.compute.Disk
	 * @generated
	 */
	EClass getDisk();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.compute.Disk#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.models.azure.compute.Disk#getType()
	 * @see #getDisk()
	 * @generated
	 */
	EReference getDisk_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.azure.compute.Disk#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.azure.compute.Disk#getSize()
	 * @see #getDisk()
	 * @generated
	 */
	EAttribute getDisk_Size();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.DiskType <em>Disk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk Type</em>'.
	 * @see org.nasdanika.models.azure.compute.DiskType
	 * @generated
	 */
	EClass getDiskType();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.azure.compute.DiskType#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disks</em>'.
	 * @see org.nasdanika.models.azure.compute.DiskType#getDisks()
	 * @see #getDiskType()
	 * @generated
	 */
	EReference getDiskType_Disks();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.VirtualMachineSize <em>Virtual Machine Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Size</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachineSize
	 * @generated
	 */
	EClass getVirtualMachineSize();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.azure.compute.VirtualMachineSize#getVirtualMachines <em>Virtual Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machines</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachineSize#getVirtualMachines()
	 * @see #getVirtualMachineSize()
	 * @generated
	 */
	EReference getVirtualMachineSize_VirtualMachines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.VirtualMachineImage <em>Virtual Machine Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Image</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachineImage
	 * @generated
	 */
	EClass getVirtualMachineImage();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.azure.compute.VirtualMachineImage#getVirtualMachines <em>Virtual Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Virtual Machines</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachineImage#getVirtualMachines()
	 * @see #getVirtualMachineImage()
	 * @generated
	 */
	EReference getVirtualMachineImage_VirtualMachines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.VirtualMachineScaleSet <em>Virtual Machine Scale Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine Scale Set</em>'.
	 * @see org.nasdanika.models.azure.compute.VirtualMachineScaleSet
	 * @generated
	 */
	EClass getVirtualMachineScaleSet();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.AppService <em>App Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Service</em>'.
	 * @see org.nasdanika.models.azure.compute.AppService
	 * @generated
	 */
	EClass getAppService();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Instance</em>'.
	 * @see org.nasdanika.models.azure.compute.ContainerInstance
	 * @generated
	 */
	EClass getContainerInstance();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.compute.KubernetesService <em>Kubernetes Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Service</em>'.
	 * @see org.nasdanika.models.azure.compute.KubernetesService
	 * @generated
	 */
	EClass getKubernetesService();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComputeFactory getComputeFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__DISKS = eINSTANCE.getVirtualMachine_Disks();

		/**
		 * The meta object literal for the '<em><b>Network Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__NETWORK_INTERFACES = eINSTANCE.getVirtualMachine_NetworkInterfaces();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__IMAGE = eINSTANCE.getVirtualMachine_Image();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE__SIZE = eINSTANCE.getVirtualMachine_Size();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.DiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.DiskImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getDisk()
		 * @generated
		 */
		EClass DISK = eINSTANCE.getDisk();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISK__TYPE = eINSTANCE.getDisk_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISK__SIZE = eINSTANCE.getDisk_Size();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.DiskTypeImpl <em>Disk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.DiskTypeImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getDiskType()
		 * @generated
		 */
		EClass DISK_TYPE = eINSTANCE.getDiskType();

		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISK_TYPE__DISKS = eINSTANCE.getDiskType_Disks();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineSizeImpl <em>Virtual Machine Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineSizeImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineSize()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SIZE = eINSTANCE.getVirtualMachineSize();

		/**
		 * The meta object literal for the '<em><b>Virtual Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_SIZE__VIRTUAL_MACHINES = eINSTANCE.getVirtualMachineSize_VirtualMachines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImageImpl <em>Virtual Machine Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineImageImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineImage()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_IMAGE = eINSTANCE.getVirtualMachineImage();

		/**
		 * The meta object literal for the '<em><b>Virtual Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES = eINSTANCE.getVirtualMachineImage_VirtualMachines();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.VirtualMachineScaleSetImpl <em>Virtual Machine Scale Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.VirtualMachineScaleSetImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getVirtualMachineScaleSet()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE_SCALE_SET = eINSTANCE.getVirtualMachineScaleSet();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.AppServiceImpl <em>App Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.AppServiceImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getAppService()
		 * @generated
		 */
		EClass APP_SERVICE = eINSTANCE.getAppService();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.ContainerInstanceImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getContainerInstance()
		 * @generated
		 */
		EClass CONTAINER_INSTANCE = eINSTANCE.getContainerInstance();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.compute.impl.KubernetesServiceImpl <em>Kubernetes Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.compute.impl.KubernetesServiceImpl
		 * @see org.nasdanika.models.azure.compute.impl.ComputePackageImpl#getKubernetesService()
		 * @generated
		 */
		EClass KUBERNETES_SERVICE = eINSTANCE.getKubernetesService();

	}

} //ComputePackage
