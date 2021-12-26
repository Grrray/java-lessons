package ru.tn.courses.aklyuchkin.v2.task2;


public class Sms {
    private SmsClassification smsClassification;
    private String message;
    private String contact;
    public Sms(SmsClassification messageType, String message, String contact) {
        this.smsClassification = messageType;
        this.contact = contact;
        this.message = message;
    }
    public SmsClassification getSmsClassification() {return smsClassification;}
    public void setSmsClassification(SmsClassification smsClassification) {this.smsClassification = smsClassification;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public void setContact(String contact) {this.contact = contact;}
    public String getContact() {return contact;}
    @Override
    public String toString() {return "Sms{" + "smsClassification = " + smsClassification + ", message = '" + message + '\'' + ", contact '" + contact + '\'' + '}';}
}