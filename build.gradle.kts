group = "ch.peters.daniel"
version = "1.0"

plugins {
  java
  application
  groovy
}

application {
  applicationName = "adventuregame"
  mainClassName = "${project.group}.$applicationName.App"
}

var currentOS = org.gradle.internal.os.OperatingSystem.current()!!
var platform = when {
  currentOS.isWindows -> "win"
  currentOS.isLinux -> "linux"
  currentOS.isMacOsX -> "max"
  else -> ""
}

dependencies {
  implementation("org.openjfx:javafx-base:11:$platform")
  implementation("org.openjfx:javafx-graphics:11:$platform")
  implementation("org.openjfx:javafx-controls:11:$platform")
  implementation("org.openjfx:javafx-fxml:11:$platform")
  implementation("com.jfoenix:jfoenix:9.0.8")
  testImplementation("org.codehaus.groovy:groovy-all:2.5.5")
  testImplementation("org.spockframework:spock-core:1.2-groovy-2.5")
  testImplementation("junit:junit:4.12")
}

repositories {
  jcenter()
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

tasks.withType<JavaCompile> {
  doFirst {
    options.compilerArgs = listOf(
      "--module-path", classpath.asPath,
      "--add-modules", "javafx.base",
      "--add-modules", "javafx.controls",
      "--add-modules", "javafx.fxml",
      "--add-modules", "javafx.graphics",
      "--add-modules", "com.jfoenix"
    )
  }
}

tasks.withType<JavaExec> {
  doFirst {
    jvmArgs = listOf(
      "--module-path", classpath.asPath,
      "--add-modules", "javafx.base",
      "--add-modules", "javafx.controls",
      "--add-modules", "javafx.fxml",
      "--add-modules", "javafx.graphics",
      "--add-modules", "com.jfoenix"
    )
  }
}
