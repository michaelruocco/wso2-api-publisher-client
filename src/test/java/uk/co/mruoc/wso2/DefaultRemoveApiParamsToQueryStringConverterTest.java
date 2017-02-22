package uk.co.mruoc.wso2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class DefaultRemoveApiParamsToQueryStringConverterTest {

    private RemoveApiParamsToQueryStringConverter converter = new DefaultRemoveApiParamsToQueryStringConverter();

    private SelectApiParams params = mock(SelectApiParams.class);

    @Test
    public void shouldConvertName() {
        given(params.getName()).willReturn("api-name");

        String queryString = converter.convert(params);

        assertThat(queryString).isEqualTo("?action=removeAPI&name=api-name");
    }

    @Test
    public void shouldConvertVersion() {
        given(params.getVersion()).willReturn("v1");

        String queryString = converter.convert(params);

        assertThat(queryString).isEqualTo("?action=removeAPI&version=v1");
    }

    @Test
    public void shouldConvertProvider() {
        given(params.getProvider()).willReturn("admin");

        String queryString = converter.convert(params);

        assertThat(queryString).isEqualTo("?action=removeAPI&provider=admin");
    }

}