package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e6.t;
import i6.h;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzebx implements zzfiv {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfka zzc;
    private final zzfkl zzd;

    public zzebx(String str, zzfkl zzfklVar, zzfka zzfkaVar) {
        this.zzb = str;
        this.zzd = zzfklVar;
        this.zzc = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final Object zza(Object obj) throws Exception {
        zzdwn zzdwnVar;
        String strConcat;
        zzebw zzebwVar = (zzebw) obj;
        int iOptInt = zzebwVar.zza.optInt("http_timeout_millis", 60000);
        zzbvz zzbvzVar = zzebwVar.zzb;
        String strJoin = "";
        if (zzbvzVar.zza() != -2) {
            if (zzbvzVar.zza() == 1) {
                if (zzbvzVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbvzVar.zzh());
                    h.d(strJoin);
                }
                zzdwnVar = new zzdwn(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdwnVar = new zzdwn(1);
            }
            zzfkl zzfklVar = this.zzd;
            zzfka zzfkaVar = this.zzc;
            zzfkaVar.zzh(zzdwnVar);
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
            throw zzdwnVar;
        }
        HashMap map = new HashMap();
        if (zzebwVar.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzaW)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.zzb);
            }
        }
        if (zzebwVar.zzb.zzk()) {
            zzeby.zza(map, zzebwVar.zza);
        }
        if (zzebwVar.zzb != null && !TextUtils.isEmpty(zzebwVar.zzb.zzf())) {
            strJoin = zzebwVar.zzb.zzf();
        }
        zzfkl zzfklVar2 = this.zzd;
        zzfka zzfkaVar2 = this.zzc;
        zzfkaVar2.zzg(true);
        zzfklVar2.zza(zzfkaVar2);
        return new zzebs(zzebwVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", zzebwVar.zzb.zzk());
    }
}
