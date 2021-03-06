/**
 */
package essentialIFML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Field#getLabel <em>Label</em>}</li>
 *   <li>{@link essentialIFML.Field#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see essentialIFML.EssentialIFMLPackage#getField_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link essentialIFML.Field#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link essentialIFML.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see essentialIFML.Datatype
	 * @see #setType(Datatype)
	 * @see essentialIFML.EssentialIFMLPackage#getField_Type()
	 * @model
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link essentialIFML.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see essentialIFML.Datatype
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

} // Field
