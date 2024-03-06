package com.agenda.agenda.Controller;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventoService {

    private Map<Long, Evento> eventos = new HashMap<>();
    private Long proximoId = 1L;

    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos.values());
    }

    public Evento buscarEventoPorId(Long id) {
        return eventos.get(id);
    }

    public Evento adicionarEvento(Evento evento) {
        evento.setId(proximoId++);
        eventos.put(evento.getId(), evento);
        return evento;
    }

    public Evento atualizarEvento(Long id, Evento eventoAtualizado) {
        eventoAtualizado.setId(id);
        eventos.put(id, eventoAtualizado);
        return eventoAtualizado;
    }

    public void removerEvento(Long id) {
        eventos.remove(id);
    }
}
