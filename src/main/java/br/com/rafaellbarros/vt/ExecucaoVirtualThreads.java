package br.com.rafaellbarros.vt;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class ExecucaoVirtualThreads {

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 50000; i++) {
                var processo = new Processo().executar(i);
                executorService.submit(processo);
            }
        }

        log.info("{} segundos", Duration.ofMillis(System.currentTimeMillis() - tempoInicio).toSeconds());
    }
}
