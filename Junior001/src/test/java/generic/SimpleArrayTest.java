package generic;

import org.junit.Test;

public class SimpleArrayTest {

    @Test
    public void ifUser() {
        UserStore<? extends Base> arrayUser = new UserStore<>(10);
        arrayUser.add(new Role("1") { });
        RoleStore<? extends Role> arrayRole = new RoleStore<>(10);
        arrayRole.add(new Role("2"));
        System.out.println(arrayUser);
        System.out.println(arrayRole);
    }

}