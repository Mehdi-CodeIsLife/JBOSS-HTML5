package rt.beans;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-09-11T14:02:15.750-0400")
@StaticMetamodel(Member.class)
public class Member_ {
	public static volatile SingularAttribute<Member, Long> id;
	public static volatile SingularAttribute<Member, String> name;
	public static volatile SingularAttribute<Member, String> email;
	public static volatile SingularAttribute<Member, String> phoneNumber;
}
