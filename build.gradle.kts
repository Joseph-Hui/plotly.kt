plugins {
    id("ru.mipt.npm.gradle.project")
}

val dataforgeVersion by extra("0.5.2-dev-3")

allprojects {
    group = "space.kscience"
    version = "0.5.1-dev-4"
}

apiValidation {
    ignoredProjects.addAll(listOf("examples", "fx-demo", "js-demo"))
}

ksciencePublish{
    github("plotly.kt")
    space()
    sonatype()
}

readme {
    readmeTemplate = file("docs/templates/README-TEMPLATE.md")
}

//workaround for https://youtrack.jetbrains.com/issue/KT-48273
rootProject.plugins.withType(org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin::class.java) {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().apply{
        versions.webpackDevServer.version = "4.4.0"
        versions.webpackCli.version = "4.9.1"
    }
}