package lindan.nyspd.orm.engine.php5;

import lindan.nyspd.orm.engine.IClassToString;
import lindan.nyspd.orm.engine.php5.models.Php5Class;
import lindan.nyspd.orm.engine.php5.models.Php5ClassMember;
import lindan.nyspd.orm.engine.php5.models.PhpNameSpace;

/*
 * @author
 * interfaz que define que metodo debe tener una clase que recibe un phpclass para convertirlo a codigo php
 */
public interface IPhpClassToString extends IClassToString{
	void setStringToPackage(PhpNameSpace phpNameSpace);
	void setString(Php5Class  phpClass);

	String writeClass(Php5Class phpClass);

	String writeMembers(Php5ClassMember classMember);

	String generateGetter(Php5ClassMember classMember);

	String generateSetter(Php5ClassMember classMember);
}
