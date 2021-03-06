package com.slack.api.methods;

public interface SlackApiTextResponse extends SlackApiResponse {

    boolean isOk();

    void setOk(boolean isOk);

    String getWarning();

    void setWarning(String warning);

    String getError();

    void setError(String error);

    // only when having a permission error

    String getNeeded();

    void setNeeded(String needed);

    String getProvided();

    void setProvided(String provided);

}
