package com.k8s.example.k8sapplication;

import java.util.Date;

public class ServerRO {
    private Date serverDate;
    private Date refreshDate;

    public ServerRO(){

    }

    public ServerRO(Date severStartDate, Date refreshDate) {
        this.serverDate = severStartDate;
        this.refreshDate = refreshDate;
    }

    public Date getServerDate() {
        return serverDate;
    }
    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }
    public Date getRefreshDate() {
        return refreshDate;
    }
    public void setRefreshDate(Date refreshDate) {
        this.refreshDate = refreshDate;
    }

    
}
