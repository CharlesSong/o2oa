/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.processplatform.core.entity.element.Form.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:44:03 CST 2018")
public class Form_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Form,String> alias;
    public static volatile SingularAttribute<Form,String> application;
    public static volatile SingularAttribute<Form,String> data;
    public static volatile SingularAttribute<Form,String> description;
    public static volatile SingularAttribute<Form,Boolean> hasMobile;
    public static volatile SingularAttribute<Form,String> icon;
    public static volatile SingularAttribute<Form,String> id;
    public static volatile SingularAttribute<Form,String> lastUpdatePerson;
    public static volatile SingularAttribute<Form,Date> lastUpdateTime;
    public static volatile SingularAttribute<Form,String> mobileData;
    public static volatile SingularAttribute<Form,String> name;
}
