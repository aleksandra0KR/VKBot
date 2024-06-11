plugins {
    id("java")
}

group = "aleksandra0KR"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.springframework.boot:spring-boot-starter-web:3.0.6")
    implementation("org.projectlombok:lombok:1.18.22")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor ("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.2.0")
    implementation("org.springframework:spring-webmvc:3.1.1.RELEASE")





}

tasks.test {
    useJUnitPlatform()
}