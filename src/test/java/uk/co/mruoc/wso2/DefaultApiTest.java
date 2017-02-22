package uk.co.mruoc.wso2;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    @Test
    public void nameShouldDefaultToEmpty() {
        assertThat(api.getName()).isEmpty();
    }

    @Test
    public void shouldReturnName() {
        String name = "api-name";

        api.setName(name);

        assertThat(api.getName()).isEqualTo(name);
    }

    @Test
    public void versionShouldDefaultToEmpty() {
        assertThat(api.getVersion()).isEmpty();
    }

    @Test
    public void shouldReturnVersion() {
        String version = "v1";

        api.setVersion(version);

        assertThat(api.getVersion()).isEqualTo(version);
    }

    @Test
    public void descriptionShouldDefaultToEmpty() {
        assertThat(api.getDescription()).isEmpty();
    }

    @Test
    public void shouldReturnDescription() {
        String description = "A test API";

        api.setDescription(description);

        assertThat(api.getDescription()).isEqualTo(description);
    }

    @Test
    public void contextShouldDefaultToEmpty() {
        assertThat(api.getContext()).isEmpty();
    }

    @Test
    public void shouldReturnContext() {
        String context = "/product/v1";

        api.setContext(context);

        assertThat(api.getContext()).isEqualTo(context);
    }

    @Test
    public void lastUpdatedShouldDefaultToMinLongDate() {
        assertThat(api.getLastUpdated()).isEqualTo(new DateTime(Long.MIN_VALUE));
    }

    @Test
    public void shouldReturnLastUpdated() {
        DateTime lastUpdated = new DateTime();

        api.setLastUpdated(lastUpdated);

        assertThat(api.getLastUpdated()).isEqualTo(lastUpdated);
    }

    @Test
    public void subscriberCountShouldDefaultToZero() {
        assertThat(api.getSubscriberCount()).isEqualTo(0);
    }

    @Test
    public void shouldReturnSubscriberCount() {
        int subscriberCount = 2;

        api.setSubscriberCount(subscriberCount);

        assertThat(api.getSubscriberCount()).isEqualTo(subscriberCount);
    }

}