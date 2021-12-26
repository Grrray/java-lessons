package ru.tn.courses.aklyuchkin.v2.task2;

public class Main {
    public static void main(String[] args) {
        Sms sms = new Sms(SmsClassification.SMS,"Привет","Вова");
        SmsSend smsSend = new SmsSend();
        smsSend.initiateChannelAndSend(sms);
        sms.setSmsClassification(SmsClassification.EMAIL);
        smsSend.initiateChannelAndSend(sms);
        sms.setSmsClassification(SmsClassification.TELEGRAM);
        smsSend.initiateChannelAndSend(sms);
    }
}
