package br.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnGenerateText;
    private TextView text;

    private static List<String> textos;

    static {
        textos = Arrays.asList(new String("As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente."),
                new String("Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer."),
                new String("Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação"),
                new String("A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGenerateText = (Button) findViewById(R.id.btn_new_text);
        text = (TextView) findViewById(R.id.tv_new_text);

        btnGenerateText.setOnClickListener((View view) -> {
            final String texto = this.getText();

            if (!text.getText().equals(texto)) {
                text.setText(texto);
            }

        });
    }

    private String getText() {
        return textos.get(new Random().nextInt(textos.size()));
    }
}
