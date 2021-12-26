package ru.tn.courses.aklyuchkin.v2.task2;
public class SmsSentSuccessfully implements SmsInterface {
    @Override
    public void sendSms(String contact, String message) {System.out.println("Сообщение успешно отправлено");}
}