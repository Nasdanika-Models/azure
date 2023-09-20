/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.azure.AzurePackage;

import org.nasdanika.models.azure.compute.AppService;
import org.nasdanika.models.azure.compute.ComputeFactory;
import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.ContainerInstance;
import org.nasdanika.models.azure.compute.Disk;
import org.nasdanika.models.azure.compute.DiskType;
import org.nasdanika.models.azure.compute.KubernetesService;
import org.nasdanika.models.azure.compute.VirtualMachine;
import org.nasdanika.models.azure.compute.VirtualMachineImage;
import org.nasdanika.models.azure.compute.VirtualMachineScaleSet;
import org.nasdanika.models.azure.compute.VirtualMachineSize;

import org.nasdanika.models.azure.impl.AzurePackageImpl;

import org.nasdanika.models.azure.networking.NetworkingPackage;

import org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl;

import org.nasdanika.models.azure.storage.StoragePackage;

import org.nasdanika.models.azure.storage.impl.StoragePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputePackageImpl extends EPackageImpl implements ComputePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineScaleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kubernetesServiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.azure.compute.ComputePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComputePackageImpl() {
		super(eNS_URI, ComputeFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComputePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComputePackage init() {
		if (isInited) return (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComputePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComputePackageImpl theComputePackage = registeredComputePackage instanceof ComputePackageImpl ? (ComputePackageImpl)registeredComputePackage : new ComputePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AzurePackage.eNS_URI);
		AzurePackageImpl theAzurePackage = (AzurePackageImpl)(registeredPackage instanceof AzurePackageImpl ? registeredPackage : AzurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);

		// Create package meta-data objects
		theComputePackage.createPackageContents();
		theAzurePackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theStoragePackage.createPackageContents();

		// Initialize created meta-data
		theComputePackage.initializePackageContents();
		theAzurePackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComputePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComputePackage.eNS_URI, theComputePackage);
		return theComputePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_Disks() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_NetworkInterfaces() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_Image() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachine_Size() {
		return (EReference)virtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisk_Type() {
		return (EReference)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisk_Size() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiskType() {
		return diskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiskType_Disks() {
		return (EReference)diskTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualMachineSize() {
		return virtualMachineSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachineSize_VirtualMachines() {
		return (EReference)virtualMachineSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualMachineImage() {
		return virtualMachineImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualMachineImage_VirtualMachines() {
		return (EReference)virtualMachineImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualMachineScaleSet() {
		return virtualMachineScaleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppService() {
		return appServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerInstance() {
		return containerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKubernetesService() {
		return kubernetesServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeFactory getComputeFactory() {
		return (ComputeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__DISKS);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__NETWORK_INTERFACES);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__IMAGE);
		createEReference(virtualMachineEClass, VIRTUAL_MACHINE__SIZE);

		diskEClass = createEClass(DISK);
		createEReference(diskEClass, DISK__TYPE);
		createEAttribute(diskEClass, DISK__SIZE);

		diskTypeEClass = createEClass(DISK_TYPE);
		createEReference(diskTypeEClass, DISK_TYPE__DISKS);

		virtualMachineSizeEClass = createEClass(VIRTUAL_MACHINE_SIZE);
		createEReference(virtualMachineSizeEClass, VIRTUAL_MACHINE_SIZE__VIRTUAL_MACHINES);

		virtualMachineImageEClass = createEClass(VIRTUAL_MACHINE_IMAGE);
		createEReference(virtualMachineImageEClass, VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES);

		virtualMachineScaleSetEClass = createEClass(VIRTUAL_MACHINE_SCALE_SET);

		appServiceEClass = createEClass(APP_SERVICE);

		containerInstanceEClass = createEClass(CONTAINER_INSTANCE);

		kubernetesServiceEClass = createEClass(KUBERNETES_SERVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AzurePackage theAzurePackage = (AzurePackage)EPackage.Registry.INSTANCE.getEPackage(AzurePackage.eNS_URI);
		NetworkingPackage theNetworkingPackage = (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualMachineEClass.getESuperTypes().add(theAzurePackage.getResource());
		diskEClass.getESuperTypes().add(theAzurePackage.getResource());
		diskTypeEClass.getESuperTypes().add(theAzurePackage.getAzureElement());
		virtualMachineSizeEClass.getESuperTypes().add(theAzurePackage.getAzureElement());
		virtualMachineImageEClass.getESuperTypes().add(theAzurePackage.getAzureElement());
		virtualMachineScaleSetEClass.getESuperTypes().add(this.getVirtualMachine());
		appServiceEClass.getESuperTypes().add(theAzurePackage.getResource());
		containerInstanceEClass.getESuperTypes().add(theNetworkingPackage.getSubnetResource());
		kubernetesServiceEClass.getESuperTypes().add(theNetworkingPackage.getVirtualNetworkResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachine_Disks(), this.getDisk(), null, "disks", null, 0, -1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_NetworkInterfaces(), theNetworkingPackage.getNetworkInterface(), null, "networkInterfaces", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Image(), this.getVirtualMachineImage(), null, "image", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualMachine_Size(), this.getVirtualMachineSize(), null, "size", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diskEClass, Disk.class, "Disk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisk_Type(), this.getDiskType(), null, "type", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diskTypeEClass, DiskType.class, "DiskType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiskType_Disks(), this.getDisk(), null, "disks", null, 0, -1, DiskType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineSizeEClass, VirtualMachineSize.class, "VirtualMachineSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachineSize_VirtualMachines(), this.getVirtualMachine(), null, "virtualMachines", null, 0, -1, VirtualMachineSize.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineImageEClass, VirtualMachineImage.class, "VirtualMachineImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualMachineImage_VirtualMachines(), this.getVirtualMachine(), null, "virtualMachines", null, 0, -1, VirtualMachineImage.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineScaleSetEClass, VirtualMachineScaleSet.class, "VirtualMachineScaleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(appServiceEClass, AppService.class, "AppService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerInstanceEClass, ContainerInstance.class, "ContainerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kubernetesServiceEClass, KubernetesService.class, "KubernetesService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (virtualMachineEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10021-icon-service-Virtual-Machine.svg",
			   "label", "Virtual Machine",
			   "documentation-reference", "doc/virtual-machine.md",
			   "description", "An image service instance that provides on-demand and scalable computing resources with usage-based pricing"
		   });
		addAnnotation
		  (getVirtualMachine_Image(),
		   source,
		   new String[] {
			   "opposite", "virtualMachines"
		   });
		addAnnotation
		  (getVirtualMachine_Size(),
		   source,
		   new String[] {
			   "opposite", "virtualMachines"
		   });
		addAnnotation
		  (diskEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10032-icon-service-Disks.svg",
			   "documentation-reference", "doc/disk.md",
			   "description", "A block-level storage volume managed by Azure and used with Azure Virtual Machines"
		   });
		addAnnotation
		  (getDisk_Type(),
		   source,
		   new String[] {
			   "opposite", "virtualMachines"
		   });
		addAnnotation
		  (diskTypeEClass,
		   source,
		   new String[] {
			   "label", "Disk Type",
			   "documentation-reference", "doc/disk-type.md",
			   "description", "Azure managed disks currently offers five disk types, each intended to address a specific customer scenario"
		   });
		addAnnotation
		  (virtualMachineSizeEClass,
		   source,
		   new String[] {
			   "label", "Virtual Machine Size",
			   "documentation-reference", "doc/virtual-machine-size.md",
			   "description", "Size of a virtual machine in terms of CPU and RAM"
		   });
		addAnnotation
		  (virtualMachineImageEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10040-icon-service-VM-Images-(Classic).svg",
			   "label", "Virtual Machine Image",
			   "documentation-reference", "doc/virtual-machine-image.md",
			   "description", "Initial contents of a VM disk used to initialize a VM"
		   });
		addAnnotation
		  (virtualMachineScaleSetEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10034-icon-service-VM-Scale-Sets.svg",
			   "label", "Virtual Machine Scale Set",
			   "documentation-reference", "doc/virtual-machine-scale-set.md",
			   "description", "Azure virtual machine scale sets let you create and manage a group of identical, load balanced VMs."
		   });
		addAnnotation
		  (appServiceEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10035-icon-service-App-Services.svg",
			   "label", "App Service",
			   "documentation-reference", "doc/app-service.md",
			   "description", "An HTTP-based service for hosting web applications, REST APIs, and mobile back ends."
		   });
		addAnnotation
		  (containerInstanceEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10104-icon-service-Container-Instances.svg",
			   "label", "Container Instance",
			   "documentation-reference", "doc/container-instance.md",
			   "description", "Azure Container Instances (ACI) allows you to quickly and easily run containers on Azure without managing servers or having to learn new tools"
		   });
		addAnnotation
		  (kubernetesServiceEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10023-icon-service-Kubernetes-Services.svg",
			   "label", "Kubernetes Service",
			   "documentation-reference", "doc/kubernetes-service.md",
			   "description", "Azure Kubernetes Service (AKS) offers the quickest way to start developing and deploying cloud-native apps in Azure, datacenters, or at the edge with built-in code-to-cloud pipelines and guardrails"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getDisk_Size(),
		   source,
		   new String[] {
			   "documentation", "Disk size in gigabytes"
		   });
		addAnnotation
		  (getDiskType_Disks(),
		   source,
		   new String[] {
			   "documentation", "Computed opposite to Disk.type"
		   });
		addAnnotation
		  (getVirtualMachineSize_VirtualMachines(),
		   source,
		   new String[] {
			   "documentation", "Computed opposite to VirtualMachine.size"
		   });
		addAnnotation
		  (getVirtualMachineImage_VirtualMachines(),
		   source,
		   new String[] {
			   "documentation", "Computed opposite to VirtualMachine.image"
		   });
	}

} //ComputePackageImpl
