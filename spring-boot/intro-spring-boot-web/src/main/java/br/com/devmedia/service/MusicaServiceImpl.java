package br.com.devmedia.service;

import br.com.devmedia.dao.MusicaDao;
import br.com.devmedia.domain.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MusicaServiceImpl implements MusicaService {

    @Autowired
    private MusicaDao musicaDao;

    @Autowired
    private PlaylistService playlistService;

    @Override
    public void salvar(Musica musica, long playlistId) {
        musica.setPlaylist(playlistService.recuperarPorId(playlistId));
        musicaDao.salvar(musica);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Musica> recuperarPorPlaylist(long playlistId) {
        return musicaDao.recuperarPorPlaylist(playlistId);
    }

    @Override
    @Transactional(readOnly = true)
    public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
        return musicaDao.recuperarPorPlaylistIdEMusicaId(playlistId, musicaId);
    }

    @Override
    public void atualizar(Musica musica, long playlistId) {
        musica.setPlaylist(playlistService.recuperarPorId(playlistId));
        musicaDao.atualizar(musica);
    }

    @Override
    public void excluir(long playlistId, long musicaId) {
        musicaDao.excluir(recuperarPorPlaylistIdEMusicaId(playlistId, musicaId).getId());
    }

}
