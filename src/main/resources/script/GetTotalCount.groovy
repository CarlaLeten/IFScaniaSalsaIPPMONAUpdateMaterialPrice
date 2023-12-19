import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
def Message processData(Message message) {
    map = message.getProperties();
    def zOffset = map.get("offset");
    def zLimit = map.get("limit");
    
    int offset = zOffset as Integer;
    int limit = zLimit as Integer;

    offset = offset + limit;

    message.setProperty("offset", offset.toString());

    return message;
}