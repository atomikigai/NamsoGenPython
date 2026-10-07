package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import n7.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfre {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfre(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfrf.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfrf.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb2 = new StringBuilder("FBAMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    private final String zzf() {
        StringBuilder sb2 = new StringBuilder("LATMTD");
        sb2.append(this.zzd - 1);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(zzaxy zzaxyVar, zzfrk zzfrkVar) {
        boolean z4;
        String strZzk = zzaxyVar.zzc().zzk();
        byte[] bArrZzA = zzaxyVar.zzf().zzA();
        byte[] bArrZzA2 = zzaxyVar.zzd().zzA();
        if (!TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            zzfrf.zzd(this.zza);
            this.zza.mkdirs();
            zzfrf.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfrf.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfrf.zze(fileZzb, bArrZzA)) && zzfrf.zze(zzfrf.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                File fileZzb2 = zzfrf.zzb(zzaxyVar.zzc().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfrkVar != null && !zzfrkVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzaxyVar.zzc().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z4 = false;
                } else {
                    File fileZzb3 = zzfrf.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfrf.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfrf.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfrf.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzaxz zzaxzVarZzd = zzayb.zzd();
                        zzaxzVarZzd.zze(zzaxyVar.zzc().zzk());
                        zzaxzVarZzd.zza(zzaxyVar.zzc().zzj());
                        zzaxzVarZzd.zzb(zzaxyVar.zzc().zza());
                        zzaxzVarZzd.zzd(zzaxyVar.zzc().zzc());
                        zzaxzVarZzd.zzc(zzaxyVar.zzc().zzb());
                        zzayb zzaybVar = (zzayb) zzaxzVarZzd.zzbr();
                        zzayb zzaybVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzaybVarZzb != null && !zzaybVar.zzk().equals(zzaybVarZzb.zzk())) {
                            editorEdit.putString(zze(), c.b(zzaybVarZzb.zzaV()));
                        }
                        editorEdit.putString(zzf(), c.b(zzaybVar.zzaV()));
                        if (editorEdit.commit()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzayb zzaybVarZzb2 = zzb(1);
                if (zzaybVarZzb2 != null) {
                    hashSet.add(zzaybVarZzb2.zzk());
                }
                zzayb zzaybVarZzb3 = zzb(2);
                if (zzaybVarZzb3 != null) {
                    hashSet.add(zzaybVarZzb3.zzk());
                }
                for (File file : zzd().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfrf.zzd(zzfrf.zzc(name, zzd()));
                    }
                }
                return z4;
            }
        }
        return false;
    }

    public final zzayb zzb(int i) {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrM = c.m(string);
            zzayb zzaybVarZzh = zzayb.zzh(zzgxp.zzv(bArrM, 0, bArrM.length));
            String strZzk = zzaybVarZzh.zzk();
            File fileZzb = zzfrf.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfrf.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfrf.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzaybVarZzh;
            }
            return null;
        } catch (zzgzm unused) {
        }
    }

    public final zzfrd zzc(int i) {
        zzayb zzaybVarZzb = zzb(1);
        if (zzaybVarZzb == null) {
            return null;
        }
        String strZzk = zzaybVarZzb.zzk();
        File fileZzb = zzfrf.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfrf.zzb(strZzk, "pcam", zzd());
        }
        return new zzfrd(zzaybVarZzb, fileZzb, zzfrf.zzb(strZzk, "pcbc", zzd()), zzfrf.zzb(strZzk, "pcopt", zzd()));
    }
}
