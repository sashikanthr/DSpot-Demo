package ga;

import static org.junit.jupiter.api.Assertions.*;

class ResourceTest {

    @org.junit.jupiter.api.Test
    void checkExceptionIsThrown() {
        Resource resource = new Resource();
        Activity activity = new Activity();
        activity.setAction("COOK");
        resource.setQuantity(3);
        Exception exception = assertThrows(RuntimeException.class,() -> {
            resource.use(activity,5,5,3);
        });
        assertTrue(exception.getMessage().equals("Resource Not Available"));
    }

    @org.junit.jupiter.api.Test
    void checkResourceIsAllocated() {
        Resource resource = new Resource();
        resource.getAcquiredResource().clear();
        Activity activity = new Activity();
        activity.setAction("COOK");
        resource.setQuantity(3);
        resource.use(activity,2,5,3);
        assertTrue(!resource.getAcquiredResource().isEmpty());
    }
}