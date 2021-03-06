package uk.co.mruoc.wso2.store.generateapplicationkey;

import org.joda.time.DateTime;

public interface ApplicationKey {

    DateTime getValidityTime();

    String getConsumerKey();

    String getConsumerSecret();

    String getAccessToken();

}
