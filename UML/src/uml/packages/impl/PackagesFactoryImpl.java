/**
 */
package uml.packages.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.packages.Extension;
import uml.packages.ExtensionEnd;
import uml.packages.Image;
import uml.packages.Model;
import uml.packages.PackageMerge;
import uml.packages.PackagesFactory;
import uml.packages.PackagesPackage;
import uml.packages.Profile;
import uml.packages.ProfileApplication;
import uml.packages.Stereotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagesFactoryImpl extends EFactoryImpl implements PackagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PackagesFactory init() {
		try {
			PackagesFactory thePackagesFactory = (PackagesFactory)EPackage.Registry.INSTANCE.getEFactory(PackagesPackage.eNS_URI);
			if (thePackagesFactory != null) {
				return thePackagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PackagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesFactoryImpl() {
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
			case PackagesPackage.EXTENSION: return createExtension();
			case PackagesPackage.EXTENSION_END: return createExtensionEnd();
			case PackagesPackage.STEREOTYPE: return createStereotype();
			case PackagesPackage.IMAGE: return createImage();
			case PackagesPackage.PROFILE: return createProfile();
			case PackagesPackage.MODEL: return createModel();
			case PackagesPackage.PACKAGE_MERGE: return createPackageMerge();
			case PackagesPackage.PROFILE_APPLICATION: return createProfileApplication();
			case PackagesPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionEnd createExtensionEnd() {
		ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
		return extensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createStereotype() {
		StereotypeImpl stereotype = new StereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge() {
		PackageMergeImpl packageMerge = new PackageMergeImpl();
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagesPackage getPackagesPackage() {
		return (PackagesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PackagesPackage getPackage() {
		return PackagesPackage.eINSTANCE;
	}

} //PackagesFactoryImpl
