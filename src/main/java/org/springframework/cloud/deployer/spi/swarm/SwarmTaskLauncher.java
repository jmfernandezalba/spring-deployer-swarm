package org.springframework.cloud.deployer.spi.swarm;

import org.springframework.cloud.deployer.spi.core.AppDeploymentRequest;
import org.springframework.cloud.deployer.spi.core.RuntimeEnvironmentInfo;
import org.springframework.cloud.deployer.spi.task.TaskLauncher;
import org.springframework.cloud.deployer.spi.task.TaskStatus;

/**
 * Created by adrienplagnol on 09/12/2016.
 */
// FIXME implement this maybe
public class SwarmTaskLauncher implements TaskLauncher {

    @Override
    public String launch(AppDeploymentRequest request) {
        return "not_implemented";
    }

    @Override
    public void cancel(String id) {
    }

    @Override
    public TaskStatus status(String id) {
        return null;
    }

    @Override
    public void cleanup(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void destroy(String appName) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public RuntimeEnvironmentInfo environmentInfo() {
        // TODO Auto-generated method stub
        return null;
    }
}
