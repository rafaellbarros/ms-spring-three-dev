package br.com.rafaellbarros.vt;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class Processo {

    public Runnable executar(int processoId) {
        return () -> {

            log.info("{} Executando processo: {}", Thread.currentThread(), processoId);

            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            log.info("{} Processo finalizado: {}", Thread.currentThread(), processoId);
        };
    }
}
