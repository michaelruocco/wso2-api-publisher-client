package uk.co.mruoc.wso2.publisher;

import uk.co.mruoc.wso2.publisher.getapi.Api;

public class ApiToSetStatusParamsConverter {

    public DefaultSetStatusParams convert(Api api) {
        DefaultSetStatusParams params = new DefaultSetStatusParams();
        params.setName(api.getName());
        params.setVersion(api.getVersion());
        params.setProvider(api.getProvider());
        return params;
    }

}
