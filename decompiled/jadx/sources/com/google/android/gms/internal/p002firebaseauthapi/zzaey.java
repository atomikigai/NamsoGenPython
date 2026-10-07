package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;
import n9.g;
import v9.a0;
import v9.d;
import v9.n;
import v9.s;
import v9.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaey implements zzaep {
    private final zzaez zza;
    private final TaskCompletionSource zzb;

    public zzaey(zzaez zzaezVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzaezVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaep
    public final void zza(Object obj, Status status) {
        i0.j(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(obj);
            return;
        }
        zzaez zzaezVar = this.zza;
        if (zzaezVar.zzw == null) {
            d dVar = zzaezVar.zzt;
            if (dVar != null) {
                this.zzb.setException(zzadz.zzb(status, dVar, zzaezVar.zzu, zzaezVar.zzv));
                return;
            } else {
                this.zzb.setException(zzadz.zza(status));
                return;
            }
        }
        TaskCompletionSource taskCompletionSource = this.zzb;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaezVar.zzg);
        zzaez zzaezVar2 = this.zza;
        zzaaf zzaafVar = zzaezVar2.zzw;
        n nVar = ("reauthenticateWithCredential".equals(zzaezVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzh : null;
        int i = zzadz.zzb;
        firebaseAuth.getClass();
        zzaafVar.getClass();
        Pair pair = (Pair) zzadz.zza.get(17078);
        String str = (String) pair.first;
        String str2 = (String) pair.second;
        List<s> listZzc = zzaafVar.zzc();
        ArrayList arrayList = new ArrayList();
        for (s sVar : listZzc) {
            if (sVar instanceof x) {
                arrayList.add((x) sVar);
            }
        }
        List<s> listZzc2 = zzaafVar.zzc();
        ArrayList arrayList2 = new ArrayList();
        for (s sVar2 : listZzc2) {
            if (sVar2 instanceof a0) {
                arrayList2.add((a0) sVar2);
            }
        }
        List<s> listZzc3 = zzaafVar.zzc();
        String strZzb = zzaafVar.zzb();
        i0.i(listZzc3);
        i0.e(strZzb);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (s sVar3 : listZzc3) {
            if (sVar3 instanceof x) {
                arrayList3.add((x) sVar3);
            } else {
                if (!(sVar3 instanceof a0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(sVar3.g()));
                }
                arrayList4.add((a0) sVar3);
            }
        }
        g gVar = firebaseAuth.f2698a;
        gVar.a();
        String str3 = gVar.f7360b;
        zzaafVar.zza();
        i0.e(str3);
        taskCompletionSource.setException(new v9.g(str, str2));
    }
}
