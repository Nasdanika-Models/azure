/**
 */
package org.nasdanika.models.azure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource which does not have a model class. Generic resources have "kind" (type).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.GenericResource#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getGenericResource()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika label='Generic Resource' description='A resource which does not have a model class. Generic resources have \"kind\" (type).'"
 * @generated
 */
public interface GenericResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.nasdanika.models.azure.AzurePackage#getGenericResource_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.GenericResource#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // GenericResource
