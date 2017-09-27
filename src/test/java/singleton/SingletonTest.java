package singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {


    @Test
    public void singletonInstanceAreEqual(){

        SingleObject object = SingleObject.getInstance();

        SingleObject object1 = SingleObject.getInstance();

        Assert.assertEquals(object, object1);
        Assert.assertEquals(object.showMessage(), object1.showMessage());

    }
}
