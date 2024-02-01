pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/OneEntry/oneentry-android-sdk")
            credentials {
                username = "DinarBes"
                password = "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"
            }
        }
    }
}

rootProject.name = "Hummel"
include(":app")
