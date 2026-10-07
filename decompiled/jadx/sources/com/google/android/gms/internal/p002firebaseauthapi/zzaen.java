package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import m0.o;
import n9.g;
import u3.b;
import wa.c;
import wa.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaen {
    private final Context zza;
    private zzafi zzb;
    private final String zzc;
    private final g zzd;
    private boolean zze = false;
    private String zzf;

    public zzaen(Context context, g gVar, String str) {
        i0.i(context);
        this.zza = context;
        i0.i(gVar);
        this.zzd = gVar;
        this.zzc = b.b("Android/Fallback/", str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        String strConcat = this.zze ? String.valueOf(this.zzc).concat("/FirebaseUI-Android") : String.valueOf(this.zzc).concat("/FirebaseCore-Android");
        if (this.zzb == null) {
            Context context = this.zza;
            this.zzb = new zzafi(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaeo.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strConcat);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        g gVar = this.zzd;
        gVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", gVar.f7361c.f7367b);
        e eVar = (e) FirebaseAuth.getInstance(this.zzd).f2714t.get();
        if (eVar != null) {
            try {
                c cVar = (c) eVar;
                str = (String) Tasks.await(!o.a(cVar.f9878b) ? Tasks.forResult("") : Tasks.call(cVar.e, new wa.b(cVar, 0)));
            } catch (InterruptedException | ExecutionException e) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e.getMessage())));
                str = null;
            }
        } else {
            str = null;
        }
        uRLConnection.setRequestProperty("X-Firebase-Client", str);
        if (FirebaseAuth.getInstance(this.zzd).f2713s.get() != null) {
            throw new ClassCastException();
        }
        if (!TextUtils.isEmpty(null)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", null);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
