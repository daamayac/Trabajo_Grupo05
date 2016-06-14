package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.trabajo_grupo05.R;

public class E6SearchActivity extends AppCompatActivity implements RestTask.ProgressCallback, E6RestTask.ResponseCallback {

    private static final String SEARCH_URI = "https://www.googleapis.com/customsearch/v1?key=%s&cx=%s&q=%s";
    private static final String SEARCH_KEY = "AIzaSyBbW-W1SHCK4eW0kK74VGMLJj_b-byNzkI";
	private static final String SEARCH_CX = "008212991319514020231:1mkouq8yagw";
	private static final String SEARCH_QUERY = "Android";

	private static final String POST_URI = "http://httpbin.org/post";

	private TextView mResult;
	private ProgressDialog mProgress;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        mResult = new TextView(this);
        scrollView.addView(mResult, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        setContentView(scrollView);
        
        //Create the requests
        try{
            //Simple GET
            String url = String.format(SEARCH_URI, SEARCH_KEY, SEARCH_CX, SEARCH_QUERY);
            E6RestTask getTask = E6RestUtil.obtainGetTask(url);
            getTask.setResponseCallback(this);
            //getTask.setProgressCallback(this);
            
            //Simple POST
            List<NameValuePair> parameters = new ArrayList<NameValuePair>();
            parameters.add(new BasicNameValuePair("title", "Android Recipes"));
            parameters.add(new BasicNameValuePair("summary", "Learn Android Quickly"));
            parameters.add(new BasicNameValuePair("authors", "Smith/Friesen"));
            E6RestTask postTask = E6RestUtil.obtainFormPostTask(POST_URI, parameters);
            postTask.setResponseCallback(this);
            //postTask.setProgressCallback(this);
            
            //File POST
            Bitmap image = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
            File imageFile = new File(getExternalCacheDir(), "myImage.png");
            FileOutputStream out = new FileOutputStream(imageFile);
            image.compress(CompressFormat.PNG, 0, out);
            out.flush();
            out.close();   
            List<NameValuePair> fileParameters = new ArrayList<NameValuePair>();
            fileParameters.add(new BasicNameValuePair("title", "Android Recipes"));
            fileParameters.add(new BasicNameValuePair("description", "Image File Upload"));
            E6RestTask uploadTask = E6RestUtil.obtainMultipartPostTask(POST_URI, fileParameters, imageFile, "avatarImage");
            uploadTask.setResponseCallback(this);
            //uploadTask.setProgressCallback(this);
            
            getTask.execute();
            
            //Display progress to the user
            mProgress = ProgressDialog.show(this, "Searching", "Waiting For Results...", true);
        } catch (Exception e) {
            mResult.setText(e.getMessage());
        }
    }
    
	@Override
	public void onProgressUpdate(int progress) {
	    if (progress >= 0) {
	        if (mProgress != null) {
	            mProgress.dismiss();
	            mProgress = null;
	        }
	        //Update user of progress
	        mResult.setText(String.format("Download Progress: %d%%", progress));
	    }
	}
	
	@Override
	public void onRequestSuccess(String response) {
        //Clear progress indicator
        if(mProgress != null) {
            mProgress.dismiss();
        }
        //Process the response data (here we just display it)
        mResult.setText(response);
	}
	
	@Override
	public void onRequestError(Exception error) {
        //Clear progress indicator
        if(mProgress != null) {
            mProgress.dismiss();
        }
        //Process the response data (here we just display it)
        mResult.setText("An Error Occurred: "+error.getMessage());
	}
}