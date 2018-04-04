package br.com.juliorgm.livrosandroid.helper;

import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.EditText;
import br.com.juliorgm.livrosandroid.FormLivrosActivity;
import br.com.juliorgm.livrosandroid.R;
import br.com.juliorgm.livrosandroid.model.Livro;

public class LivroHelper {
    EditText isbn, titulo, edicao;
    Livro livro;
    FloatingActionButton btnExcluir;


    public LivroHelper(Activity activity, Livro livro) {
        this.btnExcluir = activity.findViewById(R.id.DeletarLivro);
        this.isbn = activity.findViewById(R.id.editISBN);
        this.titulo = activity.findViewById(R.id.editTitulo);
        this.edicao = activity.findViewById(R.id.editEdicao);
        this.livro = (livro==null)? new Livro(): carregaCampos(livro);
    }

    public Livro pegaLivro() {
        livro.setIsbn(isbn.getText().toString());
        livro.setTitulo(titulo.getText().toString());
        livro.setEdicao(edicao.getText().toString());
        return livro;
    }

    public Livro carregaCampos(Livro livro) {
        isbn.setEnabled(false);
        btnExcluir.setVisibility(View.VISIBLE);
        isbn.setText(livro.getIsbn());
        titulo.setText(livro.getTitulo());
        edicao.setText(livro.getEdicao());
        return livro;
    }
}
