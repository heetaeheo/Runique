plugins {
    alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.android.room)
}

android {
    namespace = "com.example.core.database"
}

dependencies {
    // Local
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}