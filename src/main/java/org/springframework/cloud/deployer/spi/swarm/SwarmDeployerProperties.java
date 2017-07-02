package org.springframework.cloud.deployer.spi.swarm;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by joriscaloud on 12/10/16.
 * Properties for the containers
 */
@ConfigurationProperties(prefix = "spring.cloud.deployer.swarm")
public class SwarmDeployerProperties {
    
    public URI getURI() {
        return (URI.create("https://192.168.99.100:2376"));
    }
    
    /**
     * Memory to allocate for a service
     */
    private Long memory = 512L;

    /**
     * CPU to allocate for a service
     */
    private Long cpu = 500L;

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public Long getCpu() {
        return cpu;
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Path getCertPath() {
        return Paths.get(URI.create("file:///C:/Users/AlasD/.docker/machine/machines/default"));
    }
}
