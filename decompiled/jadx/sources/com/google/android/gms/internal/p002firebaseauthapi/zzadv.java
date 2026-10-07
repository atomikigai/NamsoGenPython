package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n9.g;
import v9.b;
import v9.d;
import v9.e;
import v9.n;
import v9.t;
import v9.v;
import v9.x;
import v9.z;
import w9.b0;
import w9.c;
import w9.d0;
import w9.e0;
import w9.f;
import w9.q;
import w9.w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadv extends zzafc {
    public zzadv(g gVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzady(gVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public static d0 zzS(g gVar, zzags zzagsVar) {
        i0.i(gVar);
        i0.i(zzagsVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b0(zzagsVar));
        List listZzr = zzagsVar.zzr();
        if (listZzr != null && !listZzr.isEmpty()) {
            for (int i = 0; i < listZzr.size(); i++) {
                arrayList.add(new b0((zzahg) listZzr.get(i)));
            }
        }
        d0 d0Var = new d0(gVar, arrayList);
        d0Var.f9826t = new e0(zzagsVar.zzb(), zzagsVar.zza());
        d0Var.f9827u = zzagsVar.zzt();
        d0Var.f9828v = zzagsVar.zzd();
        d0Var.m(r7.g.L(zzagsVar.zzq()));
        return d0Var;
    }

    public final Task zzA(String str) {
        return zzU(new zzadb(str));
    }

    public final Task zzB(g gVar, w wVar, String str) {
        zzadc zzadcVar = new zzadc(str);
        zzadcVar.zzf(gVar);
        zzadcVar.zzd(wVar);
        return zzU(zzadcVar);
    }

    public final Task zzC(g gVar, d dVar, String str, w wVar) {
        zzadd zzaddVar = new zzadd(dVar, str);
        zzaddVar.zzf(gVar);
        zzaddVar.zzd(wVar);
        return zzU(zzaddVar);
    }

    public final Task zzD(g gVar, String str, String str2, w wVar) {
        zzade zzadeVar = new zzade(str, str2);
        zzadeVar.zzf(gVar);
        zzadeVar.zzd(wVar);
        return zzU(zzadeVar);
    }

    public final Task zzE(g gVar, String str, String str2, String str3, String str4, w wVar) {
        zzadf zzadfVar = new zzadf(str, str2, str3, str4);
        zzadfVar.zzf(gVar);
        zzadfVar.zzd(wVar);
        return zzU(zzadfVar);
    }

    public final Task zzF(g gVar, e eVar, String str, w wVar) {
        zzadg zzadgVar = new zzadg(eVar, str);
        zzadgVar.zzf(gVar);
        zzadgVar.zzd(wVar);
        return zzU(zzadgVar);
    }

    public final Task zzG(g gVar, t tVar, String str, w wVar) {
        zzafn.zzc();
        zzadh zzadhVar = new zzadh(tVar, str);
        zzadhVar.zzf(gVar);
        zzadhVar.zzd(wVar);
        return zzU(zzadhVar);
    }

    public final Task zzH(c cVar, String str, String str2, long j4, boolean z4, boolean z10, String str3, String str4, boolean z11, v vVar, Executor executor, Activity activity) {
        zzadi zzadiVar = new zzadi(cVar, str, str2, j4, z4, z10, str3, str4, z11);
        zzadiVar.zzh(vVar, activity, executor, str);
        return zzU(zzadiVar);
    }

    public final Task zzI(c cVar, String str) {
        return zzU(new zzadj(cVar, str));
    }

    public final Task zzJ(c cVar, x xVar, String str, long j4, boolean z4, boolean z10, String str2, String str3, boolean z11, v vVar, Executor executor, Activity activity) {
        String str4 = cVar.f9815b;
        i0.e(str4);
        zzadk zzadkVar = new zzadk(xVar, str4, str, j4, z4, z10, str2, str3, z11);
        zzadkVar.zzh(vVar, activity, executor, xVar.f9281a);
        return zzU(zzadkVar);
    }

    public final Task zzK(g gVar, n nVar, String str, String str2, q qVar) {
        zzadl zzadlVar = new zzadl(((d0) nVar).f9819a.zzh(), str, str2);
        zzadlVar.zzf(gVar);
        zzadlVar.zzg(nVar);
        zzadlVar.zzd(qVar);
        zzadlVar.zze(qVar);
        return zzU(zzadlVar);
    }

    public final Task zzL(g gVar, n nVar, String str, q qVar) {
        i0.i(gVar);
        i0.e(str);
        i0.i(nVar);
        i0.i(qVar);
        List list = ((d0) nVar).f9823f;
        if ((list != null && !list.contains(str)) || nVar.j()) {
            return Tasks.forException(zzadz.zza(new Status(17016, str, null, null)));
        }
        if (str.hashCode() == 1216985755 && str.equals("password")) {
            zzadm zzadmVar = new zzadm();
            zzadmVar.zzf(gVar);
            zzadmVar.zzg(nVar);
            zzadmVar.zzd(qVar);
            zzadmVar.zze(qVar);
            return zzU(zzadmVar);
        }
        zzadn zzadnVar = new zzadn(str);
        zzadnVar.zzf(gVar);
        zzadnVar.zzg(nVar);
        zzadnVar.zzd(qVar);
        zzadnVar.zze(qVar);
        return zzU(zzadnVar);
    }

    public final Task zzM(g gVar, n nVar, String str, q qVar) {
        zzado zzadoVar = new zzado(str);
        zzadoVar.zzf(gVar);
        zzadoVar.zzg(nVar);
        zzadoVar.zzd(qVar);
        zzadoVar.zze(qVar);
        return zzU(zzadoVar);
    }

    public final Task zzN(g gVar, n nVar, String str, q qVar) {
        zzadp zzadpVar = new zzadp(str);
        zzadpVar.zzf(gVar);
        zzadpVar.zzg(nVar);
        zzadpVar.zzd(qVar);
        zzadpVar.zze(qVar);
        return zzU(zzadpVar);
    }

    public final Task zzO(g gVar, n nVar, t tVar, q qVar) {
        zzafn.zzc();
        zzadq zzadqVar = new zzadq(tVar);
        zzadqVar.zzf(gVar);
        zzadqVar.zzg(nVar);
        zzadqVar.zzd(qVar);
        zzadqVar.zze(qVar);
        return zzU(zzadqVar);
    }

    public final Task zzP(g gVar, n nVar, v9.d0 d0Var, q qVar) {
        zzadr zzadrVar = new zzadr(d0Var);
        zzadrVar.zzf(gVar);
        zzadrVar.zzg(nVar);
        zzadrVar.zzd(qVar);
        zzadrVar.zze(qVar);
        return zzU(zzadrVar);
    }

    public final Task zzQ(String str, String str2, b bVar) {
        bVar.f9223t = 7;
        return zzU(new zzads(str, str2, bVar));
    }

    public final Task zzR(g gVar, String str, String str2) {
        zzadt zzadtVar = new zzadt(str, str2);
        zzadtVar.zzf(gVar);
        return zzU(zzadtVar);
    }

    public final void zzT(g gVar, zzahl zzahlVar, v vVar, Activity activity, Executor executor) {
        zzadu zzaduVar = new zzadu(zzahlVar);
        zzaduVar.zzf(gVar);
        zzaduVar.zzh(vVar, activity, executor, zzahlVar.zzd());
        zzU(zzaduVar);
    }

    public final Task zza(g gVar, String str, String str2) {
        zzacb zzacbVar = new zzacb(str, str2);
        zzacbVar.zzf(gVar);
        return zzU(zzacbVar);
    }

    public final Task zzb(g gVar, String str, String str2) {
        zzacc zzaccVar = new zzacc(str, str2);
        zzaccVar.zzf(gVar);
        return zzU(zzaccVar);
    }

    public final Task zzc(g gVar, String str, String str2, String str3) {
        zzacd zzacdVar = new zzacd(str, str2, str3);
        zzacdVar.zzf(gVar);
        return zzU(zzacdVar);
    }

    public final Task zzd(g gVar, String str, String str2, String str3, String str4, w wVar) {
        zzace zzaceVar = new zzace(str, str2, str3, str4);
        zzaceVar.zzf(gVar);
        zzaceVar.zzd(wVar);
        return zzU(zzaceVar);
    }

    public final Task zze(n nVar, f fVar) {
        zzacf zzacfVar = new zzacf();
        zzacfVar.zzg(nVar);
        zzacfVar.zzd(fVar);
        zzacfVar.zze(fVar);
        return zzU(zzacfVar);
    }

    public final Task zzf(g gVar, String str, String str2) {
        zzacg zzacgVar = new zzacg(str, str2);
        zzacgVar.zzf(gVar);
        return zzU(zzacgVar);
    }

    public final Task zzg(g gVar, v9.w wVar, n nVar, String str, w wVar2) {
        zzafn.zzc();
        zzach zzachVar = new zzach(wVar, ((d0) nVar).f9819a.zzh(), str, null);
        zzachVar.zzf(gVar);
        zzachVar.zzd(wVar2);
        return zzU(zzachVar);
    }

    public final Task zzh(g gVar, z zVar, n nVar, String str, String str2, w wVar) {
        zzach zzachVar = new zzach(zVar, ((d0) nVar).f9819a.zzh(), str, str2);
        zzachVar.zzf(gVar);
        zzachVar.zzd(wVar);
        return zzU(zzachVar);
    }

    public final Task zzi(g gVar, n nVar, v9.w wVar, String str, w wVar2) {
        zzafn.zzc();
        zzaci zzaciVar = new zzaci(wVar, str, null);
        zzaciVar.zzf(gVar);
        zzaciVar.zzd(wVar2);
        if (nVar != null) {
            zzaciVar.zzg(nVar);
        }
        return zzU(zzaciVar);
    }

    public final Task zzj(g gVar, n nVar, z zVar, String str, String str2, w wVar) {
        zzaci zzaciVar = new zzaci(zVar, str, str2);
        zzaciVar.zzf(gVar);
        zzaciVar.zzd(wVar);
        if (nVar != null) {
            zzaciVar.zzg(nVar);
        }
        return zzU(zzaciVar);
    }

    public final Task zzk(g gVar, n nVar, String str, q qVar) {
        zzacj zzacjVar = new zzacj(str);
        zzacjVar.zzf(gVar);
        zzacjVar.zzg(nVar);
        zzacjVar.zzd(qVar);
        zzacjVar.zze(qVar);
        return zzU(zzacjVar);
    }

    public final Task zzl() {
        return zzU(new zzack());
    }

    public final Task zzm(String str, String str2) {
        return zzU(new zzacl(str, "RECAPTCHA_ENTERPRISE"));
    }

    public final Task zzn(g gVar, n nVar, d dVar, q qVar) {
        i0.i(gVar);
        i0.i(dVar);
        i0.i(nVar);
        i0.i(qVar);
        List list = ((d0) nVar).f9823f;
        if (list != null && list.contains(dVar.g())) {
            return Tasks.forException(zzadz.zza(new Status(17015, null, null, null)));
        }
        if (dVar instanceof e) {
            e eVar = (e) dVar;
            if (TextUtils.isEmpty(eVar.f9237c)) {
                zzacm zzacmVar = new zzacm(eVar);
                zzacmVar.zzf(gVar);
                zzacmVar.zzg(nVar);
                zzacmVar.zzd(qVar);
                zzacmVar.zze(qVar);
                return zzU(zzacmVar);
            }
            zzacp zzacpVar = new zzacp(eVar);
            zzacpVar.zzf(gVar);
            zzacpVar.zzg(nVar);
            zzacpVar.zzd(qVar);
            zzacpVar.zze(qVar);
            return zzU(zzacpVar);
        }
        if (!(dVar instanceof t)) {
            zzacn zzacnVar = new zzacn(dVar);
            zzacnVar.zzf(gVar);
            zzacnVar.zzg(nVar);
            zzacnVar.zzd(qVar);
            zzacnVar.zze(qVar);
            return zzU(zzacnVar);
        }
        zzafn.zzc();
        zzaco zzacoVar = new zzaco((t) dVar);
        zzacoVar.zzf(gVar);
        zzacoVar.zzg(nVar);
        zzacoVar.zzd(qVar);
        zzacoVar.zze(qVar);
        return zzU(zzacoVar);
    }

    public final Task zzo(g gVar, n nVar, d dVar, String str, q qVar) {
        zzacq zzacqVar = new zzacq(dVar, str);
        zzacqVar.zzf(gVar);
        zzacqVar.zzg(nVar);
        zzacqVar.zzd(qVar);
        zzacqVar.zze(qVar);
        return zzU(zzacqVar);
    }

    public final Task zzp(g gVar, n nVar, d dVar, String str, q qVar) {
        zzacr zzacrVar = new zzacr(dVar, str);
        zzacrVar.zzf(gVar);
        zzacrVar.zzg(nVar);
        zzacrVar.zzd(qVar);
        zzacrVar.zze(qVar);
        return zzU(zzacrVar);
    }

    public final Task zzq(g gVar, n nVar, e eVar, String str, q qVar) {
        zzacs zzacsVar = new zzacs(eVar, str);
        zzacsVar.zzf(gVar);
        zzacsVar.zzg(nVar);
        zzacsVar.zzd(qVar);
        zzacsVar.zze(qVar);
        return zzU(zzacsVar);
    }

    public final Task zzr(g gVar, n nVar, e eVar, String str, q qVar) {
        zzact zzactVar = new zzact(eVar, str);
        zzactVar.zzf(gVar);
        zzactVar.zzg(nVar);
        zzactVar.zzd(qVar);
        zzactVar.zze(qVar);
        return zzU(zzactVar);
    }

    public final Task zzs(g gVar, n nVar, String str, String str2, String str3, String str4, q qVar) {
        zzacu zzacuVar = new zzacu(str, str2, str3, str4);
        zzacuVar.zzf(gVar);
        zzacuVar.zzg(nVar);
        zzacuVar.zzd(qVar);
        zzacuVar.zze(qVar);
        return zzU(zzacuVar);
    }

    public final Task zzt(g gVar, n nVar, String str, String str2, String str3, String str4, q qVar) {
        zzacv zzacvVar = new zzacv(str, str2, str3, str4);
        zzacvVar.zzf(gVar);
        zzacvVar.zzg(nVar);
        zzacvVar.zzd(qVar);
        zzacvVar.zze(qVar);
        return zzU(zzacvVar);
    }

    public final Task zzu(g gVar, n nVar, t tVar, String str, q qVar) {
        zzafn.zzc();
        zzacw zzacwVar = new zzacw(tVar, str);
        zzacwVar.zzf(gVar);
        zzacwVar.zzg(nVar);
        zzacwVar.zzd(qVar);
        zzacwVar.zze(qVar);
        return zzU(zzacwVar);
    }

    public final Task zzv(g gVar, n nVar, t tVar, String str, q qVar) {
        zzafn.zzc();
        zzacx zzacxVar = new zzacx(tVar, str);
        zzacxVar.zzf(gVar);
        zzacxVar.zzg(nVar);
        zzacxVar.zzd(qVar);
        zzacxVar.zze(qVar);
        return zzU(zzacxVar);
    }

    public final Task zzw(g gVar, n nVar, q qVar) {
        zzacy zzacyVar = new zzacy();
        zzacyVar.zzf(gVar);
        zzacyVar.zzg(nVar);
        zzacyVar.zzd(qVar);
        zzacyVar.zze(qVar);
        return zzU(zzacyVar);
    }

    public final Task zzx(g gVar, b bVar, String str) {
        zzacz zzaczVar = new zzacz(str, bVar);
        zzaczVar.zzf(gVar);
        return zzU(zzaczVar);
    }

    public final Task zzy(g gVar, String str, b bVar, String str2, String str3) {
        bVar.f9223t = 1;
        zzada zzadaVar = new zzada(str, bVar, str2, str3, "sendPasswordResetEmail");
        zzadaVar.zzf(gVar);
        return zzU(zzadaVar);
    }

    public final Task zzz(g gVar, String str, b bVar, String str2, String str3) {
        bVar.f9223t = 6;
        zzada zzadaVar = new zzada(str, bVar, str2, str3, "sendSignInLinkToEmail");
        zzadaVar.zzf(gVar);
        return zzU(zzadaVar);
    }
}
