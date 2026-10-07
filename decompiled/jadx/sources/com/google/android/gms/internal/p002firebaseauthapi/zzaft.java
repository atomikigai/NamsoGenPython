package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import da.v;
import j7.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p7.c;
import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaft {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap zzd = new HashMap();

    public zzaft(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static void zzd(zzaft zzaftVar, String str) {
        zzafs zzafsVar = (zzafs) zzaftVar.zzd.get(str);
        if (zzafsVar == null || zzac.zzd(zzafsVar.zzd) || zzac.zzd(zzafsVar.zze) || zzafsVar.zzb.isEmpty()) {
            return;
        }
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zzr(new t(zzafsVar.zzd, zzafsVar.zze, null, null, true));
        }
        zzafsVar.zzh = true;
    }

    private static String zzl(String str, String str2) {
        String strU = v.u(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strU.getBytes(zzk.zzc));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e) {
            zza.c("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null || zzafsVar.zzh || zzac.zzd(zzafsVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator it = zzafsVar.zzb.iterator();
        while (it.hasNext()) {
            ((zzadx) it.next()).zza(zzafsVar.zzd);
        }
        zzafsVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzg(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        if (!zzafsVar.zzi) {
            zzm(str);
        }
        zzi(str);
    }

    public final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String strZzl = zzl(packageName, (Build.VERSION.SDK_INT < 28 ? c.a(this.zzb).f(64, packageName).signatures : c.a(this.zzb).f(134217728, packageName).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZzl != null) {
                return strZzl;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzh(zzadx zzadxVar, String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        zzafsVar.zzb.add(zzadxVar);
        if (zzafsVar.zzg) {
            zzadxVar.zzb(zzafsVar.zzd);
        }
        if (zzafsVar.zzh) {
            zzadxVar.zzr(new t(zzafsVar.zzd, zzafsVar.zze, null, null, true));
        }
        if (zzafsVar.zzi) {
            zzadxVar.zza(zzafsVar.zzd);
        }
    }

    public final void zzi(String str) {
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        if (zzafsVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = zzafsVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzafsVar.zzf.cancel(false);
        }
        zzafsVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final void zzj(final String str, zzadx zzadxVar, long j4, boolean z4) {
        this.zzd.put(str, new zzafs(j4, z4));
        zzh(zzadxVar, str);
        zzafs zzafsVar = (zzafs) this.zzd.get(str);
        long j10 = zzafsVar.zza;
        if (j10 <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafsVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(str);
            }
        }, j10, TimeUnit.SECONDS);
        if (!zzafsVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafr zzafrVar = new zzafr(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzb.zza(this.zzb.getApplicationContext(), zzafrVar, intentFilter);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzafp(this));
    }

    public final boolean zzk(String str) {
        return this.zzd.get(str) != null;
    }
}
