package com.thiago.filmespopulares.ui.listafilmes;

import java.util.List;

import com.thiago.filmespopulares.data.model.Filme;

public interface ListaFilmesContrato {

    interface ListaFilmesView {

        void mostraFilmes(List<Filme> filmes);

        void mostraErro();
    }

    interface ListaFilmesPresenter {

        void obtemFilmes();

        void destruirView();
    }
}
