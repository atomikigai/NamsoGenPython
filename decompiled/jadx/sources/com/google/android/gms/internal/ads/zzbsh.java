package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import app.namso_gen.spacehowen.R;
import d6.p;
import h6.r0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbsh extends zzbsk {
    private final Map zza;
    private final Context zzb;

    public zzbsh(zzcfk zzcfkVar, Map map) {
        super(zzcfkVar, "storePicture");
        this.zza = map;
        this.zzb = zzcfkVar.zzi();
    }

    public final void zzb() {
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        p pVar = p.C;
        r0 r0Var = pVar.f2979c;
        if (!new zzbbv(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        r0 r0Var2 = pVar.f2979c;
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = pVar.f2982g.zze();
        r0 r0Var3 = pVar.f2979c;
        AlertDialog.Builder builderI = r0.i(this.zzb);
        builderI.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s1) : "Save image");
        builderI.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderI.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : "Accept", new zzbsf(this, str, lastPathSegment));
        builderI.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbsg(this));
        builderI.create().show();
    }
}
