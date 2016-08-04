package com.dianping.pigeon.governor.service;

import com.dianping.pigeon.governor.model.ServiceNode;

import java.util.List;

/**
 * Created by chenchongze on 16/7/6.
 */
public interface ServiceNodeService {

    public boolean publishService(String projectName, String serviceName, String group,
                                 String ip, String port, String updatezk);

    public boolean unpublishService(String serviceName, String group,
                                   String ip, String port, String updatezk);

    public ServiceNode getServiceNode(String serviceName, String group, String ip, String port);

    public List<ServiceNode> retrieveAllByProjectName(String projectName);

    public int createServiceNode(ServiceNode serviceNode);

    public int deleteServiceNodeById(ServiceNode serviceNode);

    public List<ServiceNode> retrieveAll();

    public int deleteServiceNode(String serviceName, String group, String ip, String port);
}