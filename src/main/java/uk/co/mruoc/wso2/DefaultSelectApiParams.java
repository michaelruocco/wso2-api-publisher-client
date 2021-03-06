package uk.co.mruoc.wso2;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class DefaultSelectApiParams implements SelectApiParams {

    private String name = EMPTY;
    private String version = EMPTY;
    private String provider = EMPTY;

    @Override
    public String getApiName() {
        return name;
    }

    @Override
    public String getApiVersion() {
        return version;
    }

    @Override
    public String getProvider() {
        return provider;
    }

    public void setApiName(String name) {
        this.name = name;
    }

    public void setApiVersion(String version) {
        this.version = version;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
