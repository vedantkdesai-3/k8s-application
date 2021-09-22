package com.k8s.example.k8sapplication;

import java.util.Date;

public class ServerRO {
    private Date serverStartDate;
    private Date refreshNowDate;

    public ServerRO(){

    }

    public ServerRO(Date severStartDate, Date refreshNowDate) {
        this.serverStartDate = severStartDate;
        this.refreshNowDate = refreshNowDate;
    }

    public Date getServerStartDate() {
        return serverStartDate;
    }

    public void setServerStartDate(Date serverStartDate) {
        this.serverStartDate = serverStartDate;
    }

    public Date getRefreshNowDate() {
        return refreshNowDate;
    }

    public void setRefreshNowDate(Date refreshNowDate) {
        this.refreshNowDate = refreshNowDate;
    }

    @Override
    public String toString() {
        return "ServerRO [refreshNowDate=" + refreshNowDate + ", serverStartDate=" + serverStartDate + "]";
    }
    
}
