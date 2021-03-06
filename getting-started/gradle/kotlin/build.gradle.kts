plugins {
    java // Optional: only needed for the Java example
    kotlin("jvm") version "1.5.21" // Optional: only needed for the Kotlin example.
    kotlin("kapt") version "1.5.21" // Optional: only need for the Kotlin example.
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "org.kryptonmc"
version = "1.0"

repositories {
    maven("https://repo.kryptonmc.org/releases")
}

dependencies {
    compileOnly("org.kryptonmc", "api", "0.37.1")
    kapt("org.kryptonmc", "api", "0.37.1") // Optional: process the Plugin annotation. Only add if you added kapt earlier.
    compileOnly(kotlin("stdlib")) // Optional: override implementation dependency from Kotlin plugin
}

tasks {
    // Optional start: configure Kotlin (Kotlin only)
    compileKotlin {
        kotlinOptions.jvmTarget = "16"
    }
    // Optional end
    shadowJar {
        // This can be whatever you want, though it is recommended to follow one of the two formats:
        // - <plugin-id>-<version>.jar
        // - <PluginName>-<version>.jar
        // In this case, we follow the second one, with the plugin name in upper camel case with no spaces, just
        // like what you do with Bukkit/Spigot.
        archiveFileName.set("MyPlugin-${project.version}.jar")
    }
}
