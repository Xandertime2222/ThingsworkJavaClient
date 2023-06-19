import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ThingWorxClient {
    public static void main(String[] args) {
        String url = "https://0b45c.twx.htl.schule/Thingworx/Things/JavaThing_Lieb/Properties/Test";
        String username = "Administrator";
        String password = "odqNP7HfARUiAu";
        String newValue = "Hello World";

        try {
            URL obj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();

            // Set HTTP request method
            conn.setRequestMethod("PUT");

            // Set basic authentication
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));
            String authHeaderValue = "Basic " + new String(encodedAuth);
            conn.setRequestProperty("Authorization", authHeaderValue);

            // Set request content type
            conn.setRequestProperty("Content-Type", "application/json");

            // Set the new value for the property
            String jsonPayload = "{\"Test\":\"" + newValue + "\"}";
            conn.setDoOutput(true);
            conn.getOutputStream().write(jsonPayload.getBytes(StandardCharsets.UTF_8));

            // Send the request
            int responseCode = conn.getResponseCode();

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response Code: " + responseCode);
            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
