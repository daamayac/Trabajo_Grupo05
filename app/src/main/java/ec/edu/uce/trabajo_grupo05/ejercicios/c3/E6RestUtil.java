package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.util.Base64;

import org.apache.http.NameValuePair;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class E6RestUtil {
    
    public static E6RestTask obtainGetTask(String url)
            throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) (new URL(url))
                .openConnection();

        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoInput(true);

        E6RestTask task = new E6RestTask(connection);
        return task;
    }

    public static E6RestTask obtainAuthenticatedGetTask(String url,
            String username, String password) throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) (new URL(url))
                .openConnection();

        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoInput(true);
        
        attachBasicAuthentication(connection, username, password);
        
        E6RestTask task = new E6RestTask(connection);
        return task;
    }
    
    public static E6RestTask obtainFormPostTask(String url,
            List<NameValuePair> formData) throws MalformedURLException,
            IOException {
        HttpURLConnection connection = (HttpURLConnection) (new URL(url))
                .openConnection();

        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoOutput(true);

        E6RestTask task = new E6RestTask(connection);
        task.setFormBody(formData);

        return task;
    }
    
    public static E6RestTask obtainAuthenticatedFormPostTask(String url,
            List<NameValuePair> formData, String username, String password) throws MalformedURLException,
            IOException {
        HttpURLConnection connection = (HttpURLConnection) (new URL(url))
                .openConnection();

        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoOutput(true);
        
        attachBasicAuthentication(connection, username, password);

        E6RestTask task = new E6RestTask(connection);
        task.setFormBody(formData);

        return task;
    }

    public static E6RestTask obtainMultipartPostTask(String url,
            List<NameValuePair> formPart, File file, String fileName)
            throws MalformedURLException, IOException {
        HttpURLConnection connection = (HttpURLConnection) (new URL(url))
                .openConnection();

        connection.setReadTimeout(10000);
        connection.setConnectTimeout(15000);
        connection.setDoOutput(true);

        E6RestTask task = new E6RestTask(connection);
        task.setFormBody(formPart);
        task.setUploadFile(file, fileName);

        return task;
    }

    private static void attachBasicAuthentication(URLConnection connection, String username, String password) {
        //Add Basic Authentication Headers
        String userpassword = username + ":" + password;
        String encodedAuthorization = Base64.encodeToString(userpassword.getBytes(), Base64.NO_WRAP);
        connection.setRequestProperty("Authorization", "Basic "+
              encodedAuthorization);
    }

}
