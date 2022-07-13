package app.revanced.patches.music.ad.video.annotations

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility(
    [Package(
        "com.google.android.apps.youtube.music", arrayOf("5.14.53")
    )]
)
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
internal annotation class MusicVideoAdsCompatibility
