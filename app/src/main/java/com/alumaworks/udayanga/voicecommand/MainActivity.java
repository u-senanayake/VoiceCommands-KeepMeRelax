package com.alumaworks.udayanga.voicecommand;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private TextToSpeech tts;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//        Button button= (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                readText();
//            }
//        });
        tts = new TextToSpeech(this, this);
        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //speakOut();
                Intent intent = new Intent(MainActivity.this, TextToSpeechTest.class);
                startActivity(intent);
            }
        });


    }

    public void readText() {
//        File sdcard= Environment.getExternalStorageDirectory();
//        File file= new File(sdcard,Environment.DIRECTORY_DOWNLOADS+"/file.txt");
//        StringBuilder text= new StringBuilder();
//        try{
//            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
//            String line;
//            while((line=bufferedReader.readLine())!=null){
//                text.append(line);
//                text.append('\n');
//            }
//            bufferedReader.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        TextView textView=(TextView)findViewById(R.id.textView);
//        textView.setText(text.toString());

//        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
//                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
//        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
//                getString(R.string.speech_prompt));
//        try {
//            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
//        } catch (ActivityNotFoundException a) {
//            Toast.makeText(getApplicationContext(),
//                    getString(R.string.speech_not_supported),
//                    Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //    @Override
//    public void onDestroy() {
//        // Don't forget to shutdown tts!
//        if (tts != null) {
//            tts.stop();
//            tts.shutdown();
//        }
//        super.onDestroy();
//    }
    @Override
    public void onInit(int status) {
//        if (status == TextToSpeechTest.SUCCESS) {
//
//            int result = tts.setLanguage(Locale.US);
//
//            if (result == TextToSpeechTest.LANG_MISSING_DATA
//                    || result == TextToSpeechTest.LANG_NOT_SUPPORTED) {
//                Log.e("TTS", "This Language is not supported");
//            } else {
//                button.setEnabled(true);
//                speakOut();
//            }
//
//        } else {
//            Log.e("TTS", "Initilization Failed!");
//        }
//
//    }
//    private void speakOut(){
//
//        String text = editText.getText().toString();
//
//        tts.speak(text, TextToSpeechTest.QUEUE_FLUSH, null);
//    }
    }
}