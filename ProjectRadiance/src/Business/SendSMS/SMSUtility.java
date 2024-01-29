/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SendSMS;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

/**
 *
 * @author Sanskruti  <your.name at your.org>
 */
public class SMSUtility {
   public static final String ACCOUNT_SID = "ACe009688ddd2ca23b51ce0868d6d2e005";
  public static final String AUTH_TOKEN = "4198d9e2d4db0163ae9408c12e00bd30";

  public static void sendSMS(String msg) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(
      new com.twilio.type.PhoneNumber("+18573975119"),
      new com.twilio.type.PhoneNumber("+18778063394"),
      msg)

    .create();

    System.out.println(message.getSid());
  }
}
