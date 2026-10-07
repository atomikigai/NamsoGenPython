package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzauw {
    protected volatile Boolean zzb;
    private final zzawf zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfrr zza = null;
    private static volatile Random zzd = null;

    public zzauw(zzawf zzawfVar) {
        this.zze = zzawfVar;
        zzawfVar.zzk().execute(new zzauv(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzauw.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i10, long j4, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarl zzarlVarZza = zzarp.zza();
            zzarlVarZza.zza(this.zze.zza.getPackageName());
            zzarlVarZza.zze(j4);
            if (str != null) {
                zzarlVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzarlVarZza.zzf(stringWriter.toString());
                zzarlVarZza.zzd(exc.getClass().getName());
            }
            zzfrp zzfrpVarZza = zza.zza(((zzarp) zzarlVarZza.zzbr()).zzaV());
            zzfrpVarZza.zza(i);
            if (i10 != -1) {
                zzfrpVarZza.zzb(i10);
            }
            zzfrpVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
