package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfrn {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfro zzc;
    private final zzfpp zzd;
    private final zzfpk zze;
    private zzfrc zzf;
    private final Object zzg = new Object();

    public zzfrn(Context context, zzfro zzfroVar, zzfpp zzfppVar, zzfpk zzfpkVar) {
        this.zzb = context;
        this.zzc = zzfroVar;
        this.zzd = zzfppVar;
        this.zze = zzfpkVar;
    }

    private final synchronized Class zzd(zzfrd zzfrdVar) throws zzfrm {
        try {
            String strZzk = zzfrdVar.zza().zzk();
            HashMap map = zza;
            Class cls = (Class) map.get(strZzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfrdVar.zzc())) {
                    throw new zzfrm(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = zzfrdVar.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfrdVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzk, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfrm(2008, e);
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    throw new zzfrm(2008, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new zzfrm(2008, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new zzfrm(2026, e11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzfps zza() {
        zzfrc zzfrcVar;
        synchronized (this.zzg) {
            zzfrcVar = this.zzf;
        }
        return zzfrcVar;
    }

    public final zzfrd zzb() {
        synchronized (this.zzg) {
            try {
                zzfrc zzfrcVar = this.zzf;
                if (zzfrcVar == null) {
                    return null;
                }
                return zzfrcVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzfrd zzfrdVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfrc zzfrcVar = new zzfrc(zzd(zzfrdVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfrdVar.zze(), null, new Bundle(), 2), zzfrdVar, this.zzc, this.zzd);
                if (!zzfrcVar.zzh()) {
                    throw new zzfrm(4000, "init failed");
                }
                int iZze = zzfrcVar.zze();
                if (iZze != 0) {
                    throw new zzfrm(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfrc zzfrcVar2 = this.zzf;
                    if (zzfrcVar2 != null) {
                        try {
                            zzfrcVar2.zzg();
                        } catch (zzfrm e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfrcVar;
                    } else {
                        this.zzf = zzfrcVar;
                    }
                    throw th;
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e4) {
                throw new zzfrm(2004, e4);
            }
        } catch (zzfrm e10) {
            this.zzd.zzc(e10.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        }
    }
}
