package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzop {
    static final zzfzr zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzop zza = new zzop(zzfzo.zzo(zzon.zza));
    private static final zzfzo zzc = zzfzo.zzq(2, 5, 6);

    static {
        zzfzq zzfzqVar = new zzfzq();
        zzfzqVar.zza(5, 6);
        zzfzqVar.zza(17, 6);
        zzfzqVar.zza(7, 6);
        zzfzqVar.zza(30, 10);
        zzfzqVar.zza(18, 6);
        zzfzqVar.zza(6, 8);
        zzfzqVar.zza(8, 8);
        zzfzqVar.zza(14, 8);
        zzb = zzfzqVar.zzc();
    }

    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public static zzop zzc(Context context, zzg zzgVar, zzow zzowVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzgVar, zzowVar);
    }

    public static zzop zzd(Context context, Intent intent, zzg zzgVar, zzow zzowVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzowVar == null) {
            zzowVar = zzen.zza >= 33 ? zzom.zzb(audioManager, zzgVar) : null;
        }
        int i = zzen.zza;
        if (i >= 33 && (zzen.zzM(context) || zzen.zzI(context))) {
            return zzom.zza(audioManager, zzgVar);
        }
        if (i >= 23 && zzok.zza(audioManager, zzowVar)) {
            return zza;
        }
        zzfzs zzfzsVar = new zzfzs();
        zzfzsVar.zzf((Object) 2);
        if (i >= 29 && (zzen.zzM(context) || zzen.zzI(context))) {
            zzfzsVar.zzh(zzol.zzb(zzgVar));
            return new zzop(zze(zzgcr.zzh(zzfzsVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z4 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z4 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfzsVar.zzh(zzc);
        }
        if (intent == null || z4 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzop(zze(zzgcr.zzh(zzfzsVar.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfzsVar.zzh(zzgcr.zzg(intArrayExtra));
        }
        return new zzop(zze(zzgcr.zzh(zzfzsVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfzo zze(int[] iArr, int i) {
        zzfzl zzfzlVar = new zzfzl();
        for (int i10 : iArr) {
            zzfzlVar.zzf(new zzon(i10, i));
        }
        return zzfzlVar.zzi();
    }

    private static boolean zzf() {
        String str = zzen.zzc;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[RETURN] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzop)) {
            return false;
        }
        zzop zzopVar = (zzop) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray<?> sparseArray2 = zzopVar.zzd;
        if (zzen.zza < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i = 0; i < size; i++) {
                    if (Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                    }
                }
                if (this.zze == zzopVar.zze) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze == zzopVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = zzen.zza;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r0
      0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    public final Pair zzb(zzad zzadVar, zzg zzgVar) {
        String str = zzadVar.zzo;
        str.getClass();
        int iZza = zzbg.zza(str, zzadVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZza))) {
            return null;
        }
        int i = 8;
        if (iZza != 18) {
            if (iZza != 8) {
                if (iZza == 30 && !zzen.zzG(this.zzd, 30)) {
                    iZza = 7;
                }
            } else if (zzen.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else if (zzen.zzG(this.zzd, 18)) {
            iZza = 18;
            if (iZza != 8) {
                if (iZza == 30) {
                    iZza = 7;
                }
            } else if (zzen.zzG(this.zzd, 8)) {
                iZza = 8;
                if (iZza == 30) {
                    iZza = 7;
                }
            } else {
                iZza = 7;
            }
        } else {
            iZza = 6;
        }
        if (!zzen.zzG(this.zzd, iZza)) {
            return null;
        }
        zzon zzonVar = (zzon) this.zzd.get(iZza);
        zzonVar.getClass();
        int iZza2 = zzadVar.zzC;
        if (iZza2 == -1 || iZza == 18) {
            int i10 = zzadVar.zzD;
            if (i10 == -1) {
                i10 = 48000;
            }
            iZza2 = zzonVar.zza(i10, zzgVar);
        } else if (!zzadVar.zzo.equals("audio/vnd.dts.uhd;profile=p2") || zzen.zza >= 33) {
            if (!zzonVar.zzb(iZza2)) {
                return null;
            }
        } else if (iZza2 > 10) {
            return null;
        }
        int i11 = zzen.zza;
        if (i11 > 28) {
            i = iZza2;
        } else if (iZza2 != 7) {
            if (iZza2 == 3 || iZza2 == 4 || iZza2 == 5) {
                i = 6;
            } else {
                i = iZza2;
            }
        }
        if (i11 <= 26 && "fugu".equals(zzen.zzb) && i == 1) {
            i = 2;
        }
        int iZzi = zzen.zzi(i);
        if (iZzi != 0) {
            return Pair.create(Integer.valueOf(iZza), Integer.valueOf(iZzi));
        }
        return null;
    }

    private zzop(List list) {
        this.zzd = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            zzon zzonVar = (zzon) list.get(i);
            this.zzd.put(zzonVar.zzb, zzonVar);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.zzd.size(); i10++) {
            iMax = Math.max(iMax, ((zzon) this.zzd.valueAt(i10)).zzc);
        }
        this.zze = iMax;
    }
}
