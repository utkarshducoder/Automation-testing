plugins {
    id 'java-library'
    
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.13.2'
    testImplementation 'org.junit.vintage:junit-vintage-engine:5.8.1'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
    
    api 'org.apache.commons:commons-math3:3.6.1'
    implementation 'com.google.guava:guava:31.0.1-jre'
    implementation 'org.springframework:spring-core:6.1.10'

    // Serenity BDD dependencies
    implementation 'net.serenity-bdd:serenity-core:3.9.3'
    implementation 'net.serenity-bdd:serenity-junit:3.9.3'
    implementation 'net.serenity-bdd:serenity-spring:3.9.3'
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform {
        includeEngines 'junit-vintage'
    }
}
