# ThingsworkJavaClient
# ThingWorxClient

This is a Java program that demonstrates how to update a property value in ThingWorx using the ThingWorx REST API. The program sends an HTTP PUT request to the ThingWorx server with the provided credentials and updates the value of a specific property.

## Prerequisites
- Java Development Kit (JDK) installed
- Internet connectivity
- ThingWorx server access

## Usage
1. Clone the repository or download the `ThingWorxClient.java` file.
2. Open the file in a Java development environment or text editor.
3. Modify the following variables with your own values:
   - `url`: The URL of the ThingWorx property you want to update.
   - `username`: The username used for authentication.
   - `password`: The password associated with the username.
   - `newValue`: The new value you want to set for the property.
4. Save the changes to the file.

## Running the Program
1. Compile the Java source file:
   ```shell
   javac ThingWorxClient.java
   ```
2. Run the compiled program:
   ```shell
   java ThingWorxClient
   ```

## Explanation
1. The program imports necessary Java classes and libraries for making HTTP requests and handling input/output operations.
2. The `main` method is the entry point of the program.
3. The `url`, `username`, `password`, and `newValue` variables hold the necessary information for connecting to the ThingWorx server and updating the property value.
4. The program creates a URL object based on the provided `url`.
5. A `HttpURLConnection` object is opened with the URL connection.
6. The program sets the HTTP request method to `PUT` to update the property value.
7. Basic authentication is set by encoding the `username` and `password` using Base64 and adding the encoded value as an `Authorization` header.
8. The request content type is set to `application/json`.
9. The new value is converted to a JSON payload and written to the request output stream.
10. The request is sent to the ThingWorx server, and the response code is retrieved.
11. The program reads the response from the server and stores it in a `StringBuilder`.
12. The response code and the response itself are printed to the console.
13. If an exception occurs during the process, it is caught and printed to the console.

## Note
Ensure that you have the necessary permissions and correct URL for the property you want to update in ThingWorx. Make sure to handle exceptions appropriately in a production environment.
