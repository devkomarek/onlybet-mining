/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.komarek.rabbitmq.rabbit;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author komarekzm
 */
class ScrapingResultMessage {
 
private String json;

    public ScrapingResultMessage() {
    }

    public ScrapingResultMessage(String json) {
        this.json = json;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }


    
}
