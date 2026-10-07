package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n9.g;
import v9.d;
import v9.n;
import v9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaez implements zzafb {
    Object zzA;
    Status zzB;
    private boolean zza;
    protected final int zze;
    protected g zzg;
    protected n zzh;
    protected Object zzi;
    protected w9.g zzj;
    protected zzaep zzk;
    protected Executor zzm;
    protected zzahb zzn;
    protected zzags zzo;
    protected zzagc zzp;
    protected zzahk zzq;
    protected String zzr;
    protected String zzs;
    protected d zzt;
    protected String zzu;
    protected String zzv;
    protected zzaaf zzw;
    protected zzaha zzx;
    protected zzagx zzy;
    protected zzahs zzz;
    protected final zzaew zzf = new zzaew(this);
    protected final List zzl = new ArrayList();

    public zzaez(int i) {
        this.zze = i;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzaez zzaezVar) {
        zzaezVar.zzb();
        i0.k("no success or failure set on method implementation", zzaezVar.zza);
    }

    public static /* bridge */ /* synthetic */ void zzk(zzaez zzaezVar, Status status) {
        w9.g gVar = zzaezVar.zzj;
        if (gVar != null) {
            gVar.zzb(status);
        }
    }

    public abstract void zzb();

    public final zzaez zzd(Object obj) {
        i0.j(obj, "external callback cannot be null");
        this.zzi = obj;
        return this;
    }

    public final zzaez zze(w9.g gVar) {
        i0.j(gVar, "external failure callback cannot be null");
        this.zzj = gVar;
        return this;
    }

    public final zzaez zzf(g gVar) {
        i0.j(gVar, "firebaseApp cannot be null");
        this.zzg = gVar;
        return this;
    }

    public final zzaez zzg(n nVar) {
        i0.j(nVar, "firebaseUser cannot be null");
        this.zzh = nVar;
        return this;
    }

    public final zzaez zzh(v vVar, Activity activity, Executor executor, String str) {
        List list = this.zzl;
        v vVarZza = zzafn.zza(str, vVar, this);
        synchronized (list) {
            List list2 = this.zzl;
            i0.i(vVarZza);
            list2.add(vVarZza);
        }
        if (activity != null) {
            zzaeq.zza(activity, this.zzl);
        }
        i0.i(executor);
        this.zzm = executor;
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzB = status;
        this.zzk.zza(null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzA = obj;
        this.zzk.zza(obj, null);
    }
}
