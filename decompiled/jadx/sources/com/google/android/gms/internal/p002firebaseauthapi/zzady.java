package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.i0;
import j7.a;
import java.util.concurrent.ScheduledExecutorService;
import n9.g;
import v9.d0;
import v9.r;
import v9.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzady {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzabz zzb;
    private final zzaft zzc;

    public zzady(g gVar, ScheduledExecutorService scheduledExecutorService) {
        i0.i(gVar);
        gVar.a();
        Context context = gVar.f7359a;
        i0.i(context);
        this.zzb = new zzabz(new zzaem(gVar, zzael.zza(), null, null, null));
        this.zzc = new zzaft(context, scheduledExecutorService);
    }

    private static boolean zzJ(long j4, boolean z4) {
        if (j4 > 0 && z4) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zzaab zzaabVar, zzadw zzadwVar) {
        i0.i(zzadwVar);
        i0.i(zzaabVar);
        t tVarZza = zzaabVar.zza();
        i0.i(tVarZza);
        this.zzb.zzG(zzafj.zza(tVarZza), new zzadx(zzadwVar, zza));
    }

    public final void zzB(String str, String str2, String str3, long j4, boolean z4, boolean z10, String str4, String str5, boolean z11, zzadw zzadwVar) {
        i0.f(str, "idToken should not be empty.");
        i0.i(zzadwVar);
        zzadx zzadxVar = new zzadx(zzadwVar, zza);
        if (this.zzc.zzk(str2)) {
            if (!z4) {
                this.zzc.zzh(zzadxVar, str2);
                return;
            }
            this.zzc.zzi(str2);
        }
        zzahv zzahvVarZzb = zzahv.zzb(str, str2, str3, str4, str5, null);
        if (zzJ(j4, z11)) {
            zzahvVarZzb.zzd(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(str2, zzadxVar, j4, z11);
        this.zzb.zzH(zzahvVarZzb, new zzafq(this.zzc, zzadxVar, str2));
    }

    public final void zzC(zzaac zzaacVar, zzadw zzadwVar) {
        i0.i(zzaacVar);
        i0.i(zzadwVar);
        String str = zzaacVar.zzb().f9284d;
        zzadx zzadxVar = new zzadx(zzadwVar, zza);
        if (this.zzc.zzk(str)) {
            if (!zzaacVar.zzg()) {
                this.zzc.zzh(zzadxVar, str);
                return;
            }
            this.zzc.zzi(str);
        }
        long jZza = zzaacVar.zza();
        boolean zZzh = zzaacVar.zzh();
        zzaht zzahtVarZzb = zzaht.zzb(zzaacVar.zzd(), zzaacVar.zzb().f9281a, zzaacVar.zzb().f9284d, zzaacVar.zzc(), zzaacVar.zzf(), zzaacVar.zze());
        if (zzJ(jZza, zZzh)) {
            zzahtVarZzb.zzd(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(str, zzadxVar, jZza, zZzh);
        this.zzb.zzI(zzahtVarZzb, new zzafq(this.zzc, zzadxVar, str));
    }

    public final void zzD(zzahx zzahxVar, zzadw zzadwVar) {
        i0.i(zzadwVar);
        this.zzb.zzH(zzahxVar, new zzadx(zzadwVar, zza));
    }

    public final void zzE(String str, String str2, String str3, zzadw zzadwVar) {
        i0.f(str, "cachedTokenState should not be empty.");
        i0.f(str2, "uid should not be empty.");
        i0.i(zzadwVar);
        this.zzb.zzJ(str, str2, str3, new zzadx(zzadwVar, zza));
    }

    public final void zzF(String str, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzK(str, new zzadx(zzadwVar, zza));
    }

    public final void zzG(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadwVar);
        this.zzb.zzL(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zzH(String str, d0 d0Var, zzadw zzadwVar) {
        i0.e(str);
        i0.i(d0Var);
        i0.i(zzadwVar);
        this.zzb.zzM(str, d0Var, new zzadx(zzadwVar, zza));
    }

    public final void zzI(zzaad zzaadVar, zzadw zzadwVar) {
        i0.i(zzaadVar);
        this.zzb.zzN(zzagu.zzc(zzaadVar.zza(), zzaadVar.zzb(), zzaadVar.zzc()), new zzadx(zzadwVar, zza));
    }

    public final void zza(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzg(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zzb(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadwVar);
        this.zzb.zzh(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zzc(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadwVar);
        this.zzb.zzi(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zzd(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzj(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zze(zzzs zzzsVar, zzadw zzadwVar) {
        i0.i(zzzsVar);
        i0.e(zzzsVar.zza());
        i0.e(zzzsVar.zzb());
        i0.i(zzadwVar);
        this.zzb.zzk(zzzsVar.zza(), zzzsVar.zzb(), zzzsVar.zzc(), new zzadx(zzadwVar, zza));
    }

    public final void zzf(String str, String str2, String str3, String str4, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadwVar);
        this.zzb.zzl(str, str2, str3, str4, new zzadx(zzadwVar, zza));
    }

    public final void zzg(String str, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzm(str, new zzadx(zzadwVar, zza));
    }

    public final void zzh(r rVar, String str, String str2, String str3, zzadw zzadwVar) {
        i0.i(rVar);
        throw null;
    }

    public final void zzi(String str, r rVar, String str2, zzadw zzadwVar) {
        i0.e(str);
        i0.i(rVar);
        throw null;
    }

    public final void zzj(String str, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzp(str, new zzadx(zzadwVar, zza));
    }

    public final void zzk(zzzt zzztVar, zzadw zzadwVar) {
        i0.i(zzztVar);
        this.zzb.zzq(zzagw.zzb(), new zzadx(zzadwVar, zza));
    }

    public final void zzl(String str, String str2, zzadw zzadwVar) {
        i0.e(str);
        this.zzb.zzr(str, str2, new zzadx(zzadwVar, zza));
    }

    public final void zzm(zzzu zzzuVar, zzadw zzadwVar) {
        i0.i(zzzuVar);
        this.zzb.zzs(zzagz.zzb(zzzuVar.zzb(), zzzuVar.zza()), new zzadx(zzadwVar, zza));
    }

    public final void zzn(String str, String str2, String str3, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.e(str3);
        i0.i(zzadwVar);
        this.zzb.zzt(str, str2, str3, new zzadx(zzadwVar, zza));
    }

    public final void zzo(String str, zzaic zzaicVar, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzaicVar);
        i0.i(zzadwVar);
        this.zzb.zzu(str, zzaicVar, new zzadx(zzadwVar, zza));
    }

    public final void zzp(zzzv zzzvVar, zzadw zzadwVar) {
        i0.i(zzadwVar);
        i0.i(zzzvVar);
        t tVarZza = zzzvVar.zza();
        i0.i(tVarZza);
        String strZzb = zzzvVar.zzb();
        i0.e(strZzb);
        this.zzb.zzv(strZzb, zzafj.zza(tVarZza), new zzadx(zzadwVar, zza));
    }

    public final void zzq(String str, zzadw zzadwVar) {
        i0.e(str);
        i0.i(zzadwVar);
        this.zzb.zzw(str, new zzadx(zzadwVar, zza));
    }

    public final void zzr(zzzw zzzwVar, zzadw zzadwVar) {
        i0.i(zzzwVar);
        i0.e(zzzwVar.zzb());
        i0.i(zzadwVar);
        this.zzb.zzx(zzzwVar.zzb(), zzzwVar.zza(), new zzadx(zzadwVar, zza));
    }

    public final void zzs(zzzx zzzxVar, zzadw zzadwVar) {
        i0.i(zzzxVar);
        i0.e(zzzxVar.zzc());
        i0.i(zzadwVar);
        this.zzb.zzy(zzzxVar.zzc(), zzzxVar.zza(), zzzxVar.zzd(), zzzxVar.zzb(), new zzadx(zzadwVar, zza));
    }

    public final void zzt(zzzy zzzyVar, zzadw zzadwVar) {
        i0.i(zzadwVar);
        i0.i(zzzyVar);
        zzahl zzahlVarZza = zzzyVar.zza();
        i0.i(zzahlVarZza);
        String strZzd = zzahlVarZza.zzd();
        zzadx zzadxVar = new zzadx(zzadwVar, zza);
        if (this.zzc.zzk(strZzd)) {
            if (!zzahlVarZza.zzf()) {
                this.zzc.zzh(zzadxVar, strZzd);
                return;
            }
            this.zzc.zzi(strZzd);
        }
        long jZzb = zzahlVarZza.zzb();
        boolean zZzg = zzahlVarZza.zzg();
        if (zzJ(jZzb, zZzg)) {
            zzahlVarZza.zze(new zzafy(this.zzc.zzb()));
        }
        this.zzc.zzj(strZzd, zzadxVar, jZzb, zZzg);
        this.zzb.zzz(zzahlVarZza, new zzafq(this.zzc, zzadxVar, strZzd));
    }

    public final void zzu(zzzz zzzzVar, zzadw zzadwVar) {
        i0.i(zzzzVar);
        i0.i(zzadwVar);
        this.zzb.zzA(zzzzVar.zza(), new zzadx(zzadwVar, zza));
    }

    public final void zzv(String str, zzadw zzadwVar) {
        i0.i(zzadwVar);
        this.zzb.zzB(str, new zzadx(zzadwVar, zza));
    }

    public final void zzw(zzaic zzaicVar, zzadw zzadwVar) {
        i0.i(zzaicVar);
        i0.i(zzadwVar);
        this.zzb.zzC(zzaicVar, new zzadx(zzadwVar, zza));
    }

    public final void zzx(zzaif zzaifVar, zzadw zzadwVar) {
        i0.i(zzaifVar);
        i0.i(zzadwVar);
        this.zzb.zzD(zzaifVar, new zzadx(zzadwVar, zza));
    }

    public final void zzy(String str, String str2, String str3, String str4, zzadw zzadwVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadwVar);
        this.zzb.zzE(str, str2, str3, str4, new zzadx(zzadwVar, zza));
    }

    public final void zzz(zzaaa zzaaaVar, zzadw zzadwVar) {
        i0.i(zzaaaVar);
        i0.i(zzaaaVar.zza());
        i0.i(zzadwVar);
        this.zzb.zzF(zzaaaVar.zza(), zzaaaVar.zzb(), new zzadx(zzadwVar, zza));
    }
}
