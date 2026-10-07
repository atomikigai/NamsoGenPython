package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzalz implements zzaki {
    private final zzed zza = new zzed();
    private final zzalp zzb = new zzalp();

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i, int i10, zzakh zzakhVar, zzdg zzdgVar) {
        this.zza.zzJ(bArr, i10 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzed zzedVar = this.zza;
            int iZzd = zzedVar.zzd();
            Charset charset = StandardCharsets.UTF_8;
            String strZzz = zzedVar.zzz(charset);
            if (strZzz == null || !strZzz.startsWith("WEBVTT")) {
                zzedVar.zzL(iZzd);
                throw zzbh.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzedVar.zzz(charset))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzed zzedVar2 = this.zza;
                byte b10 = -1;
                int iZzd2 = 0;
                while (b10 == -1) {
                    iZzd2 = zzedVar2.zzd();
                    String strZzz2 = zzedVar2.zzz(StandardCharsets.UTF_8);
                    if (strZzz2 == null) {
                        b10 = 0;
                    } else if ("STYLE".equals(strZzz2)) {
                        b10 = 2;
                    } else {
                        b10 = strZzz2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzedVar2.zzL(iZzd2);
                if (b10 == 0) {
                    zzakc.zza(new zzamc(arrayList2), zzakhVar, zzdgVar);
                    return;
                }
                if (b10 == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
                    }
                } else if (b10 != 2) {
                    zzalr zzalrVarZzc = zzaly.zzc(this.zza, arrayList);
                    if (zzalrVarZzc != null) {
                        arrayList2.add(zzalrVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzbh e) {
            throw new IllegalArgumentException(e);
        }
    }
}
