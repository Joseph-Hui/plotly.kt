plugins {
    id("ru.mipt.npm.jvm")
}

kscience{
    publish()
}

//repositories {
//    maven("https://dl.bintray.com/kotlin/ktor/")
//}

val ktorVersion: String by rootProject.extra
val dataforgeVersion: String by rootProject.extra

dependencies {
    api(project(":plotlykt-core"))
    api("io.ktor:ktor-server-cio:$ktorVersion")
    //api("io.ktor:ktor-server-netty:$ktorVersion")
    api("io.ktor:ktor-html-builder:$ktorVersion")
    api("io.ktor:ktor-websockets:$ktorVersion")
    api("space.kscience:dataforge-context:$dataforgeVersion"){
        exclude(module = "kotlinx-io")
    }
}