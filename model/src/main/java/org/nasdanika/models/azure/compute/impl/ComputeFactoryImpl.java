/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.azure.compute.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputeFactoryImpl extends EFactoryImpl implements ComputeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComputeFactory init() {
		try {
			ComputeFactory theComputeFactory = (ComputeFactory)EPackage.Registry.INSTANCE.getEFactory(ComputePackage.eNS_URI);
			if (theComputeFactory != null) {
				return theComputeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComputeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeFactoryImpl() {
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
			case ComputePackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case ComputePackage.DISK: return createDisk();
			case ComputePackage.DISK_TYPE: return createDiskType();
			case ComputePackage.VIRTUAL_MACHINE_SIZE: return createVirtualMachineSize();
			case ComputePackage.VIRTUAL_MACHINE_IMAGE: return createVirtualMachineImage();
			case ComputePackage.VIRTUAL_MACHINE_SCALE_SET: return createVirtualMachineScaleSet();
			case ComputePackage.APP_SERVICE: return createAppService();
			case ComputePackage.CONTAINER_INSTANCE: return createContainerInstance();
			case ComputePackage.KUBERNETES_SERVICE: return createKubernetesService();
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
	public VirtualMachine createVirtualMachine() {
		VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disk createDisk() {
		DiskImpl disk = new DiskImpl();
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiskType createDiskType() {
		DiskTypeImpl diskType = new DiskTypeImpl();
		return diskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachineSize createVirtualMachineSize() {
		VirtualMachineSizeImpl virtualMachineSize = new VirtualMachineSizeImpl();
		return virtualMachineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachineImage createVirtualMachineImage() {
		VirtualMachineImageImpl virtualMachineImage = new VirtualMachineImageImpl();
		return virtualMachineImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachineScaleSet createVirtualMachineScaleSet() {
		VirtualMachineScaleSetImpl virtualMachineScaleSet = new VirtualMachineScaleSetImpl();
		return virtualMachineScaleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppService createAppService() {
		AppServiceImpl appService = new AppServiceImpl();
		return appService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInstance createContainerInstance() {
		ContainerInstanceImpl containerInstance = new ContainerInstanceImpl();
		return containerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesService createKubernetesService() {
		KubernetesServiceImpl kubernetesService = new KubernetesServiceImpl();
		return kubernetesService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputePackage getComputePackage() {
		return (ComputePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComputePackage getPackage() {
		return ComputePackage.eINSTANCE;
	}

} //ComputeFactoryImpl
