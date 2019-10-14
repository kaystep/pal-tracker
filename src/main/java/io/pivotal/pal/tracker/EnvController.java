package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {
    private final String port;
    private final String memoryLimit;
    private final String cfInstanceIndex;
    private final String cfInstanceAddress;

    public EnvController(
            @Value("${port:NOT SET}") String port,
            @Value("${memory.limit:NOT SET") String memoryLimit,
            @Value("${cf.instance.index:NOT SET") String cfInstanceIndex,
            @Value("${cf.instance.addr:NOT SET") String CF_INSTANCE_ADDR)
    {
        this.port = port;
        this.memoryLimit = memoryLimit;
        this.cfInstanceIndex = cfInstanceIndex;
        cfInstanceAddress = CF_INSTANCE_ADDR;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv() {
        Map<String, String> env = new HashMap<>();

        env.put("PORT", "8675");
        env.put("MEMORY_LIMIT", "12G");
        env.put("CF_INSTANCE_INDEX", "34");
        env.put("CF_INSTANCE_ADDR", "123.sesame.street");

        return env;
    }
}
