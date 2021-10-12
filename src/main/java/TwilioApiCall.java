import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;



import java.net.URI;
import java.math.BigDecimal;


public class TwilioApiCall {


        public static final String ACCOUNT_SID = "AC12ad52984cb5606a406cf2e12e9ec38e";
        public static final String AUTH_TOKEN = "[368da7f37991e1f4db3bc879c6ecce80]";

        public static void main(String[] args) {

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber("+447539733870"),
                    "MGf183f0f59af79ba1559a4652d2b94a07",
                    "Your Parking fine is overdue, please contact for payment")
                    .create();

            System.out.println(message.getSid());



        }
    }

