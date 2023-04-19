package com.chat.manager.eureka.discovery.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ChatManagerEurekaServerApp

fun main() {
    runApplication<ChatManagerEurekaServerApp>()
}