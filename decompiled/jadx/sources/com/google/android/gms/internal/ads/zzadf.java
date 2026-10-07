package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadf {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = zzen.zza;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.zza = i10;
            this.zzb = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbd zzbdVar) {
        for (int i = 0; i < zzbdVar.zza(); i++) {
            zzbc zzbcVarZzb = zzbdVar.zzb(i);
            if (zzbcVarZzb instanceof zzagf) {
                zzagf zzagfVar = (zzagf) zzbcVarZzb;
                if ("iTunSMPB".equals(zzagfVar.zzb) && zzc(zzagfVar.zzc)) {
                    return true;
                }
            } else if (zzbcVarZzb instanceof zzago) {
                zzago zzagoVar = (zzago) zzbcVarZzb;
                if ("com.apple.iTunes".equals(zzagoVar.zza) && "iTunSMPB".equals(zzagoVar.zzb) && zzc(zzagoVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
