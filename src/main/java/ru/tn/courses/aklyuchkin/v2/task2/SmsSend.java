package ru.tn.courses.aklyuchkin.v2.task2;
public class SmsSend extends SmsAbstr {
    private SmsInterface smsInterface;
    public void initiateChannelAndSend(Sms sms) {
        switch (sms.getSmsClassification()) {
            case SMS -> smsInterface = new SmsSentSuccessfully();
            case EMAIL -> smsInterface = new SmsSentSuccessfully();
            case TELEGRAM -> smsInterface = new SmsSentSuccessfully();
        }
        sendSms(sms.getContact(), sms.getMessage());
    }
    @Override
    boolean sendSms(String contact, String message) {smsInterface.sendSms(contact, message);
        return true;
    }
}
