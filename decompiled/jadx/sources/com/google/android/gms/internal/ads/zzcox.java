package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import d6.p;
import e6.t;
import h6.r0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcox extends zzcrq {
    private final zzcfk zzc;
    private final int zzd;
    private final Context zze;
    private final zzcol zzf;
    private final zzdgv zzg;
    private final zzddp zzh;
    private final zzcwz zzi;
    private final boolean zzj;
    private final zzcad zzk;
    private boolean zzl;

    public zzcox(zzcrp zzcrpVar, Context context, zzcfk zzcfkVar, int i, zzcol zzcolVar, zzdgv zzdgvVar, zzddp zzddpVar, zzcwz zzcwzVar, zzcad zzcadVar) {
        super(zzcrpVar);
        this.zzl = false;
        this.zzc = zzcfkVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcolVar;
        this.zzg = zzdgvVar;
        this.zzh = zzddpVar;
        this.zzi = zzcwzVar;
        this.zzj = ((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfp)).booleanValue();
        this.zzk = zzcadVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrq
    public final void zzb() {
        super.zzb();
        zzcfk zzcfkVar = this.zzc;
        if (zzcfkVar != null) {
            zzcfkVar.destroy();
        }
    }

    public final void zzc(zzazz zzazzVar) {
        zzcfk zzcfkVar = this.zzc;
        if (zzcfkVar != null) {
            zzcfkVar.zzak(zzazzVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void zzd(Activity activity, zzbam zzbamVar, boolean z4) throws RemoteException {
        zzcfk zzcfkVar;
        zzfet zzfetVarZzD;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        zzbce zzbceVar = zzbcn.zzaJ;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            p pVar = p.C;
            r0 r0Var = pVar.f2979c;
            if (r0.e(context)) {
                h.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzaK)).booleanValue()) {
                    new zzfqa(context.getApplicationContext(), pVar.f2992s.a()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzlC)).booleanValue() && (zzcfkVar = this.zzc) != null && (zzfetVarZzD = zzcfkVar.zzD()) != null && zzfetVarZzD.zzar && zzfetVarZzD.zzas != this.zzk.zzb()) {
            h.g("The app open consent form has been shown.");
            this.zzi.zza(zzfgq.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            h.g("App open interstitial ad is already visible.");
            this.zzi.zza(zzfgq.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            this.zzg.zza(z4, context, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdgu e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j4, int i) {
        this.zzf.zza(j4, i);
    }
}
