package com.google.android.recaptcha.internal;

import ac.i;
import android.app.Application;
import android.os.Build;
import ic.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import r7.g;
import rc.a0;
import u3.b;
import ub.k;
import yb.d;
import zb.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzal extends i implements p {
    final /* synthetic */ Application zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbd zzc;
    final /* synthetic */ zzbq zzd;
    final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, d dVar) {
        super(2, dVar);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // ac.a
    public final d create(Object obj, d dVar) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // ic.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((a0) obj, (d) obj2)).invokeSuspend(k.f9073a);
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        a aVar = a.f11555a;
        g.G(obj);
        zzaf zzafVar = zzaf.zza;
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String strZza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String strZzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i = Build.VERSION.SDK_INT;
        String strZza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (strZza2 == null) {
            strZza2 = "";
        }
        String strEncode = URLEncoder.encode(this.zzb, "UTF-8");
        String strEncode2 = URLEncoder.encode(packageName, "UTF-8");
        String strEncode3 = URLEncoder.encode(strZza, "UTF-8");
        String strEncode4 = URLEncoder.encode("18.4.0", "UTF-8");
        String strEncode5 = URLEncoder.encode(strZzd, "UTF-8");
        StringBuilder sbE = b.e("k=", strEncode, "&pk=", strEncode2, "&mst=");
        sbE.append(strEncode3);
        sbE.append("&msv=");
        sbE.append(strEncode4);
        sbE.append("&msi=");
        sbE.append(strEncode5);
        sbE.append("&mov=");
        sbE.append(i);
        sbE.append("&mkc=");
        sbE.append(strZza2);
        byte[] bytes = sbE.toString().getBytes(Charset.forName("UTF-8"));
        zzbq zzbqVar = this.zzd;
        zzab zzabVar = this.zze;
        return zzbqVar.zza(zzabVar.zzb(), bytes, this.zzc);
    }
}
