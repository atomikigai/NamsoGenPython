package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import d6.p;
import e6.t;
import h6.r0;
import i6.h;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdor extends zzcrq {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgv zze;
    private final zzddp zzf;
    private final zzcwz zzg;
    private final zzcyg zzh;
    private final zzcsl zzi;
    private final zzbwz zzj;
    private final zzfqa zzk;
    private final zzffh zzl;
    private boolean zzm;

    public zzdor(zzcrp zzcrpVar, Context context, zzcfk zzcfkVar, zzdgv zzdgvVar, zzddp zzddpVar, zzcwz zzcwzVar, zzcyg zzcygVar, zzcsl zzcslVar, zzfet zzfetVar, zzfqa zzfqaVar, zzffh zzffhVar) {
        super(zzcrpVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdgvVar;
        this.zzd = new WeakReference(zzcfkVar);
        this.zzf = zzddpVar;
        this.zzg = zzcwzVar;
        this.zzh = zzcygVar;
        this.zzi = zzcslVar;
        this.zzk = zzfqaVar;
        zzbwv zzbwvVar = zzfetVar.zzl;
        this.zzj = new zzbxt(zzbwvVar != null ? zzbwvVar.zza : "", zzbwvVar != null ? zzbwvVar.zzb : 1);
        this.zzl = zzffhVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfk zzcfkVar = (zzcfk) this.zzd.get();
            if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgB)).booleanValue()) {
                if (!this.zzm && zzcfkVar != null) {
                    zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfkVar.destroy();
                        }
                    });
                }
            } else if (zzcfkVar != null) {
                zzcfkVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwz zzc() {
        return this.zzj;
    }

    public final zzffh zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfk zzcfkVar = (zzcfk) this.zzd.get();
        return (zzcfkVar == null || zzcfkVar.zzaG()) ? false : true;
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
    public final boolean zzh(boolean z4, Activity activity) {
        Context context;
        zzbce zzbceVar = zzbcn.zzaJ;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            r0 r0Var = p.C.f2979c;
            if (r0.e(this.zzc)) {
                h.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzaK)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            h.g("The rewarded ad have been showed.");
            this.zzg.zza(zzfgq.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        if (activity == null) {
            context = activity;
            context = this.zzc;
        }
        try {
            context = activity;
            this.zze.zza(z4, context, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdgu e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
