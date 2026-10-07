package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import qd.b;
import u.e;
import v9.d0;
import v9.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabz {
    private final zzaff zza;

    public zzabz(zzaff zzaffVar) {
        i0.i(zzaffVar);
        this.zza = zzaffVar;
    }

    public static /* synthetic */ String zzO(zzaew zzaewVar, String str) {
        StringBuilder sbB = e.b(str);
        sbB.append(zzaewVar.zza.zze);
        return sbB.toString();
    }

    private final void zzP(String str, zzafe zzafeVar) {
        i0.i(zzafeVar);
        i0.e(str);
        zzahb zzahbVarZzd = zzahb.zzd(str);
        if (zzahbVarZzd.zzj()) {
            zzafeVar.zzb(zzahbVarZzd);
        } else {
            this.zza.zzf(new zzagp(zzahbVarZzd.zzf()), new zzaby(this, zzafeVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(zzage zzageVar, zzadx zzadxVar) {
        i0.i(zzageVar);
        i0.i(zzadxVar);
        this.zza.zzc(zzageVar, new zzaaj(this, zzadxVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(zzahb zzahbVar, String str, String str2, Boolean bool, h0 h0Var, zzadx zzadxVar, zzafd zzafdVar) {
        i0.i(zzahbVar);
        i0.i(zzafdVar);
        i0.i(zzadxVar);
        this.zza.zzg(new zzagq(zzahbVar.zze()), new zzaam(this, zzafdVar, str2, str, bool, h0Var, zzadxVar, zzahbVar));
    }

    private final void zzS(zzagu zzaguVar, zzadx zzadxVar) {
        i0.i(zzaguVar);
        i0.i(zzadxVar);
        this.zza.zzh(zzaguVar, new zzabr(this, zzadxVar));
    }

    public static void zzd(zzabz zzabzVar, zzaie zzaieVar, zzadx zzadxVar, zzafd zzafdVar) {
        if (!zzaieVar.zzp()) {
            zzabzVar.zzR(new zzahb(zzaieVar.zzj(), zzaieVar.zzf(), Long.valueOf(zzaieVar.zzb()), "Bearer"), zzaieVar.zzi(), zzaieVar.zzh(), Boolean.valueOf(zzaieVar.zzo()), zzaieVar.zzc(), zzadxVar, zzafdVar);
            return;
        }
        zzadxVar.zze(new zzaae(zzaieVar.zzn() ? new Status(17012, null, null, null) : b.G(zzaieVar.zze()), zzaieVar.zzc(), zzaieVar.zzd(), zzaieVar.zzk()));
    }

    public static /* bridge */ /* synthetic */ void zze(zzabz zzabzVar, zzadx zzadxVar, zzahb zzahbVar, zzahn zzahnVar, zzafd zzafdVar) {
        i0.i(zzadxVar);
        i0.i(zzahbVar);
        i0.i(zzahnVar);
        i0.i(zzafdVar);
        zzabzVar.zza.zzg(new zzagq(zzahbVar.zze()), new zzaak(zzabzVar, zzafdVar, zzadxVar, zzahbVar, zzahnVar));
    }

    public static /* bridge */ /* synthetic */ void zzf(zzabz zzabzVar, zzadx zzadxVar, zzahb zzahbVar, zzags zzagsVar, zzahn zzahnVar, zzafd zzafdVar) {
        i0.i(zzadxVar);
        i0.i(zzahbVar);
        i0.i(zzagsVar);
        i0.i(zzahnVar);
        i0.i(zzafdVar);
        zzabzVar.zza.zzn(zzahnVar, new zzaal(zzabzVar, zzahnVar, zzagsVar, zzadxVar, zzahbVar, zzafdVar));
    }

    public final void zzA(String str, zzadx zzadxVar) {
        i0.i(zzadxVar);
        this.zza.zzo(str, new zzabq(this, zzadxVar));
    }

    public final void zzB(String str, zzadx zzadxVar) {
        i0.i(zzadxVar);
        this.zza.zzp(new zzahp(str), new zzabt(this, zzadxVar));
    }

    public final void zzC(zzaic zzaicVar, zzadx zzadxVar) {
        i0.i(zzaicVar);
        i0.i(zzadxVar);
        zzaicVar.zzd(true);
        this.zza.zzs(zzaicVar, new zzabs(this, zzadxVar));
    }

    public final void zzD(zzaif zzaifVar, zzadx zzadxVar) {
        i0.i(zzaifVar);
        i0.i(zzadxVar);
        this.zza.zzt(zzaifVar, new zzabf(this, zzadxVar));
    }

    public final void zzE(String str, String str2, String str3, String str4, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        this.zza.zzu(new zzaih(str, str2, str3, str4), new zzaah(this, zzadxVar));
    }

    public final void zzF(v9.e eVar, String str, zzadx zzadxVar) {
        i0.i(eVar);
        i0.i(zzadxVar);
        if (eVar.e) {
            zzP(eVar.f9238d, new zzaai(this, eVar, str, zzadxVar));
        } else {
            zzQ(new zzage(eVar, null, str), zzadxVar);
        }
    }

    public final void zzG(zzaij zzaijVar, zzadx zzadxVar) {
        i0.i(zzaijVar);
        i0.i(zzadxVar);
        this.zza.zzv(zzaijVar, new zzaat(this, zzadxVar));
    }

    public final void zzH(zzahr zzahrVar, zzadx zzadxVar) {
        i0.i(zzahrVar);
        i0.i(zzadxVar);
        this.zza.zzq(zzahrVar, new zzabe(this, zzahrVar, zzadxVar));
    }

    public final void zzI(zzaht zzahtVar, zzadx zzadxVar) {
        i0.i(zzahtVar);
        i0.i(zzadxVar);
        this.zza.zzr(zzahtVar, new zzabj(this, zzadxVar));
    }

    public final void zzJ(String str, String str2, String str3, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        zzP(str, new zzabd(this, str2, str3, zzadxVar));
    }

    public final void zzK(String str, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzP(str, new zzaaz(this, zzadxVar));
    }

    public final void zzL(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        zzP(str2, new zzabb(this, str, zzadxVar));
    }

    public final void zzM(String str, d0 d0Var, zzadx zzadxVar) {
        i0.e(str);
        i0.i(d0Var);
        i0.i(zzadxVar);
        zzP(str, new zzabu(this, d0Var, zzadxVar));
    }

    public final void zzN(zzagu zzaguVar, zzadx zzadxVar) {
        zzS(zzaguVar, zzadxVar);
    }

    public final void zzg(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzahn zzahnVar = new zzahn();
        zzahnVar.zzf(str);
        zzahnVar.zzi(str2);
        this.zza.zzn(zzahnVar, new zzabx(this, zzadxVar));
    }

    public final void zzh(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        zzP(str, new zzabv(this, str2, zzadxVar));
    }

    public final void zzi(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        zzP(str, new zzabw(this, str2, zzadxVar));
    }

    public final void zzj(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        this.zza.zzl(new zzahj(str, null, str2), new zzaap(this, zzadxVar));
    }

    public final void zzk(String str, String str2, String str3, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        this.zza.zzl(new zzahj(str, str2, str3), new zzaar(this, zzadxVar));
    }

    public final void zzl(String str, String str2, String str3, String str4, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.i(zzadxVar);
        this.zza.zzp(new zzahp(str, str2, null, str3, str4), new zzaag(this, zzadxVar));
    }

    public final void zzm(String str, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzP(str, new zzabp(this, zzadxVar));
    }

    public final void zzn(zzagg zzaggVar, String str, zzadx zzadxVar) {
        i0.i(zzaggVar);
        i0.i(zzadxVar);
        zzP(str, new zzabh(this, zzaggVar, zzadxVar));
    }

    public final void zzo(zzagi zzagiVar, zzadx zzadxVar) {
        i0.i(zzagiVar);
        i0.i(zzadxVar);
        this.zza.zze(zzagiVar, new zzabi(this, zzadxVar));
    }

    public final void zzp(String str, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        this.zza.zzf(new zzagp(str), new zzaaq(this, zzadxVar));
    }

    public final void zzq(zzagw zzagwVar, zzadx zzadxVar) {
        i0.i(zzagwVar);
        i0.i(zzadxVar);
        this.zza.zzi(zzagwVar, new zzabl(this, zzadxVar));
    }

    public final void zzr(String str, String str2, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        this.zza.zza(new zzagb(str, str2), new zzaan(this, zzadxVar));
    }

    public final void zzs(zzagz zzagzVar, zzadx zzadxVar) {
        i0.i(zzagzVar);
        i0.i(zzadxVar);
        this.zza.zzj(zzagzVar, new zzabk(this, zzadxVar));
    }

    public final void zzt(String str, String str2, String str3, zzadx zzadxVar) {
        i0.e(str);
        i0.e(str2);
        i0.e(str3);
        i0.i(zzadxVar);
        zzP(str3, new zzaau(this, str, str2, zzadxVar));
    }

    public final void zzu(String str, zzaic zzaicVar, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzaicVar);
        i0.i(zzadxVar);
        zzP(str, new zzaay(this, zzaicVar, zzadxVar));
    }

    public final void zzv(String str, zzaij zzaijVar, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzaijVar);
        i0.i(zzadxVar);
        zzP(str, new zzaaw(this, zzaijVar, zzadxVar));
    }

    public final void zzw(String str, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzP(str, new zzabn(this, zzadxVar));
    }

    public final void zzx(String str, v9.b bVar, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzagu zzaguVar = new zzagu(4);
        zzaguVar.zzh(str);
        if (bVar != null) {
            zzaguVar.zzd(bVar);
        }
        zzS(zzaguVar, zzadxVar);
    }

    public final void zzy(String str, v9.b bVar, String str2, String str3, zzadx zzadxVar) {
        i0.e(str);
        i0.i(zzadxVar);
        zzagu zzaguVar = new zzagu(bVar.f9223t);
        zzaguVar.zzf(str);
        zzaguVar.zzd(bVar);
        zzaguVar.zzg(str2);
        zzaguVar.zze(str3);
        this.zza.zzh(zzaguVar, new zzaao(this, zzadxVar));
    }

    public final void zzz(zzahl zzahlVar, zzadx zzadxVar) {
        i0.e(zzahlVar.zzd());
        i0.i(zzadxVar);
        this.zza.zzm(zzahlVar, new zzaas(this, zzadxVar));
    }
}
