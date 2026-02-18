package br.com.rafaellbarros.vt;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;

@Slf4j
public class ExecucaoNormal {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            new Processo().executar(i).run();
        }

        log.info("{} segundos", Duration.ofMillis(System.currentTimeMillis() - tempoInicio).toSeconds());
    }
}
