package app.revanced.patches.youtube.player.suggestedvideooverlay.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.TouchArea
import app.revanced.util.fingerprint.LiteralValueFingerprint
import com.android.tools.smali.dexlib2.AccessFlags

object TouchAreaOnClickListenerFingerprint : LiteralValueFingerprint(
    returnType = "V",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.CONSTRUCTOR,
    literalSupplier = { TouchArea }
)