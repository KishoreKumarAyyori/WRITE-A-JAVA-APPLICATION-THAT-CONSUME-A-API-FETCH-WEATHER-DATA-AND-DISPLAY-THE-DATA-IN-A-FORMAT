import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class weather {
    public static void main(String[] args) {
        try {
            // Replace with your own OpenWeatherMap API key
            String apiKey = "39c7075fc16863ec524cf4d51fb173d2";
            String city = "London"; // You can change the city name

            // Create the URL for OpenWeatherMap API
            String urlString = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=6f6dbf2f6f6dbf2f6f6dbf2f6f6dbf2f"
+ city + "&appid=" + apiKey + "&units=metric";
            URL url = new URL(urlString);

            // Establish a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse the response JSON using Gson
            JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
            JsonArray weatherArray = jsonResponse.getAsJsonArray("weather");
            String weatherDescription = weatherArray.get(0).getAsJsonObject().get("description").getAsString();
            double temperature = jsonResponse.getAsJsonObject("main").get("temp").getAsDouble();
            int humidity = jsonResponse.getAsJsonObject("main").get("humidity").getAsInt();
            double windSpeed = jsonResponse.getAsJsonObject("wind").get("speed").getAsDouble();

            // Print the data in a structured format
            System.out.println("Weather in " + city + ":");
            System.out.println("Description: " + weatherDescription);
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Wind Speed: " + windSpeed + " m/s");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
