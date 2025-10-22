plugins {
    id("java")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// 👇 tell Gradle where your Week00 code lives
sourceSets {
    main {
        java {
            setSrcDirs(listOf("week00/src/main/java"))
        }
        resources {
            setSrcDirs(listOf("week00/src/main/resources"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("week00/src/test/java"))
        }
        resources {
            setSrcDirs(listOf("week00/src/test/resources"))
        }
    }
}
