package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcdq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcdr zze;

    public zzcdq(zzcdr zzcdrVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcdrVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            map.put("cachedSrc", this.zzb);
        }
        String str2 = this.zzc;
        String str3 = "internal";
        switch (str2.hashCode()) {
            case -1947652542:
                str = "interrupted";
                str2.equals(str);
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    str3 = "network";
                }
                break;
            case -1347010958:
                str = "inProgress";
                str2.equals(str);
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    str3 = "network";
                }
                break;
            case -659376217:
                str = "contentLengthMissing";
                str2.equals(str);
                break;
            case -642208130:
                str = "playerFailed";
                str2.equals(str);
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    str3 = "policy";
                }
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    str3 = "policy";
                }
                break;
            case 3387234:
                str = "noop";
                str2.equals(str);
                break;
            case 96784904:
                str = "error";
                str2.equals(str);
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    str3 = "io";
                }
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    str3 = "io";
                }
                break;
        }
        map.put("type", str3);
        map.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            map.put("message", this.zzd);
        }
        zzcdr.zze(this.zze, "onPrecacheEvent", map);
    }
}
