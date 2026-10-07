package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import d6.p;
import e6.t;
import h6.l0;
import h6.r0;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p7.b;
import p7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzduu {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzduu(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        zzbce zzbceVar = zzbcn.zziM;
        t tVar = t.f3437d;
        this.zzc = ((Integer) tVar.f3440c.zza(zzbceVar)).intValue();
        this.zzd = ((Integer) tVar.f3440c.zza(zzbcn.zziN)).intValue();
    }

    public final JSONObject zza() throws JSONException {
        String strE;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            l0 l0Var = r0.f5068l;
            Context context2 = (Context) c.a(context).f7823a;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        r0 r0Var = p.C.f2979c;
        Drawable applicationIcon = null;
        try {
            strE = r0.E(this.zza);
        } catch (RemoteException unused2) {
            strE = null;
        }
        jSONObject.put("adMobAppId", strE);
        if (this.zze.isEmpty()) {
            try {
                b bVarA = c.a(this.zza);
                String str2 = this.zzb.packageName;
                Context context3 = (Context) bVarA.f7823a;
                ApplicationInfo applicationInfo = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
