package io.cloudevents.examples.springboot;

public class SnsMessage {
    private String type;
    private String messageId;
    private String topicArn;
    private String subject;
    private String message;
    private String timestamp;
    private String signatureVersion;
    private String signature;
    private String signingCertURL;
    private String unsubscribeURL;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTopicArn() {
        return topicArn;
    }

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSignatureVersion() {
        return signatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSigningCertURL() {
        return signingCertURL;
    }

    public void setSigningCertURL(String signingCertURL) {
        this.signingCertURL = signingCertURL;
    }

    public String getUnsubscribeURL() {
        return unsubscribeURL;
    }

    public void setUnsubscribeURL(String unsubscribeURL) {
        this.unsubscribeURL = unsubscribeURL;
    }

    @Override
    public String toString() {
        return "SnsMessage{" +
            "type='" + type + '\'' +
            ", messageId='" + messageId + '\'' +
            ", topicArn='" + topicArn + '\'' +
            ", subject='" + subject + '\'' +
            ", message='" + message + '\'' +
            ", timestamp='" + timestamp + '\'' +
            ", signatureVersion='" + signatureVersion + '\'' +
            ", signature='" + signature + '\'' +
            ", signingCertURL='" + signingCertURL + '\'' +
            ", unsubscribeURL='" + unsubscribeURL + '\'' +
            '}';
    }
}
