plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.springframework.cloud:spring-cloud-dependencies:${Version.SPRING_CLOUD}"))
    implementation("org.springframework.cloud:spring-cloud-starter-config")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
}

springBoot {
    mainClass.set("${GROUP_NAME}.ChatManagerEurekaServerAppKt")
}

