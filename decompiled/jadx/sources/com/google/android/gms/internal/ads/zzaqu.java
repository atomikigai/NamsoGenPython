package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzaqu extends zzapp {
    private final Object zza;
    private final zzapu zzb;

    public zzaqu(int i, String str, zzapu zzapuVar, zzapt zzaptVar) {
        super(i, str, zzaptVar);
        this.zza = new Object();
        this.zzb = zzapuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapv zzh(zzapl zzaplVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaplVar.zzb;
            Map map = zzaplVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaplVar.zzb);
        }
        return zzapv.zzb(str, zzaqm.zzb(zzaplVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzapu zzapuVar;
        synchronized (this.zza) {
            zzapuVar = this.zzb;
        }
        zzapuVar.zza(str);
    }
}
