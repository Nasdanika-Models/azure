/**
 */
package org.nasdanika.models.azure.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.azure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureFactoryImpl extends EFactoryImpl implements AzureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AzureFactory init() {
		try {
			AzureFactory theAzureFactory = (AzureFactory)EPackage.Registry.INSTANCE.getEFactory(AzurePackage.eNS_URI);
			if (theAzureFactory != null) {
				return theAzureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AzureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureFactoryImpl() {
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
			case AzurePackage.MANAGEMENT_GROUP: return createManagementGroup();
			case AzurePackage.SUBSCRIPTION: return createSubscription();
			case AzurePackage.RESOURCE_GROUP: return createResourceGroup();
			case AzurePackage.REGION: return createRegion();
			case AzurePackage.AVAILABILITY_ZONE: return createAvailabilityZone();
			case AzurePackage.REGION_PAIR: return createRegionPair();
			case AzurePackage.WORKLOAD: return createWorkload();
			case AzurePackage.TAG: return (EObject)createTag();
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
	public ManagementGroup createManagementGroup() {
		ManagementGroupImpl managementGroup = new ManagementGroupImpl();
		return managementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceGroup createResourceGroup() {
		ResourceGroupImpl resourceGroup = new ResourceGroupImpl();
		return resourceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AvailabilityZone createAvailabilityZone() {
		AvailabilityZoneImpl availabilityZone = new AvailabilityZoneImpl();
		return availabilityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionPair createRegionPair() {
		RegionPairImpl regionPair = new RegionPairImpl();
		return regionPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workload createWorkload() {
		WorkloadImpl workload = new WorkloadImpl();
		return workload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AzurePackage getAzurePackage() {
		return (AzurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AzurePackage getPackage() {
		return AzurePackage.eINSTANCE;
	}

} //AzureFactoryImpl
